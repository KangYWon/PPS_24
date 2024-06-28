import React, { useState, useEffect } from "react";
import Tree from "react-d3-tree";
import Box from '@mui/material/Box';
import InfoContainer from './infoContainer';
import { fetchNodeData } from '/src/api/api';

const LayerContainer = () => {
    const [nodes, setNodes] = useState(null);
    const [selectedNode, setSelectedNode] = useState(null);
    const [isLoading, setIsLoading] = useState(true); // 로딩 상태를 추적

    useEffect(() => {
        const fetchNodes = async () => {
          try {
            const data = await fetchNodeData(); // Fetch data using the API function
            setNodes(data);
          } catch (error) {
            console.error('Error fetching node data:', error);
          } finally {
            setIsLoading(false);
          }
        };
    
        fetchNodes();
    }, []);

    const handleNodeClick = ({ node }) => {
        setSelectedNode(node); // Update selectedNode state with clicked node data
      };
    

    const renderCustomNodeElement = ({ nodeDatum }) => (
        <g onClick={() => handleNodeClick({ node: nodeDatum })}>
            <circle r="10" fill="steelblue" />
            <text x="-10" y="20" fill="white" textAnchor="middle">{nodeDatum.name}</text>
        </g>
    );

    return (
        <Box sx={{ display: 'flex', height: '100vh' }}>
            <div style={{ flex: 1 }}>
                <Box sx={{ border: '1px solid black', height: '100%', overflow: 'auto', padding: 2 }}>
                    {isLoading ? (
                        <p>Loading...</p>
                    ) : (
                        nodes && (
                            <Tree
                                data={nodes}
                                orientation="vertical"
                                translate={{ x: window.innerWidth / 2, y: 50 }}
                                nodeSize={{ x: 200, y: 200 }}
                                separation={{ siblings: 1, nonSiblings: 2 }}
                                pathFunc="diagonal"
                                renderCustomNodeElement={renderCustomNodeElement}
                                style={{ width: '100%', height: '100%' }}
                            />
                        )
                    )}
                </Box>
            </div>
          
        </Box>
    );
};

export default LayerContainer;
