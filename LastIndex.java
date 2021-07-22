/**


Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.
Input Format

Enter a number N and add N more numbers to an array, then enter number M to be searched
Constraints

None
Output Format

Display the last index at which the number M is found
Sample Input

5
3
2
1
2
3
2

Sample Output

3


**/
//solution

import java.util.*;
public class Main {
   	public static int searchLastOccurance(int[] arr, int n, int m){
		for(int i=n-1; i>0; i--){
			if(arr[i]== m){
				return i;
			
			}
		}
		return -1;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int[] arr= new int[N];
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		int m= sc.nextInt();
		System.out.print(searchLastOccurance(arr, N,m));
	}
}
