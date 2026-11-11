//ANSWER4

import java.util.Scanner;

public class qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("This is a Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is a Isosceles triangle");
        } else {
            System.out.println("This is a Scalene triangle");
        }
    }
}