package pl.codegym.task.task02.task0217;

/* 
Najmniejsza z czterech liczb
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
     int min = min(a, b);
     
	if (d < min) { 
    min = d;
    }
    else if (c < min) {
    min = c;
    }
    return min;
    }

    public static int min(int a, int b) {
     return (a < b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
