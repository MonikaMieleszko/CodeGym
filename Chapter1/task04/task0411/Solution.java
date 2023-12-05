package pl.codegym.task.task04.task0411;

/* 
Pory Roku na Terze
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPoreRoku(12);
        sprawdzPoreRoku(4);
        sprawdzPoreRoku(7);
        sprawdzPoreRoku(10);
    }

    public static void sprawdzPoreRoku(int miesiac) {
        if (miesiac >= 3 && miesiac <= 5) {
            System.out.println("wiosna");
        }
        else if (miesiac >= 6 && miesiac <= 8) {
            System.out.println("lato");
        }
        else if (miesiac >= 9 && miesiac <= 11) {
            System.out.println("jesień");
        }
        else {
            System.out.println("zima");
        }
    }
}