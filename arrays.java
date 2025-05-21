public class arrays {
    public static void main(String[] args) {
        //1
        //initialization
        int[] marks;
        //memory allocation
        marks = new int[5];
        
        //2
        //intitialization and memory allocation
        int[] array = new int[5];
        //initialization
        array[0] = 45;
        array[1] = 46;
        array[2] = 47;
        array[3] = 48;
        array[4] = 49;
        System.out.println(array[3]);
        array[3] = 66;  //changing it's value

        //3
        System.out.println(array[3]);
        //initialization memory allocation(java do automatically) and initialization
        int arr[] = {23, 67, 87, 24, 43};
    }
}

