import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class app {
    public static void main(String[] args) throws IOException{
        int port = 8080; // Puerto por defecto
        if (args.length > 0 && args[0].equals("--port")) {
            port = Integer.parseInt(args[1]); 
        }
        try (ServerSocket server = new ServerSocket(port)) {
            while (true) {
                Socket socket = server.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html");
                out.println();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<body>");
                out.println(" <h1>Hello World!</h1>");
                out.println("</body>");
                out.println("</html>");
                out.close();
                socket.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}