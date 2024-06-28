import React, { useState, useEffect } from 'react';
import { Container, Grid, Paper, Typography, Table, TableBody, TableCell, TableHead, TableRow } from '@mui/material';
//import { MapContainer, TileLayer, CircleMarker, Polyline, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import { fetchMeasurementData } from '/src/api/api';

const AnalyticsPage = () => {
  //const [nodes, setNodes] = useState(Array.from({ length: 10 }, (_, index) => ({ id: index, label: `Node ${index}`, coordinates: [36.1, 129.4], layer: Math.floor(Math.random() * 3) + 1 })));
  const [nodes, setNodes] = useState(Array.from({ length: 10 }, (_, index) => ({
    id: index,
    label: `Node ${index + 1}`, // 1부터 시작하도록 수정
    coordinates: [36.1, 129.4],
    layer: Math.floor(Math.random() * 3) + 1
  })));
  const [throughputResults, setThroughputResults] = useState(Array.from({ length: 10 }, () => Array.from({ length: 7 }, () => '-')));
  const [latencyResults, setLatencyResults] = useState(Array.from({ length: 10 }, () => Array.from({ length: 7 }, () => '-')));
  const [error, setError] = useState('');

  useEffect(() => {
    const fetchData = async () => {
      try {
        const data = await fetchMeasurementData();
        const { nodes, throughputResults, latencyResults, connections } = data;

        setNodes(nodes);
        setThroughputResults(throughputResults);
        setLatencyResults(latencyResults);
        setConnections(connections);
      } catch (error) {
        console.error('Error fetching measurement data:', error);
        setError('측정 데이터를 불러오는 데 실패했습니다.');
      }
    };

    fetchData();
  }, []); // 빈 배열을 넘겨 한 번만 실행되도록 설정

  const tableStyle = {
    minHeight: '300px',
  };

  const cellStyle = {
    fontSize: '0.840rem',
    textAlign: 'center',
    border: '1px solid rgba(224, 224, 224, 1)',
    position: 'relative', // 위치 지정을 위해 필요
    backgroundColor: '#fff', // 기본 배경색 설정
  };

  const layerColors = {
    1: 'red',
    2: 'green',
    3: 'blue',
  };

  return (
    <Container maxWidth="lg" style={{ backgroundColor: '#f5f5f5', padding: '20px', borderRadius: '8px' }}>
      <Typography variant="h4" gutterBottom align="center" style={{ marginBottom: '30px' }}>
        Analytics
      </Typography>
      <Grid container spacing={4} direction="column">
        <Grid item xs={12}>
          <Paper elevation={3} style={{ padding: '20px', ...tableStyle }}>
            <Typography variant="h6" gutterBottom align="center">
              Throughput 측정 결과
            </Typography>
            <Table>
              <TableHead>
                <TableRow>
                  <TableCell sx={cellStyle}></TableCell>
                  {nodes.map(node => (
                    <TableCell key={node.id} sx={cellStyle}>
                      {node.label}
                    </TableCell>
                  ))}
                </TableRow>
              </TableHead>
              <TableBody>
                {nodes.map((node, rowIndex) => (
                  <TableRow key={node.id}>
                    <TableCell sx={cellStyle}>
                      {node.label}
                    </TableCell>
                    {nodes.map((_, colIndex) => (
                      <TableCell key={colIndex} sx={cellStyle}>
                        {throughputResults[rowIndex][colIndex]}
                      </TableCell>
                    ))}
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </Paper>
        </Grid>
        <Grid item xs={12}>
          <Paper elevation={3} style={{ padding: '20px', ...tableStyle }}>
            <Typography variant="h6" gutterBottom align="center">
              Latency 측정 결과
            </Typography>
            <Table>
              <TableHead>
                <TableRow>
                  <TableCell sx={cellStyle}></TableCell>
                  {nodes.map(node => (
                    <TableCell key={node.id} sx={cellStyle}>
                      {node.label}
                    </TableCell>
                  ))}
                </TableRow>
              </TableHead>
              <TableBody>
                {nodes.map((node, rowIndex) => (
                  <TableRow key={node.id}>
                    <TableCell sx={cellStyle}>
                      {node.label}
                    </TableCell>
                    {nodes.map((_, colIndex) => (
                      <TableCell key={colIndex} sx={cellStyle}>
                        {latencyResults[rowIndex][colIndex]}
                      </TableCell>
                    ))}
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </Paper>
        </Grid>
      </Grid>
    </Container>
  );  
  
};

export default AnalyticsPage;
