package clienserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static  final int port = 5555;
    private String MSG = "Клиент '%d' отправил мне сообщение: \n\t";
    private String  CONN = " Клиент '%d'закрыл ссоединение";
    private Socket socket;
    private int num;

    public void setSocket(int num, Socket socket){
        this.num = num;
        this.socket = socket;

//        start();
    }
//    public void run(){
//        try { (DataInputStream dis = new DataInputStream(socket.getInputStream());
//            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//            String line;
//            while (true){
//                line = dis.readUTF();
//                System.out.printf(MSG, num);
//                System.out.println(line);
//                System.out.println("отправляю обратно...");
//                dos.writeUTF("Сервер получает текст:" + line);
//                dos.flush();
//                System.out.println();
//                if (line.equalsIgnoreCase("quit")){
//                    socket.close();
//                    System.out.printf(CONN, num);
//                }
//
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
    public static void main(String[] args){
        ServerSocket srvSocket = null;
        try{
            try {
                int i = 0;
                InetAddress ia = InetAddress.getByName("localhost");
                srvSocket = new ServerSocket(port, 0, ia);
                System.out.println("Сервер запущен");

                while (true) {
                    Socket socket = srvSocket.accept(); // ожидание подключения клиента
                    System.err.println("\n\nКлиент принят");
                    new Server().setSocket(i++, socket);



                }

            } catch (Exception e){
                System.out.println("исключение: " + e);
            }
    } finally {
            try {
                if (srvSocket != null) {
                    srvSocket.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        }
}
