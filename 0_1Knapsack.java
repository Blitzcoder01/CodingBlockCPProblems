/*
You are packing for a vacation on the sea side and you are going to carry only one bag with capacity S (1 <= S <= 1000). You also have N (1<= N <= 1000) items that you might want to take with you to the sea side. Unfortunately you can not fit all of them in the knapsack so you will have to choose. For each item you are given its size and its value. You want to maximize the total value of all the items you are going to bring. What is this maximum total value?

Input Format
On the first line you are given N and S.
Second line contains N space separated integer where ith integer denotes the size of ith item. Third line contains N space seperated integers where ith integer denotes the value of ith item.

Constraints
1 <= S,N <= 1000

Output Format
Output a single integer showing the maximum value that can be obtained by optimally choosing the items.

Sample Input
5 4
1 2 3 2 2 
8 4 0 5 3
Sample Output
13
Explanation
Total capacity = 4.
Pick size 1 with value 8 and size 2 with value 5.
*/
import java.util.*;
public class Main {
	public static int KnapScak(int[] w, int[] v,int len, int cap){
		int[][] dp =new int[cap+1][len+1];
		for(int i=0; i<cap+1; i++){
			for(int j=0; j<len+1; j++){
				if(i==0 || j==0){
					dp[i][j]=0;
				}
			}
		}
		for(int i=1; i<cap+1; i++){
			for(int j=1; j<len+1; j++){
				if(w[j-1]<=i){
					dp[i][j]= Math.max(v[j-1]+ dp[i-w[j-1]][j-1], dp[i][j-1]);
				}
				if(w[j-1]>i){
					dp[i][j]=dp[i][j-1];
				}
			}
		}
		return dp[cap][len];
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int cap= sc.nextInt();
		int[] weight= new int[n];
		int[] val= new int[n];
		for(int i=0; i<n; i++){
			weight[i]= sc.nextInt();
		}
		for(int i=0; i<n; i++){
			val[i]= sc.nextInt();
		}
		int ans=KnapScak(weight, val, n, cap);
		System.out.print(ans);
    }
}
