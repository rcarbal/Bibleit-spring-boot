package base_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {
        // if local host doesn't work you can try to pass 127.0.0.1
        try(Socket socket = new Socket("localhost", 5000)){
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            /*
            We use a do while loop, because we want the loop to execute at least once, because we will have no idea
            how many times the code will execute
             */
            do{
                System.out.println("Enter String to be echoed: ");
                echoString = scanner.nextLine();

                // PrintWriter is being used to send the string to the server
                stringToEcho.println(echoString);
                if(!echoString.equals("exit")){
                    response = echoes.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));
        }
        catch (IOException e){
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
