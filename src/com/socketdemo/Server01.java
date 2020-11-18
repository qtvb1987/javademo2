package com.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端开启...");
        ServerSocket serverSocket=new ServerSocket(9999);
        Socket socket=serverSocket.accept();
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        is.close();
        socket.close();
    }
}
