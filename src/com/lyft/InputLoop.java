package com.lyft;
import java.io.InputStream;
import java.util.Scanner;

public class InputLoop {
  public static void main(String args[]) {
    // To read from stdin:
    VersionMap map = new VersionMap();
    InputStream source = System.in;

        /*
        Or, to read from a file:
        InputStream source = new FileInputStream(filename);

        Or, to read from a network stream:
        InputStream source = socket.getInputStream();
        */

    Scanner in = new Scanner(source);
    while(in.hasNext()){
      String inputLine = in.nextLine(); // Use in.nextLine() for line-by-line reading
      String [] inputWords = inputLine.split(" ");
      String operation = inputWords[0];
      String key = inputWords[1];


       if(operation.equalsIgnoreCase("PUT")){
         int value = Integer.parseInt(inputWords[2]);
         map.PUT(key,value);
       }
       else if (operation.equalsIgnoreCase("GET")){
         if(inputWords.length == 3){
           map.GET(key,Integer.parseInt(inputWords[2]));
         }else{
           map.GET(key);
         }
       }else {
         System.out.println("Invalid Operation ");
       }
      // Process the input here. For example, you could print it out:
      System.out.println("--- Waiting for next input ");
    }
  }
}
