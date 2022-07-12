package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empID = {22,45,67,25,22,98,45,100,200,67,22,100};
		Arrays.sort(empID);

		for (int i = 0; i < empID.length-1; i++) {

			if (empID[i] == empID[i+1]) 
			{
				System.out.println(empID[i]);
			}
		}
	}

}
