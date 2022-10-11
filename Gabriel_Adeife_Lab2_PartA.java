/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author TJ
 */
public class Gabriel_Adeife_Lab2_PartA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integer numbers: ");
        int [] arr;
        arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i = 9; i >= 0; i--){
            System.out.println(arr[i]);
        }
        
    }
    
}
