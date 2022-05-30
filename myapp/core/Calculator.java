package myapp.core;

import java.io.*;

public class Calculator {
  
  public static void main(String[] args) {
    
    float result = 0;
    Console cons = System.console();
    
    String operand1 = cons.readLine("Enter your first operand:\n");
    int op1 = Integer.parseInt(operand1.trim());

    String operand2 = cons.readLine("Enter your second operand:\n");
    int op2 = Integer.parseInt(operand2.trim());

    String operator = cons.readLine("Please choose an Operator:(add, div, sub, mul):\n");

    switch(operator.trim().toLowerCase()) {
      case "add":
      result = (float)(op1 + op2);
      break;
  
      case "div":
      if(op2 == 0) 
      {
        break;
      } else 
      {
      result = ((float)op1 / (float)op2);
    }
      break;
  
      case "sub":
      result = (float)(op1 - op2);
      break;
  
      case "mul":
      result = (float)(op1* op2);
      break;
  
      default:
      System.out.println("Error, please try again");
      break;
    }

    if(op2 == 0) {
      System.out.println("Error, please try again");
    }
    else {
    System.out.printf("Result: %d %s %d = %.3f\n", op1, operator, op2, result);
    }
  }
}