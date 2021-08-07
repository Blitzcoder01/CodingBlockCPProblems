/*
A railway track is made with the help of two horizontal rails and wooden sleepers as seen in figure.

Drag Racing

There are two horizontal rails X and Y. On railway line X, N numbers are written and on railway line Y, M numbers are written

Paul works as engineer in railway department. Paul was tasked to join these two rails to with sleepers to complete the railway track.

But there is a condition to join the rails with sleepers. The sleepers will be put on the position i and j such that -

The number written on X at ith position i.e X[i] should be equal to the number written on Y at jth position i.e Y[j].

The sleepers should not intersect or cross each other at all.

Sleepers cannot intersect or cross each other at the ends .

Return the maximum number of sleepers that Paul has to connect to complete the railway track.

Input Format
First line contains two integers N and M i.e the count of numbers written on each rail X and Y. Second line contains N numbers that are written on rail X. Third line contains M numbers that are written on rail Y.

Constraints
1 <= N <= 500
1 <= M <= 500

Output Format
A single integer, the maximum number of sleepers that Paul has to connect to complete the railway track.

Sample Input
6 5
1 3 7 1 7 5
1 9 2 5 1
Sample Output
2
*/

import java.util.*;
public class Main {
    public static int lcs(int[] arr,int[] arr2, int n, int m){
        int[][] dp =new int[m+1][n+1];
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0|| j==0){
                    dp[i][j]=0;
                } 
            }
        }
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(arr2[i-1]==arr[j-1]){
                    dp[i][j] =1+dp[i-1][j-1];
                }
                else{
                     dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] arr= new int[n];
        int[] arr2= new int[m];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]= sc.nextInt();
        }
        int ans =lcs(arr, arr2,n,m);
        System.out.println(ans);
    }
}
