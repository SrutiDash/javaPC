public class printPattern5 {
    public static void main(String[] args) {
        int n = 4;
        float n2 = n;
        long n4 = 5;
        //int n3 = (long)n4;
        //System.out.println(n3);

        
        System.out.println(n);
        System.out.println(n2);
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
 