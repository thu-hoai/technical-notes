<b>WEB SERVER</b>

It's a networking server that sits on a physical server and waits for a client to send a request.
When it receives a request, it generate a response and sends it back to the client.
The communication between a client and a server happends using HTTP protocol.

How it works
The Web server creates a listening socket and starts the web server creates a listening socket and starts accpeting new connections in a loop.
The client initiates a TCP connection and after successfully establishing it, the client sends an HTTP request to the server and the server responds with an HTTP response that gets displayed to the user. To establish a TCP connection both clients and servers use sockets.

```java

```