package assign_1;
import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Final   --->" + pigLet(ip.nextLine()));
		
		/*System.out.println("Enter number of Row : ");
		int rowNumber = ip.nextInt();
		System.out.println("RowNUmber = " + rowNumber + " => Ans = " +countTotalBirds(rowNumber));
		System.out.println("Enter Other Row number : ");
		rowNumber = ip.nextInt();ip.close();
		System.out.println("RowNUmber = " + rowNumber + " => Ans = " +countTotalBirds(rowNumber));*/
	}
	public static int countTotalBirds(int rowNumber) {
		int numbirds = 1;int x = 0;int ans =0;
		if(rowNumber < 0) {
			System.out.println("Invalid Row Number");
		}
		else {
			if(rowNumber == 0) return 0;
			if(rowNumber == 1 ) return  numbirds;
			for(int i=0;i<rowNumber;i++) {
				int temp = numbirds;
				numbirds += x;
				x = temp;
				ans += numbirds;
				System.out.print(numbirds + "  ");
			}
		}
		System.out.println("\n----------------------------");
		return ans;
	}
	
	public static String pigLet(String s) {
		System.out.println("string len : " + s.length());
		String pigLetString = "";
		String word = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				pigLetString += " ";
				continue;
			}
			word += s.charAt(i);
			int j=i+1;
			System.out.println("start j :" + j);
			for(;j<s.length();j++) {
				if(s.charAt(j) != ' ') {
					word += s.charAt(j);
				}else {
					System.out.println("before pig word : " + word);
					word += word.charAt(0)+ "a";
					word = word.substring(1);
					System.out.println("after pig word : " + word);
					pigLetString += word;
					System.out.println("up piglet : " + pigLetString);
					word = "";
					break;
				}
				
			}
			if(word.length() > 0 && j == s.length()) {
				word += word.charAt(0)+ "a";
				word = word.substring(1);
				pigLetString += word;
			}
			System.out.println(j-1);
			i = j-1;
		}
		
		
		
		return pigLetString;
		
	}
	private static String str(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
