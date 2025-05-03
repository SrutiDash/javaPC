public class printPattern1 {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++){  //here the upper for loop is row
            for(int i=1;i<=4;i++){ //here the lower for loop is column
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
