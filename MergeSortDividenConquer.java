package apnaCollege;

public class MergeSortDividenConquer {

	static void mergeSort(int[] arr ,int si,int ei) {
		//base
		if(si>=ei) {
			return;
		}
		
		int mid =si + (ei-si)/2; //calculating middle also by (si+ei)/2
	//	System.out.println(arr[mid]);
		//left part
		mergeSort(arr,si,mid);
		//rightpart
		mergeSort(arr,mid+1,ei);
		merge(arr,si,mid,ei);
	}
	
	static void merge(int[] arr, int si, int mid, int ei) {
		int[] temp = new int[ei-si+1]; //temporary array for merging
		int i =si;
		int j = mid+1;
		int k=0;
		
		while(i<=mid && j <=ei) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];   //adding smallest element to temp array
				i++;
			}
			else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) { //for remaining elements
			temp[k++]=arr[i++];
		}
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
		
		//copying to original array
		for(k=0,i=si; i<=ei;i++,k++ ) {
			arr[i]=temp[k];
		}
		
	}
	
	static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,9,5,2,8};
		mergeSort(arr,0,arr.length-1); //arr , start index, end index
		printArr(arr);
	}

}
