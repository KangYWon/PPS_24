import React from 'react';
import Box from '@mui/material/Box';

export default function InfoContainer({ selectedNode }) {
  return (
    <Box sx={{ flex: 1, border: '1px solid black', padding: 2}}>
      {/* 서버로부터 받은 데이터 출력 또는 노드 정보 출력 */}
      {selectedNode ? (
        <div>
          <h2>{selectedNode.name}</h2>
          <p>Layer: {selectedNode.layer}</p>
          <p>Parent Mac: {selectedNode.parentMac}</p>
        </div>
      ) : (
        <div>
          <h2>Node Information</h2>
          <p>Layer: N/A</p>
          <p>Parent Mac: N/A</p>
        </div>
      )}
    </Box>
  );
}
