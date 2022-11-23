package apnaCollege;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(25));
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(sortedArray(a, 0));
		int[] b = { 1, 2,44,65,5, 3, 4, 5 };
		System.out.println(findELeArray(b,0,5));
System.out.println(lastocc(b,0,5));
	}

	static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int m = fibo(n - 1) + fibo(n - 2);
		return m;
	}

	static boolean sortedArray(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}

		if (arr[i] >= arr[i + 1]) {

			return false;
		}
		return sortedArray(arr, i + 1);
	}
	
	static int findELeArray(int[] arr, int i,int num) {
		if(i == arr.length) {
			return -1;
		}
		if (arr[i] == num) {
			return i;
		
		}
		return findELeArray(arr, i+1, num);
	}
	
	static int lastocc(int[] arr, int i,int num) {
		if(i == arr.length) {
			return -1;
		}
		int isFound = lastocc(arr,i+1,num);
		
		if(isFound==-1 && arr[i]==num) {
			return i;
		}
		return isFound;
	}
	
}
