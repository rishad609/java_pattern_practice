//ANSWER1

import java.util.*;
public class qn1{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter a number");
    int num = scanner.nextInt();
    if(num%5==0&&num%7!=0){
      System.out.println("Divisible by 5 Only");
    }
    else if(num%7==0&&num%5!=0){
      System.out.println("Divisible by 7 Only");
    }
    else if(num%7==0&&num%5==0){
      System.out.println("Invalid:Divisible by Both");
    }
    else {System.out.println("NO");}      
  }
}