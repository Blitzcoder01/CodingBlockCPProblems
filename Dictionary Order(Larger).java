/**


Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the characters of this string which are in dictionary order larger than the given string.
The output strings must be lexicographically sorted.
Input Format

Single line input containing a string
Constraints

Length of string <= 10
Output Format

Display all the words which are in dictionary order larger than the string entered in a new line each. The output strings must be sorted.
Sample Input

cab

Sample Output

cba

Explanation

The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is lexicographically greater than "cab". We only print "cba".

**/
//solution

import java.util.*;
public class Main {
	public static ArrayList<String> dictionaryLarger(String s){
	if(s.length() == 0){
		ArrayList<String> arr = new ArrayList<>();
		arr.add("");
		return arr;
	}
	
	char cc = s.charAt(0);
	String ros = s.substring(1);
	
	ArrayList<String> r = new ArrayList<>();
	ArrayList<String> m = new ArrayList<>();
	
	r = dictionaryLarger(ros);
	
	for(String rrs : r){
		for(int i=0;i<=rrs.length();i++){
			String val = rrs.substring(0,i) + cc + rrs.substring(i);
			m.add(val);  
		}
	}
	
	return m;
	}

	public static void display(ArrayList<String> ans , String s){
		for(int i=0;i<ans.size();i++){
			if(ans.get(i).compareTo(s) > 0) {
				System.out.println(ans.get(i));
			}
		}
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		ArrayList<String> ans = dictionaryLarger(s);
		Collections.sort(ans);
		display(ans,s);
    }
}
