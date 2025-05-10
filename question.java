import java.util.* ;
import java.io.*; 
public class question {
	public static long evenSumTillN(int n) {
		// Write your code here.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

        int sum = 0;
		for(int i=2;i<=N;i++){
			if(i%2==0){
                sum += i;
			}else{
				sum += 0;
			}
		}
		System.out.println(sum);
	}
}