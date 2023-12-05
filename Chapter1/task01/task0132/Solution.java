package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {
        int cyfra1 = liczba/100;
        int cyfra2 = (liczba - cyfra1*100)/10;
        int cyfra3 = liczba - cyfra1*100 - cyfra2*10;
        
        return cyfra1+cyfra2+cyfra3;
    }
}