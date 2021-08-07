import java.util.*;
public class Main {
	public static boolean isValid(int[] arr, int n, int c, int mid){
		     int cow=1;
			 int previous=0;
			 for(int i=1; i< n;i++){
				 if(arr[i]-arr[previous]>=mid){
					 cow++;
					 previous=i;
				 } 
			 }
			 if(cow<c){
					 return false;
				 }
				 return true;

	}
	public static int AggrCows(int[] arr, int n, int c){
		int l=arr[0];
		int s=0;
		for(int i=0; i<n; i++){
			s= s+arr[i];
		}
		int res=-1;
		int h= s;
		while(l<=h){
			int mid= l+(h-l)/2;
			if(isValid(arr, n, c, mid)){
				res= mid;
				l=mid+1;
			}
			else{
				h= mid-1;
			}
		}
		return res;
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int c= sc.nextInt();
		int[] arr= new int[n];

		for(int i=0; i<n; i++){
			arr[i]= sc.nextInt();

		} 
		Arrays.sort(arr);
		int ans=AggrCows(arr, n,c);
		System.out.println(ans);

    }
}
