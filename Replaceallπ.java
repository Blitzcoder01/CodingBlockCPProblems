/**


Replace all occurrences of pi with 3.14
Input Format

Integer N, no of lines with one string per line
Constraints

0 < N < 1000
0 <= len(str) < 1000
Output Format

Output result one per line
Sample Input

3
xpix
xabpixx3.15x
xpipippixx

Sample Output

x3.14x
xab3.14xx3.15x
x3.143.14p3.14xx

Explanation

All occurrences of pi have been replaced with "3.14".

**/
//solution

import java.util.*;
public class Main {
	
	public static void replacePi(String s, String ans, int in){
		if(s.length()==in+1){
			System.out.println(ans+s.charAt(in));
			return;
		}
		char c= s.charAt(in);
		if(s.charAt(in)=='p' && s.charAt(in+1)=='i'){
			replacePi(s,ans+"3.14",in+2);
		}
		else{
			replacePi(s,ans+c,in+1);
		}
	}
    public static void main(String args[]) {
		String ans="";
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int in=0;
		sc.nextLine();
		for(int i=0;i<n; i++){
			String s= sc.nextLine();
			replacePi(s,"",0);
			
		}
    }
}
