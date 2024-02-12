import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
    public int[] twoSum(int[] nums, int target) {
        
    	int n = nums.length;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i = 0 ; i < n ; i++) {
    		map.put(nums[i], i);
    	}
    	
    	for(int i = 0 ; i < n; i++) {
    		int complement = target - nums[i];
    		
    		if(map.containsKey(complement) && map.get(complement) != i) {
    			return new int[] {i, map.get(complement)};
    		}
    	}
    	return new int[] {};
   }
    

	public static void main(String[] args) {
		TwoSum deneme = new TwoSum();
		int[] arr = {3,3};
		System.out.println(Arrays.toString(deneme.twoSum(arr, 6)));
	}

}
