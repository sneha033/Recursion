package apnaCollege;

public class SearchRotatedSortedArray {
	static int search(int[] arr, int si, int ei, int target) {
		if(si>ei) {
			return -1;
		}
		int mid=si+(ei-si)/2;
		
		//case FOUND
		if(arr[mid]==target) {
			return mid; 
		}
		
		//case mid on L1
		if(arr[si]<=arr[mid]) {
			//case a: target on l1 left
			if(arr[si]<=target && target<=arr[mid]) {
				return search(arr,si,mid-1,target);
			}
			//case b: target on l1right
			else {
				return search(arr,mid+1,ei,target);
			}
		}
		//case mid on L2
		else {			 //if(arr[mid]<=arr[ei])
			//case a: L2 rght
			if(arr[mid]<=target && target<=arr[ei]) {
				return search(arr,mid+1,ei,target);
			}
			//case b":target left L2
			else {
				return search(arr,si,mid-1,target);
			}
		}
	
	}

	public static void main(String[] args) {
		// int targeTODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int ind = search(arr, 0, arr.length - 1, target);
		System.out.println(ind);

	}

}
