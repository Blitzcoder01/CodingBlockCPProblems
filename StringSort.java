import java.util.*;
public class Main {
	public static void SortString(String[] arr, int n ){
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j< n; j++){
				if(arr[i].compareTo(arr[j])>0|| arr[j].contains(arr[i])){
					String temp =arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
				
			}
		}

		for(String s: arr){
			System.out.println(s);
		}
	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String[] arr= new String[n];
		for(int i=0; i<n ;i++){
			arr[i]= sc.nextLine();
		}
		SortString(arr, n);
    }
}
