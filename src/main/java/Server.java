import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket clientSocket = serverSocket.accept(); //Ждем подключения

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("New connection accepted");
            String name = in.readLine(); //Получаем переданную инфу от клиента и записываем в переменную

            out.println(String.format("Hi %s, your port is %d", name, clientSocket.getPort())); //Отправляем инф-ю клиенту
            out.flush();

        }
    }
}
