import java.util.*;
public class loop1 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans*=x;
        }
        System.out.println(ans);
	}
}
