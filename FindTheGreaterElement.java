import java.util.*;
public class Main {
	 public static void greaterElement(int[] arr){
		 List<Integer> a= new ArrayList<>();
		 for(int i=0; i<arr.length-1; i++){
			 if(arr[i]<arr[i+1]){
				 a.add(arr[i+1]);
			 }
			 else{
				  a.add(-1);
			 }
		 }	
		 if(arr[arr.length-1]<arr[0]){
			 a.add(arr[0]);
		 }
		  else{
				  a.add(-1);
			 }
			 for(int i: a){
				 System.out.print(i+" ");
			 }

	 }
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		greaterElement(arr);
    }
}
