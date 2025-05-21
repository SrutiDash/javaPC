public class arrays2 {
    public static void main(String[] args) {
        int arr[] = {23, 67, 87, 24, 43};
        System.out.println(arr.length);
        String[] array = {"sruti", "elyy", "netflix", "amazon"};
        System.out.println(array[3]);
        System.out.println(array.length);
        //if we want to display values in each index :

        //printing using naive method : array traversal
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        //in reverse order if we want to get :

        for(int i=arr.length - 1;i>=0;i--){
            System.out.println(arr[i]);
        }

        //but we can also do the same by using this :

    }
}
