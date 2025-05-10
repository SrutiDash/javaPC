public class pattern13 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int start = 0;
            if(i%2==0){
                start = 0;
            }else{
                start = 1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1-start;       //flipping it for 1 to 0 or 0 to 1
            }
            System.out.println(" ");
        }
    }
}
