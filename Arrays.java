package apnaCollege;

public class Arrays {

	public static void main(String[] args) {
		int[] arrName = new int[5];
		arrName[0]=12;
		arrName[1]=121;
		arrName[2]=122;
		arrName[3]=123;
		arrName[4]=124;
		
		for(int i=0; i<arrName.length;i++) {
			System.out.println(arrName[i] );
		}
		
		for(int i:arrName) {
			System.out.println(i);
		}
		
		int[] arr= {1,2,34};
		System.out.println(arr[1]);
	}

}
