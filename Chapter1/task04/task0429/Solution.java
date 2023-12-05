package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int licznik = 0;
        int nLiczb = 3;
        
        if (a > 0) {
            licznik++;
        } else if (a == 0) { 
            nLiczb--;
        }
        if (b > 0) {
            licznik++;
        } else if (b == 0) { 
            nLiczb--;
            }
        if (c > 0) {
            licznik++;
        } else if (c == 0) { 
             nLiczb--;
            }
        
        System.out.println("Liczba liczb ujemnych: " + (nLiczb - licznik));
        System.out.println("Liczba liczb dodatnich: " + licznik);
    }
}
