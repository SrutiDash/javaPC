public class continueStatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==3 || i==8){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
