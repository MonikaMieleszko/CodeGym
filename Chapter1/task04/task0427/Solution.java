package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        if (a%2 == 0 && a > 0 && a < 1000) {
            if ((a/100) > 0) {
                System.out.println("parzysta liczba trzycyfrowa");
            } else if ((a/10) > 0) {
                System.out.println("parzysta liczba dwucyfrowa");
            } else {
                System.out.println("parzysta liczba jednocyfrowa");
            }
        } else if (a%2 != 0 && a > 0 && a < 1000) {
             if ((a/100) > 0) {
                System.out.println("nieparzysta liczba trzycyfrowa");
            } else if ((a/10) > 0) {
                System.out.println("nieparzysta liczba dwucyfrowa");
            } else {
                System.out.println("nieparzysta liczba jednocyfrowa");
            }
        }

    }
}
