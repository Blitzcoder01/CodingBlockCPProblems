/**


Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).
Input Format

Enter the string
Constraints

None
Output Format

Display the number of ASCII-subsequences and display all the ASCII- subsequences
Sample Input

ab

Sample Output

 b 98 a ab a98 97 97b 9798
9


**/
//solution
import java.util.*;
public class Main {
	static int ct;
	public static void AsciiSubsequences(String s,String ans, int n){
			
		   if (n == s.length()) {
            if (ans.length() > 0) {
                System.out.print(ans + " ");
				ct++;
            }
			
            return;
        }
		char c =s.charAt(n);

		AsciiSubsequences(s, ans, n+1);
		AsciiSubsequences(s, ans+c, n+1);
		AsciiSubsequences(s, ans+(int)c, n+1);

	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String ans=" ";
		int i=0;
		ct=0;
		AsciiSubsequences(s,ans, i);
		System.out.println();
		System.out.println(ct);
    }
}
