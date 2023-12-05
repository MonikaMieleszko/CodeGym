package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        int rok = Integer.parseInt(r);
        
        if ((rok%400)==0 || ((rok%4)==0 && (rok%100)!=0)) {
            System.out.println("Liczba dni w roku: 366");
        } else {
            System.out.println("Liczba dni w roku: 365");
        }
    }
}