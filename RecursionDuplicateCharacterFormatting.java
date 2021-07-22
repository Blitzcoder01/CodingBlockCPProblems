/**


Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned
Input Format

Enter a String
Constraints

1<= Length of string <= 10^4
Output Format

Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)
Sample Input

hello

Sample Output

hel*lo

Explanation

We insert a "*" between the two consecutive 'l' .

**/
//solution
import java.util.*;
public class Main {
	
	 public static void duplicateCharacterFormatting(String s,String ans, int n){
		if(s.length()==n+1){
			System.out.println(ans+s.charAt(n));
			return;	
		}
		char c= s.charAt(n);
		char c2= s.charAt(n+1);
		if(c==c2){
			duplicateCharacterFormatting(s, ans+c+"*", n+1);
		}
		else{
			duplicateCharacterFormatting(s, ans+c, n+1);
		}
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String ans="";
		int n=0;
		duplicateCharacterFormatting(s, ans, n);
    }
}
