package apnaCollege;

public class TilingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		System.out.println(numOfways(num));
	}
	static int numOfways(int n) {  //2 x n floor and 2 x 1 tile
		if(n==0 || n==1) {
			return 1;
		}
		
		//vertical
		int fnm1=numOfways(n-1);
		
		//horizontal
		int fnm2=numOfways(n-2);
		
		return fnm1+fnm2;
	}
}
