package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int max = 0;
        
        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= c && b >= d){
            max = b;
        } else if (c >= d){
            max = c;
        } else {
            max = d;
        }
        
        System.out.println(max);
    }
}
