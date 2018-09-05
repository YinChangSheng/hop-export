package com.ydonglai.hopexport;

import java.io.*;
import java.net.URL;

public class App {
    public static void main( String[] args ) throws IOException {
        URL url = Thread.currentThread().getContextClassLoader().getResource("111.txt");
        System.out.println(url.getFile());
        BufferedReader reader = new BufferedReader(new FileReader(url.getFile()));
        StringBuilder builder = new StringBuilder();
        String str = reader.readLine();
        while (str != null) {
            builder.append(str).append("\n");
            str = reader.readLine();
        }
        System.out.println(builder.toString());
    }
}
