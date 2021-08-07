/*
Find the length of the longest subsequence in a given array A of integers such that all elements of the subsequence are sorted in strictly ascending order.

Input Format
The first line contains a single integer n.
Next line contains n space separated numbers denoting the elements of the array.

Constraints
0 < n< 105
0 < Ai < 105

Output Format
Print a single line containing a single integer denoting the length of the longest increasing subsequence.

Sample Input
6
50 3 10 7 40 80
Sample Output
4
Explanation
The longest subsequence in test case is - 3,7,40,80
*/
import java.util.*;
public class Main {
	public static int lis(int n, int[] arr){
		int[] dp= new int[n];
		
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            max = 1;
            dp[i] = 1;
            
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    max = Math.max(max, dp[j] + 1);
                    dp[i] = max;
                }
            }
            res = Math.max(res, max);
        }
        return res;
		
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++){
			arr[i]= sc.nextInt();
		}
		int ans=lis(n, arr);
		System.out.println(ans);
    }
}
