package apnaCollege;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
		System.out.println();
		printInc(5);
		System.out.println();
		System.out.println(fact(5));
		System.out.println(summ(5));
	}
	
	static void print(int n) {

		if(n == 1) {
			return;
		}
		System.out.print(n+" ");
		print(n-1);}
	
	static void printInc(int n) {
		if(n == 0) {
			return;
		}
		printInc(n-1);
		System.out.print(n+" ");
	}
	static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		n=n*fact(n-1);
			return n;
	}
	
	static int summ(int n) {
		if(n == 1) {
			return 1;
		}
		n=n+summ(n-1);
			return n;
	}
}
