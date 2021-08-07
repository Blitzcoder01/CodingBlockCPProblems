/*
Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.

Note that:

Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.
Input Format
First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.

Constraints
1 <= K <= 10
1 <= N <= 10
1<= Length of each Board <= 10^8

Output Format
Output the minimum time required to paint the board.

Sample Input
2
2
1 10
Sample Output
10
*/

import java.util.*;
public class Main {
	public static Boolean isPossible(int[] arr, int n, int k, int mid ){
		int painterCount= 1;
		int sum=0;
		for(int i=0; i<n; i++){
			if(arr[i]>mid){
				return false;
			}
			if(sum+arr[i]>mid){
				painterCount++;
				sum= arr[i];
				if(painterCount>k){
				return false;
				}
			}
			else{
				sum+= arr[i];
			}
		}
		return true;
	}
	 public static int PaintersPartition(int[] arr, int n, int k){
		 int l=arr[0];
		 int s=0;
		 for(int i=0; i<n;i++){
			 s= s+arr[i];
		 }
		 int h=s;
		 int result=0;
		 while(l<=h){
			 int mid= l+(h-l)/2;
			 if(isPossible(arr, n, k ,mid)){
				result= mid;
				h=mid-1;
			 }
			 else{
				 l= mid+1;
			 }
		 }
		 return result;
	 }
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int k= sc.nextInt();
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]= sc.nextInt();
		}

		System.out.println(PaintersPartition(arr, n, k));
    }
}
