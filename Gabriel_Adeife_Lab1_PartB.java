/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TJ
 */

import java.util.Scanner;
public class Gabriel_Adeife_Lab1_PartB {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);    
    System.out.print("Enter a string with five lowercase letters: ");
    String s = input.next();
    if(s.length() != 5) System.out.println("Not the correct amount of characters!");
    if(s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) System.out.println("It is a palindrome!");
    else System.out.println("It is not a palindrome!");
    }
}
