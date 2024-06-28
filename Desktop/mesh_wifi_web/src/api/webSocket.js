// websocket.js
import { v4 as uuidv4 } from 'uuid';

let ws = null;
const pendingPromises = {};

const connectWebSocket = () => {
  ws = new WebSocket('ws://192.168.10.154:3000/app');

  ws.onopen = () => {
    console.log('WebSocket connection established');
  };

  ws.onerror = (error) => {
    console.error('WebSocket error:', error);
  };

  ws.onclose = () => {
    console.log('WebSocket connection closed');
    setTimeout(connectWebSocket, 1000); // 1초 후 재연결 시도
  };

  // Handle messages here if needed
  ws.onmessage = (event) => {
    const message = JSON.parse(event.data);
    const { type, payload } = message;

    const responseType = type + 'Response';
    if (pendingPromises[responseType]) {
      pendingPromises[responseType].resolve(payload);
      delete pendingPromises[responseType];
    }
  };

};

connectWebSocket();

const sendMessage = (type, payload = {}) => {
  return new Promise((resolve, reject) => {
    //1. 메시지 구성
    const message = { type, payload };
    // 2. WebSocket을 통해 메시지 전송
    ws.send(JSON.stringify(message));
    // 3. 메시지 타입에 맞는 pending promise 등록
    const responseType = type + 'Response';
    pendingPromises[responseType] = { resolve, reject };
  });
};

export { sendMessage };