import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int[][] marks;
        marks = new int[3][5];
        marks[0][0] = 111;
        marks[0][1] = 112;
        marks[0][2] = 113;
        marks[0][3] = 114;
        System.out.println(Arrays.deepToString(marks));
        System.out.println(Arrays.toString(marks[0]));
        System.out.println("sruti dash");
        System.out.println("sruti dash");
    }
}
