package apnaCollege;

public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int exp =5;
		System.out.println(power(num,exp));
		System.out.println(optimizedPower(num,exp));
	}
	
	static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		int pow = a * power(a,b-1);
		return pow;
	}
	
	static int optimizedPower(int a,int b) { //O(log n ) time complexity
		if(b==0) {
			return 1;
		}
		int halfpow = optimizedPower(a,b/2);
		int halfpowsq =halfpow * halfpow;
		if(b%2!=0) {
			halfpowsq=a*halfpowsq;
		}
		return halfpowsq;
	}
}
