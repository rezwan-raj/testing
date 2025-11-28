package testing;

import java.util.Scanner;

public class BooleanUseNegPos {
    public static void main(String[]args){

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer number: ");
            int num = sc.nextInt();
            if (pos(num)) {
                System.out.println("number is positive");
            } else if (num == 0) {
                System.out.println("number is zero");
            } else {
                System.out.println("number is negative");
            }
        }

    }
    public static  boolean pos(int a){
        return a>0;
    }
}
