public class pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //space
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }

            //space
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
