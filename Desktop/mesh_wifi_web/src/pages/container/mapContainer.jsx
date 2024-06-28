import React, { useEffect, useState } from 'react';
import { MapContainer, TileLayer, CircleMarker, Polyline, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import Box from '@mui/material/Box';
import { fetchGpsData } from '/src/api/api'

const center = [36.103774, 129.388557]; // Default center coordinates

export default function mapContainer() {
    const [nodes, setNodes] = useState([]);
    const [connections, setConnections] = useState([]);

    useEffect(() => {
        // 서버로부터 GPS 데이터 가져오기
        fetchGpsData()
          .then(data => {
            setMarkers(data); 
            // 필요한 경우 연결 데이터 설정도 여기서 처리
          })
          .catch(error => {
            console.error('Error fetching GPS data:', error);
          });
      }, []);

      const layerColors = {
        // 예제 레이어 색상 설정, 필요에 따라 수정
        1: 'red',
        2: 'green'
    };
    
    return (
      <Box sx={{ flex: 2, border: '1px solid black' }}>
          <MapContainer center={center} zoom={17} style={{ height: '100%', width: '100%' }}>
              <TileLayer
                  url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                  attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
              />
              {nodes.map(node => (
                  <CircleMarker
                      key={node.id}
                      center={[node.latitude, node.longitude]}
                      radius={10}
                      color={layerColors[node.layer] || 'blue'}
                      fillColor={layerColors[node.layer] || 'blue'}
                      fillOpacity={0.5}
                  >
                      <Popup>
                          {node.label}<br />Current Layer {node.layer}
                      </Popup>
                  </CircleMarker>
              ))}
              {connections.map((conn, index) => {
                  const fromNode = nodes.find(node => node.id === conn.from);
                  const toNode = nodes.find(node => node.id === conn.to);
                  return (
                      <Polyline
                          key={index}
                          positions={[[fromNode.latitude, fromNode.longitude], [toNode.latitude, toNode.longitude]]}
                          color="blue"
                      />
                  );
              })}
          </MapContainer>
      </Box>
  );
}