/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author hannaan
 */

public class MAIN {

    public static void main(String[] args) {
        int[] array = {0, 5, 3, 2, 1, 0, 0, 2, 1, 0};
        
        for (int counter = 1; counter < array.length; counter++) {
            
            if (counter == 10) {
                System.out.printf("%5d: ", 1000);
            }
            else {
                System.out.printf("%03d-%03d: ", 
                        (counter-1) * 100 + 200 , (counter * 100 + 100) + 99);
            }
            
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
           
    }
}
