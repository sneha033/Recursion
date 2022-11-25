package apnaCollege;

public class BitGet {

	public static void main(String[] args) {
		int a=5;			//0101
		int pos=3;
		
		int bitMask =1<<pos;	//0100
		
		if((bitMask & a) ==0) {		//0
			System.out.println("bit =0");
		}
		else {
			System.out.println("bit =1");
		}

	}

}
