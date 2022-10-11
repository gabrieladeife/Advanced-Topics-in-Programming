/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TJ
 */
public class Gabriel_Adeife_Lab1_PartC {
  public static void main(String[] args){
      int a = (int)(Math.random() * 9) + 1;
      System.out.println("First number is " +a);
      int b = (int)(Math.random() * 9) + 1;
      System.out.println("Second number is " +b);
      
      if(a % b == 0) System.out.println(a+ " is divisible by " +b);
      else System.out.println(a+ " is not divisible by " +b);
  }  
}
