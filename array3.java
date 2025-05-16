public class array3 {
    public static void main(String[] args) {
        String[] names = {"sruti","elyy","dash","hehe"};
        
        for(int i=0;i<names.length;i++){
            System.out.println("name"+i+" is "+names[i]);
        }
        //When your loop reaches the point where i is equal to names.length (which is 4), you'll be trying to access names[4]. Since there's no element at index 4, Java will throw an ArrayIndexOutOfBoundsException.
        //To fix this, you should change your loop condition to i < names.length. This will ensure that the loop only iterates through the valid indices of the array.
    }
}
