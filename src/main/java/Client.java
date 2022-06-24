import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        String Ip = "netology.homework";
        int port = 8888;
        Socket clientSocket = new Socket(Ip, port);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));

        out.println("Client"); //Отправляем инифю на сервер
        out.flush();

        System.out.println(in.readLine()); //Выводим полученную инф-ю от сервера

    }
}
