/*
A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements. For example, the sequence {A,B,D} is a subsequence of {A,B,C,D,E,F}, obtained after removal of elements C, E and F.

Given two strings A and B of size n and m respectively, you have to find the length of Longest Common Subsequence(LCS) of strings A and B, where LCS is the longest sequence present in both A and B.

Input Format
Two strings A and B.

Constraints
1 <= n,m <= 10^3

Output Format
Output the LCS of A and B.

Sample Input
abc
acd
Sample Output
2
*/
import java.util.*;
public class Main {
	public static int LCS(String s, String ss){
		int[][] dp =new int[ss.length()+1][s.length()+1];
		for(int i=0; i<ss.length()+1;i++){
			for(int j=0; j<s.length()+1; j++){
				if(i==0|| j==0){
					dp[i][j]=0;
				}
			}
		}
		for(int i=1; i<ss.length()+1;i++){
			for(int j=1; j<s.length()+1; j++){
				if(s.charAt(j-1)==ss.charAt(i-1)){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else{
					dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
				}
			}
		}
		return dp[ss.length()][s.length()];
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String ss= sc.nextLine();
		int len= LCS(s, ss);
		System.out.println(len);
    }
}
