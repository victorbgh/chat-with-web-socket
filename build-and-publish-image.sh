#!/bin/bash
./gradlew build
docker build -t newcaiosantos/curso-chat-ws --platform linux/x86_64 .
docker login
docker push newcaiosantos/curso-chat-ws