# String_2-Java-puzzle

- Return true if the given string contains an appearance of "xyz" 
where the xyz is not directly preceeded by a period (.). 
So "xxyz" counts but "x.xyz" does not.


  xyzThere("abcxyz")  - true
  
  xyzThere("abc.xyz") - false
  
  xyzThere("xyz.abc") - true
  
  
  

- Given a string and a non-empty word string, return a version of the original 
String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged.

  plusOut("12xy34", "xy") 		  - "++xy++"

  plusOut("12xy34", "1") 			  - "1+++++"

  plusOut("12xy34xyabcxy", "xy") 	- "++xy++xy+++xy"
