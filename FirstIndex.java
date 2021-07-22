/**


Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.
Input Format

Enter a number N and add N more elements to an array, then enter a number M
Constraints

None
Output Format

Display the first index at which number M is found
Sample Input

5
3
2
1
2
2
2

Sample Output

1


**/
//solution

import java.util.*;
public class Main {
	public static int searchFirstOccurance(int[] arr, int n, int m){
		for(int i=0; i<arr.length; i++){
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
		System.out.print(searchFirstOccurance(arr, N,m));
    }
}
