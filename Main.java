import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Print();
    }
    public static void Print(){
        System.out.println("Print 1 to 100: ");
        for(int i = 1;i<=100;i++){
            System.out.print(" "+i);
        }
    }
}