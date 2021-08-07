/*
A professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping him from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money he can rob tonight without alerting the police.

Input Format
First line contains integer t as number of testcases. Second line contains integer n as size of array. Third line contains a single integer as element of array.

Constraints
None

Output Format
Print the maximum money as output.

Sample Input
1
4
1 2 3 1
Sample Output
4
*/
import java.util.*;
public class Main {
	public static int rob(int[] nums) {
        int len= nums.length;
         if(nums.length==1){
             return nums[0];
         }
        int[] dp= new int[len];
       
        for(int i=0; i<len;i++){
            if(i==0){
                 dp[0]= nums[0];
            }
            else if(i==1){
                dp[i]=Math.max(dp[i-1], nums[i]);
            }
            else{
                 dp[i]=Math.max(dp[i-2]+nums[i], dp[i-1]);
            }
           
            
        }
       return dp[len-1];
    }
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t; i++){
			int n= sc.nextInt();
			int[] arr= new int[n];
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
			}
			int ans= rob(arr);
			System.out.println(ans);
		}
    }
}
