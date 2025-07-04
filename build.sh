#!/bin/bash
find . -type f -name "*.sh" -exec chmod +x {} \;

cd docker
./build.sh
