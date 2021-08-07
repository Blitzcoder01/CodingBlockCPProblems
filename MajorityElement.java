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
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void MajortyEle(int n, int[] arr){
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
	
		Map.Entry<Integer,Integer> maxEntry = null;
		int val=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
    		{
        		maxEntry = entry;
				val=entry.getValue();

    		}
		}
		System.out.println(maxEntry.getKey());
	}
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		MajortyEle(n, arr);
    }
}
