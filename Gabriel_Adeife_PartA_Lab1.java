/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TJ
 */
import java.util.Scanner;


public class Gabriel_Adeife_PartA_Lab1 {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(3.1415/6));

        System.out.println("The area of the hexagon is " + area);
    }
}