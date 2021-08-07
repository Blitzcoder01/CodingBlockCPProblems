/*
osh is stuck in a m*n grid. He has to travel from top left to bottom right.For every cell to pass, there is a specific amount of money josh has to pay. Your task is to find out minimum amount of money josh has to pay to reach bottom right.

Input Format
First line contains two space separated integers m and n i.e number of rows and columns of grid. m lines follow each containing n integers, denoting the cost of which josh has to pay to pass through that cell.

Constraints
None

Output Format
A single integer denoting minimum cost josh has to pay.

Sample Input
3 3 
1 3 1
1 5 1
4 2 1
Sample Output
7
Explanation
Josh will take 1→3→1→1→1 path to minimize the amount he has to pay


*/
import java.util.*;
public class Main {
    public static int minPathSum(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length; j++){
                if(i==0 && j==0){
                    
                }
                else if(i==0){
                    grid[i][j]+=grid[i][j-1];
                }
                else if(j==0){
                     grid[i][j]+=grid[i-1][j];
                }
                else{
                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] grid= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j= 0; j<n ; j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int ans= minPathSum(grid);
        System.out.print(ans);
    }
}
