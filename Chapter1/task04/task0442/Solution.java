package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (true) {
            int liczba = scanner.nextInt();
            suma += liczba;
            if(liczba ==-1) {
            break;
            }
        }
        System.out.println(suma);
    }
}
