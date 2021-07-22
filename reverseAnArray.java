/**
Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which reverses the array. Print the values of reversed array.
Input Format

Enter a number N and take N more inputs
Constraints

None
Output Format

Display values of the reversed array
Sample Input

4
1
2
3
4

Sample Output

4 3 2 1


**/
//solution

import java.util.*;
public class Main {
	public static void reverse(int[] arr ,int last){
		int[] b= new int[arr.length];
		for(int i=0; i<b.length;i++){
			b[i]=arr[last-i];
		}
			for(int j: b){
				System.out.print(j+" ");
			}
			return ;
		
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		reverse(arr, n-1);
    }
}
