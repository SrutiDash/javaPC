import java.util.Scanner;

public class addressOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the array you want to know about it's address : ");
        int indexN = sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        int addressOfZero = 2122;
        int addressOfN = addressOfZero + sizeOfArray*indexN;
        System.out.println("Address of "+indexN+" index of array of length "+sizeOfArray+" is "+addressOfN);
    }
}
