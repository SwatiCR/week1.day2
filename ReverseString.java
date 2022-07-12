package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "swati";
		char[] myNameArray = myName.toCharArray();
		int length = myNameArray.length;
		
		for(int i = length-1; i >= 0 ; i--)
		{
			System.out.print(myNameArray[i]);
		}
		
	}

}
