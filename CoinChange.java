/*
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, In how many ways can we make the change? The order of coins doesn’t matter.

Input Format
First line of input contain two space separated integers N and M. Second line of input contains M space separated integers - value of coins.

Constraints
1<=N<=250 1<=m<=50 1 <= Si <= 50

Output Format
Output a single integer denoting the number of ways to make the given change using given coin denominations.

Sample Input
10 4
2 5 3 6
Sample Output
5

*/
Submission ID: #10736811
import java.util.*;
public class Main {
	public static int CoinChange(int[] arr,int n,int len){
		int[][] dp= new int[n+1][len+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<len+1; j++){
                if(j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]=1;
                }
            }
            
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<len+1; j++ ){
                if(arr[j-1]<=i){
                    dp[i][j]=dp[i-arr[j-1]][j] + dp[i][j-1];
                }
                if(arr[j-1]>i){
                    dp[i][j]= dp[i][j-1];
                }
            }
        }
		return dp[n][len];
	}
    public static void main(String args[]) {

        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int M= sc.nextInt();
		int[] arr=new int[M];
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		
		int w= CoinChange(arr, n,arr.length);
		System.out.println(w);
    }
}
