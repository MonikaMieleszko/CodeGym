package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a > b && a > c){
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (a < b && a < c) {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else {
            System.out.println(a);
        }
    }
}
