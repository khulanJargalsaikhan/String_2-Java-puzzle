package string_2;

public class PlusOut {

	public static void main(String[] args) {
		System.out.println(plusOut("12xy34", "xy"));
		System.out.println(plusOut("12xy34", "1"));
		System.out.println(plusOut("12xy34xyabcxy", "xy"));  
		System.out.println(plusOut("abXYxyzXYZ", "XYZ"));  // "+++++++XYZ"

	}

	/*
Given a string and a non-empty word string, return a version of the original 
String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") 		- "++xy++"
plusOut("12xy34", "1") 			- "1+++++"
plusOut("12xy34xyabcxy", "xy") 	- "++xy++xy+++xy"
	 */
	public static String plusOut(String str, String word) {

		int len = word.length();
		String result = "";

		for(int i=0; i<str.length(); i++){

			if(i <= str.length() - len) {
				
				if(str.substring(i, i+len).equals(word)){
					result = result + word;
					i = i + len - 1;
				} else {
					result = result + "+";
				}
				
			} else {
				result = result + "+";
			}


		}


		return result;

	}


}
