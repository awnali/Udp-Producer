# Udp-Client
Java Spring boot UDP Client - Send Messages to UDP Server
## Build Build
- mvn install
- docker build . -t "udp-client"
- docker run -p 8089:8089 IMAGE_ID
## Test
- Hit localhost:8089/message/test to send message
- You can setup UDP server using, https://github.com/awnali/udp-Receiver
