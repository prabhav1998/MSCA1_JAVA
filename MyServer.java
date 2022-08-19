import java.net.*;
import java.io.*;

public class MyServer {

    public static void main(String[] args) {

        int port = 9999; // just a random port. make sure you enter something between 1024 and 65535.

        try {
            // create a server socket and bind it to the above port number.
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for a client...");

            // make the server listen for a connection, and let you know when it gets one.
            Socket socket = ss.accept();
            System.out.println("Got a client :) ... Finally, someone saw me through all the cover!");
            System.out.println();

            // Get the input and output streams of the socket, so that you can receive and send data to the client.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Just converting them to different streams, so that string handling becomes easier.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            String line = null;

            while (true) {
                line = in.readUTF(); // wait for the client to send a line of text.
                System.out.println("The dumb client just sent me this line : " + line);
                System.out.println("I'm sending it back...");
                out.writeUTF(line); // send the same line back to the client.
                out.flush(); // flush the stream to ensure that the data reaches the other end.
                System.out.println("Waiting for the next line...");
                System.out.println();
            }

        } 
        catch (Exception x) {
            x.printStackTrace();
        }

    }
}
