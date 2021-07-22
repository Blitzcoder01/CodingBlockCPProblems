/**


Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
Input Format

Enter the number of rows N1 and number of columns N2
Constraints

None
Output Format

Display the total number of paths and print all the possible paths in a space separated manner
Sample Input

3
3

Sample Output

VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
13


**/
//solution

import java.util.*;
public class Main {
	static int ct=0;
	 public static void Mazepath_D(String s, int r, int c, int cc, int cr){
		 if(r==cr || c== cc){
			 return; 
		 }
		 if(r-1==cr && c-1== cc ){
			 ct++;
			 System.out.print(s+" ");
			 return;
		 }
		 Mazepath_D(s+"V",r,c,cc, cr+1);
		Mazepath_D(s+"H",r,c,cc+1, cr);
		Mazepath_D(s+"D",r,c,cc+1, cr+1);
		 
		 
	 }
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		int c= sc.nextInt();
		Mazepath_D("", r, c, 0, 0);
		System.out.println();
		System.out.println(ct);
    }
}
