// Java program to output the maximum occurring character 
// in a string TIME complexity: O(n) AND SPACE COMPLEXITY:o(1) 

public class GFG 
{ 
	static final int ASCII_SIZE = 256; 
	static char getMaxOccuringChar(String str) 
	{ 
		// Create array to keep the count of individual 
		// characters and initialize the array as 0 
		int count[] = new int[ASCII_SIZE]; 
	
		// Construct character count array from the input 
		// string. 
		int len = str.length(); 
		for (int i=0; i<len; i++) 
			count[str.charAt(i)]++; 
	
		int max = -1; // Initialize max count 
		char result = ' '; // Initialize result 
	
		// Traversing through the string and maintaining 
		// the count of each character 
		for (int i = 0; i < len; i++) { 
			if (max < count[str.charAt(i)]) { // when two or more chars are max, print only the first max char
				max = count[str.charAt(i)]; 
				result = str.charAt(i); 
			} 
		} 
	
		return result; 
	} 
	
	// Driver Method 
	public static void main(String[] args) 
	{ 
		String str = "applle"; 
		System.out.println("Max occurring character is " + 
							getMaxOccuringChar(str)); 
	} 
}

//Tail Question :Print max occuring char but least AsCII value

for (int i = 0; i < len; i++) { 
			if (max <= count[str.charAt(i)]&& minAscii>str.charAt(i)&& str.charAt(i)>32) { 
				max = count[str.charAt(i)]; 
              	minAscii=str.charAt(i);
				result = str.charAt(i); 
			} 
		}  
