package com.lyft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class InputLoop {


    public static void main(String args[]) throws FileNotFoundException {
        String filename = "resources/input.txt";

        InputStream source = new FileInputStream(filename);
        Scanner in = new Scanner(source);
        while(in.hasNext()){
            String input = in.nextLine();

            // Process the input here. For example, you could print it out:
            System.out.println(input);
        }
    }
}