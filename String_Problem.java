package string_2;

public class String_Problem {

	public static void main(String[] args) {
		
		System.out.println(stringCount("ddddggrieeeddddd"));   // 4d2gri3e5d

	}


	public static String stringCount(String str) {
		
		String result = "";
		int count = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {
				
				if(count == 1) {
					result = result + str.charAt(i);
				}else {
					result = result + count + str.charAt(i);
					count = 1;
				}
			}	
		}
		
		result = result + count + str.charAt(str.length()-1);
		return result;
	} 
	
}
