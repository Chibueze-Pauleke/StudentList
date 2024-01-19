/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydemo;

import java.util.Scanner;

/**
 *
 * @author ekech
 */
public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for (int i =0; i<myLetters.length; i++){
            myLetters[i] = myWord.charAt(i);
        }
        
        System.out.print("Print in reverse");
        
        for (int i = myLetters.length-1; i >= 0; i--){
            System.out.println(myLetters[i]);
        }
    }
}
