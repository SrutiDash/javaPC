public class pattern12 {
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
            }
            System.out.println(" ");
        }
    }
}
