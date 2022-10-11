/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author TJ
 */
public class Gabriel_Adeife_Lab2_PartB {
    
    public static void main(String[] args){
    int [] randArr = new int[30];
    int [] count = new int[100];
    int temp = 0;
    for (int i = 0; i < randArr.length; i++){
    randArr[i] = (int)(100 * Math.random());
    }
   
    for (int i = 0; i < randArr.length; i++){
        temp = randArr[i];
        count[temp]++;    
    }
    
    for (int i = 0; i < count.length; i++){
        if(count[i] > 0 && count[i] == 1){
            System.out.printf("%d occurs %d time\n",i, count[i]);
        }
        else if (count[i] >= 2){
            System.out.printf("%d occurs %d times\n", i, count[i]);
        }
    }
    
}
    
}