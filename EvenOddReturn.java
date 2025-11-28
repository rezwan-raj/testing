package testing;

import java.util.Scanner;

public class EvenOddReturn {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        raj(a);
    }
    public static int raj(int a){

        if(a%2==0){
            System.out.println("Even number.");

        }else{
            System.out.println("Odd nummber.");
        }
        return a;
    }
}
