package com.javarush.oldtasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        String reader = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        return reader;
    }
    public static int readInt() throws Exception {
        int reader = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        return reader;
    }
    public static double readDouble() throws Exception {
        double reader = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());
        return reader;
    }
    public static boolean readBoolean() throws Exception {
        boolean reader = Boolean.parseBoolean((new BufferedReader(new InputStreamReader(System.in))).readLine());
        return reader;
    }

    public static void main(String[] args) throws Exception {

    }

}
