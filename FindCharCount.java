package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cognizant";
		char ch = 'n';
		int count = 0;
		
		char[] myNameArray = str.toCharArray();
		for(int i=0 ; i<myNameArray.length-1 ; i++)
		{
			if (myNameArray[i] == ch)
			{
				count++;
			}
		}
		System.out.println("number of characters "+count);

	}

}
