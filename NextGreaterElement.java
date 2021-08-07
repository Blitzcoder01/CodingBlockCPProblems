import java.util.*;

public class Main {
    // Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
        Stack<Integer> s= new Stack<>();
        int[] ans= new int[arr.length];
        s.push(arr[ arr.length-1]);
        ans[ans.length-1]=-1;
        for(int i=arr.length-2; i>=0;i--){
            
            while(s.size()>0 && s.peek()<arr[i]){
                    s.pop();
                }
            if(s.size()==0){
                ans[i]=-1;
                
            }
            else{
                ans[i]= s.peek();
                
            }
            
            s.push(arr[i]);
        }
        

     for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]+","+ans[i]);
        }
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++){
                arr[i]= scn.nextInt(); 
            }
				

			nextLarger(arr);

		t--;
		}

	}

	
}
