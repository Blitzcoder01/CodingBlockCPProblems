/**


Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.
Input Format

Enter a number in form of a String
Constraints

1 <= Length of String <= 10
Output Format

Print the number after converting it into integer
Sample Input

1234

Sample Output

1234

Explanation

Convert the string to int. Do not use any inbuilt functions.

**/
//solution
import java.util.*;
public class Main {
	 public static int stringToInt(String s, int i, int ans){
		if(s.length()==i){
			return ans;
		}
		char c= s.charAt(i);
		int t= c -'0';
		return stringToInt(s, i+1, ans*10+t);
	 }
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int i=0;
		int ans=0;
		System.out.print(stringToInt(s, i, ans));
    }
}
