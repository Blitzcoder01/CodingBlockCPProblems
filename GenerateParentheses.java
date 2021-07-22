/**


Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.
Input Format

Single line containing an integral value 'n'.
Constraints

1<=n<=11
Output Format

Print the balanced parentheses strings with every possible solution on new line.
Sample Input

2

Sample Output

()() 
(()) 



**/

//solution

import java.util.*;
public class Main {
	public static void GenerateParentheses(int n, String s,int oc, int cc){
		if(s.length()==n*2){
			System.out.println(s);
			return;
		}
		
		if(oc>cc){
			GenerateParentheses(n,s+")",oc, cc+1);
		}
		if(oc<n){
			GenerateParentheses(n,s+"(", oc+1,cc);
			
		}
		

	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String s="";
		int oc=0;
		int cc=0;
		GenerateParentheses(n,s, oc, cc);
    }
}
