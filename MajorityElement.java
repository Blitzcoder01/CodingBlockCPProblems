import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void MajortyEle(int n, int[] arr){
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
	
		Map.Entry<Integer,Integer> maxEntry = null;
		int val=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
    		{
        		maxEntry = entry;
				val=entry.getValue();

    		}
		}
		System.out.println(maxEntry.getKey());
	}
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		MajortyEle(n, arr);
    }
}
