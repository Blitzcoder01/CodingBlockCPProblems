/**


Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
E.g. for “abexexdexed” return “abeedeedxxx”.
Print the value returned
Input Format

Single line input containing a string
Constraints

Length of string <= 1000
Output Format

Single line displaying the string with all x's moved at the end
Sample Input

axbxc

Sample Output

abcxx

Explanation

All x's are moved to the end of string while the order of remaining characters remain the same.

**/
//solution

import java.util.*;
public class Main {
	public static String moveXtoLast(String s,String ans){
	String raw="";
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)=='x'){
				raw=raw+s.charAt(i);
				
			}
			else{
				ans=ans+s.charAt(i);
				
			}
		}
		ans= ans+raw;
	return ans;

	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String ans="";
		
		System.out.print(moveXtoLast(s, ans));

    }
}
