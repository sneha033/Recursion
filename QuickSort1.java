package apnaCollege;

public class QuickSort1 {

	static void quickSort(int[] arr,int si, int ei) {
		if(si>=ei) {
			return;
		}
		
		int ptix = partition(arr,si,ei);
		quickSort(arr,si,ptix-1);//left part
		quickSort(arr,ptix+1,ei);//right index
	}
	
	static int partition(int[] arr, int si,int ei) {
		int pivot = arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++) {
			if(arr[j]<=pivot) {
				//swap
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		//for equal to pivot
		i++;
		int temp=pivot;
		arr[ei]=arr[i];
	arr[i]=temp;
		return i;
	}
	static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,9,8,2,5};
		int[] arr1 = {1,0,432,34,45,75,8,98,98976,542,3,9,8,2,5};
		quickSort(arr1,0,arr1.length-1);
		printArr(arr1);
	}

}
