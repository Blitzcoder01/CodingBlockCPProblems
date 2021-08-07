/*
Reaching to the top of a staircase, it takes n steps.
The task can be accomplished either by climbing 1 step or 2 steps at a time.
In how many different ways can you climb to the top.
Note: n will be a positive integer.

Input Format
First line contains an integer n.

Constraints
None

Output Format
Print the total number of distinct ways you can climb to top.

Sample Input
2
Sample Output
2
Explanation
None
*/
import java.util.*;
public class Main {
	public static int ClimbingStairs(int n){
		 if(n==1 || n==2){
            return n;
        }
		int[] dp=new int[n+1];
		dp[1]= 1;
		dp[2]=2;
		for(int i=3; i<=n;i++){
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int ans=ClimbingStairs(n);
		System.out.print(ans);
    }
}
