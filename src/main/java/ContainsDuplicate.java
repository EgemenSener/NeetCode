import java.util.HashSet;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		  	HashSet<Integer> hashSet = new HashSet<Integer>();
		  	for(int num: nums) {
		  		if(hashSet.contains(num))
		  			return true;
		  		hashSet.add(num);
		  	}
	        return false;
		}

	public static void main(String[] args) {
		
		ContainsDuplicate deneme = new ContainsDuplicate();
		int[] arr = {1,2,3,1};
		System.out.println(deneme.containsDuplicate(arr));

	}

}
