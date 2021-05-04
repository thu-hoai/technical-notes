import socket
import time

SERVER_ADDRESS = (HOST, PORT) = '', 8888
REQUEST_QUEUE_SIZE = 5

def handle_request(client_connection):
    request = client_connection.recv(1024)
    print(request.decode())
    http_response = b"""\
HTTP/1.1 200 OK

Hello, World!
"""
    client_connection.sendall(http_response)
    time.sleep(10)  # sleep and block the process for 60 seconds

def serve_forever():
    # Create a TCP/IP socket
    listen_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    # Set socket options
    listen_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    # Bind the address
    listen_socket.bind(SERVER_ADDRESS)
    # makes the socket a listening socket
    listen_socket.listen(REQUEST_QUEUE_SIZE)
    print('Serving HTTP on port {port} ...'.format(port=PORT))

    while True:
        client_connection, client_address = listen_socket.accept()
        handle_request(client_connection)
        client_connection.close()


if __name__ == '__main__':
    serve_forever()