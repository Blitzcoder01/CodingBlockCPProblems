/*
Given 3 strings ,the task is to find the longest common sub-sequence in all three given sequences.

Input Format
First line contains first string . Second line contains second string. Third line contains the third string.

Constraints
The length of all strings is |s|< 200

Output Format
Output an integer denoting the length of longest common subsequence of above three strings.

Sample Input
GHQWNV
SJNSDGH
CPGMAH
Sample Output
2
Explanation
"GH" is the longest common subsequence
*/

import java.util.*;
public class Main {
	public static int LCS(String A, String B, String C, int n1, int n2, int n3){
		int[][][] dp= new int[n1+1][n2+1][n3+1];
        for(int i=0; i<n1+1;i++){
            for(int j=0; j<n2+1;j++){
                for(int k=0; k<n3+1;k++){
                    if(i==0||j==0|| k==0){
                        dp[i][j][k]=0;
                    }
                }
            }
        }
        
        for(int i=1; i<n1+1;i++){
            for(int j=1; j<n2+1;j++){
                for(int k=1; k<n3+1;k++){
                    if(C.charAt(k-1)==A.charAt(i-1) && C.charAt(k-1)==B.charAt(j-1)){
                        dp[i][j][k]= 1+dp[i-1][j-1][k-1];
                    } 
                    else{
                        dp[i][j][k]= Math.max(Math.max(dp[i-1][j][k],dp[i][j-1][k]),dp[i][j][k-1]);
                    }
                }
            }
        }
        
return dp[n1][n2][n3];
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String A= sc.nextLine();
		String B= sc.nextLine();
		String C= sc.nextLine();
		int n1= A.length();
		int n2= B.length();
		int n3= C.length();
		int ans= LCS(A,B,C, n1, n2, n3);
		System.out.println(ans);
    }
}
