package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberList = {25,76,13,9,81,100,57};
		int length = numberList.length;
		Arrays.sort(numberList);
		System.out.println("Minimum number is "+numberList[0]);
		System.out.println("Maximum number is "+numberList[length-1]);
	}

}
