package apnaCollege;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "appnnacollege";

		StringBuilder str1 = new StringBuilder();
		boolean[] arr = new boolean[26];
		removeDuplicates(name,0,str1,arr);
		removeDuplicates(name,0,new StringBuilder(""),new boolean[26]);


	}
	static void removeDuplicates(String str,int i, StringBuilder str1,boolean[] arr) {
		if(i==str.length()) {
			System.out.println(str1);
			return;
		}
		
		int index = str.charAt(i)-'a';
		if(!arr[index]) {
			str1.append(str.charAt(i));
			arr[index]=true;
		}
		removeDuplicates(str,i+1,str1,arr);
	}
}
