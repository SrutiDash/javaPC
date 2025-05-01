
import java.util.Arrays;



public class array {
    public static void main(String[] args) {
        //syntax for array :
        //datatype[] variable = new datatype[size];
        //ex :
        // int[] rollno = new int[5];
        // int[] rollnos = {1, 2, 3, 4, 5};
        int[] rollno; //declaring new array
        rollno = new int[2]; //initialisation : actual memory creation
        //object is being created in the heap memory
        //mentioning the size is important
        //for this
        //int[] rollno = new int[5];
        //int[] rollno this happens at compile  time
        // new int[5]; this happends at run time
        //dynamic menory allocation : at runtime, memory is being allocated
        int[] rollnos = {1, 2, 3, 4, 5};
        System.out.println(rollnos[3]);
        rollnos[3] = 6;
        System.out.println(rollnos[3]);
        System.out.println(Arrays.toString(rollnos));
    }
}
