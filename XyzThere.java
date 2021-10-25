package string_2;

public class XyzThere {

	public static void main(String[] args) {
		System.out.println(xyzThere("abcxyz"));   // true
		System.out.println(xyzThere("abc.xyz"));  // false
		System.out.println(xyzThere("xyz.abc"));  // true

	}

	/*
	 * 
Return true if the given string contains an appearance of "xyz" 
where the xyz is not directly preceeded by a period (.). 
So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") - true
xyzThere("abc.xyz") - false
xyzThere("xyz.abc") - true
	 * 
	 */
	public static boolean xyzThere(String str) {

		boolean result = false;

		for (int i=0; i< str.length()-2; i++){

			if(str.substring(0,3).equals("xyz"))
				result = true;

			if(i>0 && str.substring(i,i+3).equals("xyz") && str.charAt(i-1) != '.')
				result = true;
			else if (i>0 && str.substring(i,i+3).equals("xyz") && str.charAt(i-1) == '.' && result == false)
				result = false;
		}

		return result;

	}

}
