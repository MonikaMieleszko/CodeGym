package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       int a = 1;
       
       while (a <= 10) {
        int b = 1;
        
           while (b <= 10) {
               System.out.print(a*b + " ");
               b++;
           }
           System.out.println();
           a++;
       }

    }
}
