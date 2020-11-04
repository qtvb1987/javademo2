package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("D:\\aaa.txt"));
        fos.write(97);
        fos.write(98);
        fos.close();
        FileOutputStream fos2=new FileOutputStream("D:\\bbb.txt");
        byte[] b1={65,66,67};
        fos2.write(b1);
        fos2.close();
    }
}
