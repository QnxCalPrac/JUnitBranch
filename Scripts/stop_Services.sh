#!/bin/bash
pid=$(ps -ax | grep "server" |grep -v grep | cut -f 1,2 -d ' ')
echo "Killing Calyso process"
for pid in $(ps -ef | grep "server" |grep -v grep | awk '{print $2}');
do kill -9 $pid;
done

