package pl.codegym.task.task02.task0216;

/* 
Najmniejsza z trzech liczb
*/

public class Solution {
    public static int min(int a, int b, int c) {
        int min = 0;
        if (a < b) {
            if (a <= c) {
                min = a;
            } else { min = c;
            }
          }
       else if (b <= c) {
                min = b;
            }
        else {
                min = c;
            }
        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
