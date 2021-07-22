/**


You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.
Input Format

First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.
Constraints

1 <= N , M <= 10
Output Format

Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"
Sample Input

5 4
OXOO
OOOX
XOXO
XOOX
XXOO

Sample Output

1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 


**/


//solution

import java.util.*;
public class Main {
	static boolean flag= false;
	public static void RatChasesItsCheese(char[][] arr, int[][] ans, int n, int m, int cr, int cc){
		if(cc>m-1 || cr>n-1||cc<0||cr<0|| ans[cr][cc]==1){
			return;
		}
		
		if(arr[cr][cc]=='X'){
			return;
		}
		if(cc==m-1 && cr==n-1){
			ans[cr][cc]=1;
			flag=true;
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					System.out.print(ans[i][j]+" ");
					
				}
				System.out.println();
				
			}
			return;
		}
		ans[cr][cc]=1;
		RatChasesItsCheese(arr,ans,n,m,cr,cc+1);
		RatChasesItsCheese(arr,ans,n,m,cr,cc-1);
		RatChasesItsCheese(arr,ans,n,m,cr+1,cc);
		RatChasesItsCheese(arr,ans,n,m,cr-1,cc);
		
		ans[cr][cc]=0;
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int M= sc.nextInt();
		sc.nextLine();
		char[][] arr= new char[N][M];
		
		
		for (int i=0; i<N;i++){
			String inp= sc.nextLine();
			for (int j=0;j<M;j++){
				arr[i][j] = inp.charAt(j);
			}
		}
		
		RatChasesItsCheese(arr,new int[N][M],N,M,0,0);
		if(flag== false){
			System.out.println("NO PATH FOUND");
		}
    }
}
