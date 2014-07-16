package com.epam;

import java.io.*;

public class Runner {
    private static StringBuilder str = new StringBuilder();

    private static void reading() throws IOException {
        File in = new File("input.txt");
        try {
            FileReader reader = new FileReader(in);
            int n;
            while ((n = reader.read()) != -1) {
                char c = (char) n;
                if (c != 'a' && c != 'e' && c != 'y') {
                    str.append(c);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writing() throws IOException {
        File out = new File("output.txt");
        try {

            FileWriter writer = new FileWriter(out);
            writer.write(str.toString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        reading();
        writing();


    }
}
