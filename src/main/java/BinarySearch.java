
public class BinarySearch {
	
    public int search(int[] nums, int target) {
    	int start = 0;
    	int end = nums.length - 1;
    	while(start <= end) {
    		int mid = start + (end-start)/2;
    		if(nums[mid] == target)
    			return mid;
    		else if(nums[mid] > target)
    			end = mid -1;
    		else
    			start = mid + 1;
    	}
    	return -1;
    }

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {-1,0,3,5,9,11};
		System.out.print(binarySearch.search(arr, 9));

	}

}
