package com.socketdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Custom01 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",9999);
        OutputStream os=s.getOutputStream();
        os.write("hello Tcp 我来了".getBytes());
        os.close();
        s.close();
    }
}
