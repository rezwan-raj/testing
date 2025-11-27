import java.sql.SQLOutput;
import java.util.Scanner;

public class secondcode {
    public static void main(String[]args){
    second();
    }
    public static int second(){
        System.out.println("Input two number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a+b==20){
            System.out.println(" sum is 20.");
        }else{
            System.out.println("sum is not 20");
        }
        return a+b;
    }
}
