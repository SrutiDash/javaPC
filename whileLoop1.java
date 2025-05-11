import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        //infinite while loop unless and until anything has been instructed to break it
        boolean learn = false;
        while(!learn){
            System.out.println("went to school");
            System.out.println("have your learn anything?");
            learn = sc.nextBoolean();
        }
    }
}
