#!/bin/bash

sleep 5
echo "Starting EventServer..."
nohup /calypso/calypso-16.1.0.39/deploy-local/DEV16/eventServer.sh > $1/Scripts/Logs/eventServer-logs.out 2>&1 &
sleep 15
echo "Starting DataServer..."
nohup /calypso/calypso-16.1.0.39/deploy-local/DEV16/dataServer.sh > $1/Scripts/Logs/dataServer-logs.out 2>&1 &
sleep 30




