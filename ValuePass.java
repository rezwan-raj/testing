public class ValuePass {
    public static void main(String[]args){
         System.out.println(r("raj",10));

    }
    public static String r(String name,float a){
        String sum;
        sum = name + String.valueOf(a);
        return sum;
    }
}
