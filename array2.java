
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 56;
        array[1] = 52;
        array[2] = 50;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);  //printing indexes separately
        System.out.println(Arrays.toString(array)); //printing array using Arrays.toString method
    }
}
