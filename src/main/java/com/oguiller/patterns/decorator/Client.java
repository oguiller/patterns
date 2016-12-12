package com.oguiller.patterns.decorator;

import java.io.*;

public class Client {

    public static void main(String[] args) {

        Yogurth pauYogurth = new CowYogurth();

        System.out.println(pauYogurth.description());
        System.out.println(pauYogurth.cost());

        ToppingDecorator pauYogurthWithJam = new StrawerryJam(pauYogurth);
        System.out.println(pauYogurthWithJam.description());
        System.out.println(pauYogurthWithJam.cost());

        // Second case Decorator for a FileInputStream
        int c;
        try {
            Client client = new Client();

            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(client.getFile())));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public File getFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("test.txt").getFile());
        return file;
    }

}
