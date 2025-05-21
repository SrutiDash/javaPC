public class string{
    public static void main(String[] args) {
        String name = "sruti";  //using string literal
        System.out.println(name);

        //but we can also write string in this way :

        String name2 = new String("sruti"); //using new keyword and string constructor
        System.out.println(name2);

        System.out.println(name.substring(2)); //returns from 2nd to nth index
        System.out.println(name.substring(1, 4)); //returns from 1st index to (endindex-1)

        System.out.println(name.replace('s', 'p')); //replaces old char to new char in string
        System.out.println(name.replace("s", "pa")); //replaces string from target to replacement
        
    }
}