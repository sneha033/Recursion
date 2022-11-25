package apnaCollege;

public class PairInParty {
//people can stand in pairs or single how many ways/??
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people = 3;
		System.out.println(noOfWays(people));

	}
	
	static int noOfWays(int people) {
		if(people ==1 || people ==2) {
			return people;
		}
		
		//single
		int fnm1 = noOfWays(people-1);
		
		//pair
		int fnm2 = noOfWays(people-2);
		int tot = fnm1 + ((people-1)*fnm2);
		return tot;
		
	//	return noOfWays(people-1) + ((people-1)*noOfWays(people-2));
	}

}
