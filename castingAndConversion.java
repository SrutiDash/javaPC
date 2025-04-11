import java.util.Scanner;

public class castingAndConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //typecasting 
        //compressing the bigger type into smaller data type explicitly

        int num2 = (int)(24.88);
        System.out.println(num2); //gives an output of 24

        //automatic type promotion in expression

        int a = 254;  //max is 256
        System.out.println(a);
        byte b = (byte)(a);
        System.out.println(b);  //256%254 = -2
        System.out.println(a);
        byte c = 100;
        int d = (a*b)/c;
        System.out.println(d);

        // byte j = 229
        // j = j*24;
        //these will give error as any operations performed
        //in byte is automatically being converted into int
        //so in this case int cannot be stored in int

        //ASCI Value
        int num3 = 'a';
        System.out.println(num3);
    }
}
