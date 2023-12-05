package pl.codegym.task.task04.task0420;

/* 
Sortowanie trzech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int pierwsza = 0;
        int druga = 0;
        int trzecia = 0;
        
        if (a > b && a > c) {
            pierwsza = a;
            if (b > c) {
                druga = b;
                trzecia = c; 
            } else {
                druga = c;
                trzecia = b;
            }
        }
        else if (b > c) {
            pierwsza = b;
         if (a > c) {
                druga = a;
                trzecia = c; 
            } else {
                druga = c;
                trzecia = a;
            }
        } else {
            pierwsza = c;
             if (a > b) {
                druga = a;
                trzecia = b; 
            } else {
                druga = b;
                trzecia = a;
        }
    }
    
    System.out.println(pierwsza + " " + druga + " " + trzecia);
    }
}
