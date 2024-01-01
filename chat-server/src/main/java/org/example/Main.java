package org.example;

// Разработайте простой чат на основе сокетов как это было показано на самом семинаре.
// Ваше приложение должно включать в себя сервер, который принимает сообщения от клиентов
// и пересылает их всем участникам чата.
// Подумайте, как организовать отправку ЛИЧНЫХ сообщений в контексте нашего чата,
// доработайте поддержку отправки личных сообщений.

import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1400);
            Server server = new Server(serverSocket);
            server.runServer();
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
