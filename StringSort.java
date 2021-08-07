/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Constraints
Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1
Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
*/

import java.util.*;
public class Main {
	public static void SortString(String[] arr, int n ){
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j< n; j++){
				if(arr[i].compareTo(arr[j])>0|| arr[j].contains(arr[i])){
					String temp =arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
				
			}
		}

		for(String s: arr){
			System.out.println(s);
		}
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String[] arr= new String[n];
		for(int i=0; i<n ;i++){
			arr[i]= sc.nextLine();
		}
		SortString(arr, n);
    }
}
