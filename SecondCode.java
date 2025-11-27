import java.util.Scanner;

public class SecondCode {
    public static void main(String[]args){

        System.out.println("Enter two number: ");
        if(sec()>18){
            System.out.println("voted.");
        }else{
            System.out.println("you aren't voter. ");
        }
    }

    public static int sec(){
        // eita reference er example
        Scanner scanner ;
        scanner = new Scanner(System.in);
        //eita class er example
        //Scanner sc = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        return a+b;
    }
}
