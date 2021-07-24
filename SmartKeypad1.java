/**


You will be given a numeric string S. Print all the possible codes for S.

Following vector contains the codes corresponding to the digits mapped.

string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

For example, string corresponding to 0 is " " and 1 is ".+@$"
Input Format

A single string containing numbers only.
Constraints

length of string <= 10
Output Format

All possible codes one per line in the following order.

    The letter that appears first in the code should come first

Sample Input

12

Sample Output

.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c

Explanation

For code 1 the corresponding string is .+@$ and abc corresponds to code 2.

**/

//solution

import java.util.*;
public class Main {
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void SmartKeypad(String n, String s){
		  if(n.length()==0){
            System.out.println(s);
			return;
        }
		char[] c= table[n.charAt(0)-'0'].toCharArray();
        
        for(char ch: c){
            String restStr=n.substring(1);
            SmartKeypad(restStr, s+ch);
        }
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String n= sc.nextLine();
		SmartKeypad(n,"");
    }
}
