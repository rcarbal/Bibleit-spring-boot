package base_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) {

            // while reading the data from the client you want to use an infinite loop until you don't need it anymore.
            while(true){
                // accepts until a client connects to the server
                Socket socket = serverSocket.accept();
                System.out.println("Client Connected");

                /*
                 common practice is to wrap the input string with the BufferedReader and the string output with the
                 PrintWriter
                 @true on the PrintWriter  specifies if you want to automatically flush the output stream the PrintWriter
                 is using. If you don't specify true you will have to call the flush() after every stream to endure that
                 all the data is sent.
                 */

                BufferedReader input = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                String echoString = input.readLine();
                if(echoString.equals("exit")){
                    break;
                }
                System.out.println("Echo from server: " + echoString);
            }

        } catch(IOException e){
            System.out.println("Server exception" + e.getMessage());
        }
    }
}
