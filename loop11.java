public class loop11 {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            if(i==3 || i==8){
                continue;
            } 

            if(i>=15){
                break;
            }  
            System.out.println(i);
        }
        
    }
}
