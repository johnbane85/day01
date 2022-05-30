package myapp.core;

import java.io.*;
import java.util.Scanner;

public class ChallengeOne {
  
public static void main(String[] args) {

  int firstNumber, secondNumber;

  Console cons = System.console();
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter Frist Number:");
  firstNumber = scan.nextInt();

  System.out.println("Enter Second Number:");
  secondNumber = scan.nextInt();


  String operator = cons.readLine("Choose an Operator:(add, div, sub, mul):");
  scan.close();

  switch(operator.trim().toLowerCase()) {
    case "add":
    System.out.println(firstNumber + secondNumber);
    break;

    case "div":
    if(secondNumber == 0) 
    {
      System.out.println("Error Please enter again");
    } else 
    {
    System.out.println((float)firstNumber / (float)secondNumber);
  }
    break;

    case "sub":
    System.out.println(firstNumber - secondNumber);
    break;

    case "mul":
    System.out.println(firstNumber * secondNumber);
    break;

    default:
    System.out.println("Error, please try again");
    break;
  }
  

}

}
