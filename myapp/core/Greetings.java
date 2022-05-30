package myapp.core;

import java.io.*;

public class Greetings {
  
  // write the entry point
  public static void main(String[] args) {
    // Get the console
    Console cons = System.console();

    // Read from input
    String name = cons.readLine("What is your name?");
    
    if (name.length()>0) {
    System.out.printf("[%d] Hello %s. Nice to meet you.\n", 10, name);
  } 
  else 
  {
    System.err.println("You have not told me your name");
  }
}
}


