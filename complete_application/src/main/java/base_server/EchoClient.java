package base_server;

import java.io.IOException;
import java.net.ServerSocket;

public class EchoClient {

    public static void main(String[] args) {
        // if local host doesn't work you can try to pass 127.0.0.1
        try(ServerSocket socket = new ServerSocket( 5000)){
            while (true){
                new Echoer(socket.accept()).start();
            }
        }
        catch (IOException e){
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
