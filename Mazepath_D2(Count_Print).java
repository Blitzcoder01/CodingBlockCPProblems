/**

Take as input N. N is the number of rows and columns on a square board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east). But the diagonal step is allowed only when the player is currently on one of the diagonals (there are two diagonals)

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
Input Format

Enter the number N.
Constraints

None
Output Format

Display the total number of paths and display all the possible paths in a space separated manner.
Sample Input

3

Sample Output

VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 
11


**/

//solution

import java.util.*;
public class Main {
	static int ct=0;
	public static void Mazepath_D2(String s, int r, int c, int cr, int cc){
		if(r==cr || c==cc){
			return;
		}
		if(r-1==cr && c-1==cc){
			ct++;
			System.out.print(s+" ");
			return;
		}
		Mazepath_D2(s+"V",r,c,cr+1, cc);
		Mazepath_D2(s+"H",r,c,cr, cc+1);
		if(cr==cc||cr+cc==c-1){
			Mazepath_D2(s+"D",r,c,cr+1, cc+1);
		}
		
		
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Mazepath_D2("", n, n, 0,0);
		System.out.println();
		System.out.println(ct);
    }
}
