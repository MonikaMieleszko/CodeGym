package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       String komunikat;
       
       if (a > 0) {
            komunikat = a%2 == 0 ? "Dodatnia liczba parzysta" :"Dodatnia liczba nieparzysta";
        } else if (a < 0) {
            komunikat = a%2 == 0 ? "Ujemna liczba parzysta" : "Ujemna liczba nieparzysta";
        } else {
            komunikat = "Zero";
           }
           
        System.out.println(komunikat);
       }
    }
