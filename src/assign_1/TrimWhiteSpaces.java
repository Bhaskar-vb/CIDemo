package assign_1;

public class TrimWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello  World";
		
		String ans = "";
		/*System.out.println(ip.split("\\s+").length);
		for(String x : message.split("\\s+")) {
			System.out.println(x);
			if(x != " ") {
				ans = ans + x + " " ;
			}
		}*/
		
		
		int i=0;
        int j=str.length()-1;
        char[]str1= str.toCharArray();
        
        /*for (char x : str1) {
        	System.out.println(x);
        }*/

        while(i < j)
        {
            if(str1[i]!='a' && str1[i]!='A'&& str1[i]!='e' && str1[i]!='E'&& str1[i]!='i' && str1[i]!='I' && str1[i]!='o' && str1[i]!='O' && str1[i]!='u' && str1[i]!='U'){
                i++;
                continue;
                
            }
            if(str1[j]!='a' && str1[j]!='A' && str1[j]!='e' && str1[j]!='E' && str1[j]!='i' && str1[j]!='I' && str1[j]!='o' && str1[j]!='O' && str1[j]!='u' && str1[j]!='U'){
                j--;
                continue;
            }
            char ch=str1[i];
            str1[i]=str1[j];
            str1[j]=ch;
            i++;
            j--; 
        }
        String str2 = String.copyValueOf(str1);
		
        System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		


	}

}
