/*
Given N, count the number of ways to express N as sum of 1, 3 and 4.

Input Format
First line contains the size of the array. Next line contains array elements.

Constraints
1 <= N <= 108

Output Format
Print the integer answer.

Sample Input
4
Sample Output
4 
Explanation
1+1+1+1
1+3
3+1
4
  */
import java.util.*;
public class Main {
	public static long Count(int n){
		long[] dp= new long[n+1];
		for(int i=0; i<n+1;i++){
            if(i<=2){
                dp[i]=1;
            }
            else if(i==3){
                 dp[i]=2;
            }
            else{
                dp[i]= dp[i-1]+dp[i-3]+ dp[i-4];
                
            }
        }
		return dp[n];
	}
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		long ans= Count(n);
		System.out.println(ans);
    }
}

  
