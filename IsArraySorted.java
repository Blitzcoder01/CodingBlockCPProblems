/**


Take as input N, the size of array. Take N more inputs and store that in an array. Write a recursive function which returns true if the array is sorted and false otherwise. Print the value returned.
Input Format

Enter a number N and take N more inputs and store in an array
Constraints

None
Output Format

Display the Boolean result
Sample Input

4
1
2
3
4

Sample Output

true


**/
//solution
import java.util.*;
public class Main {
	public static boolean IsArraySorted(int[] arr, int n){
		if(n==0|| n==1){
			return true;
		}
		if(arr[n-1]<arr[n-2]){
			return false;
		}
        return IsArraySorted(arr, n-1);
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i <n; i++){
			arr[i]= sc.nextInt();
		}
		boolean ans= IsArraySorted(arr, n);
		System.out.println(ans);
    }
}


