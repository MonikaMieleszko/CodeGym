package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double reszta = t % 5; // światło dla pieszych działa w cyklu co 5 minut
        
        if (reszta >=0 && reszta < 3) {
            System.out.println("zielone");
        } else if (reszta >= 3 && reszta < 4) {
            System.out.println("żółte");
        } else {
            System.out.println("czerwone");
        }
    }
}