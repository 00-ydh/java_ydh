package ch08;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("입력한값: " + num);

        for(int i = 1; i<=9; i++){

            System.out.println(num+" * " + i + " = " + (num * i));
        }
    }
}
