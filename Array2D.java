package apnaCollege;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int row=s1.nextInt();
		int col=s1.nextInt();
		
		int[][] arr2 =new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j]=s1.nextInt();
			}
		}
		System.out.println("=================");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
