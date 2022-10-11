/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author TJ
 */
public class Gabriel_Adeife_Lab2_PartC {
    public static void main(String[] args){
        
        System.out.print("Plate number: ");
        
        int [] plateLetter = new int[3];
        for(int i = 0; i < plateLetter.length; i++){
            plateLetter[i] = (int)(Math.random() * 26) + 65;
            System.out.printf("%c",plateLetter[i]);
        }
        int num = 0;
        
        for(int i = 0; i < 4; i++){
            num = (int)(Math.random() * 9);
            System.out.printf("%d", num);
        }
       
    }
}
