
public class StringAssignment {

	/*
	 * charToASCII()- function displays ASCII code of String character by character
	 * Display Format - Original String followed ASCII code of characters separated by whitespace
	 */
	public static void charToASCII(String originalString){
	
		System.out.print("Original String        : ");
		char[] originalStringChar = originalString.toCharArray();
		for(char ch: originalStringChar){
			System.out.print(ch+" ");
		}
		
		System.out.println("");
		System.out.print("ASCII code char by char: ");
		
		for (char ch: originalStringChar) {
			System.out.print(Character.isDigit(ch) ? ch + " " : String.valueOf((int)ch) + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Nitish";
		charToASCII(originalString);
		
		System.out.println("");
		originalString = "9N8A345z6";
		charToASCII(originalString);
		
		System.out.println("");
		originalString = "0@34JaVa&*(8";
		charToASCII(originalString);
		
		System.out.println("");
		originalString = "J9ggn9j8ED";
		charToASCII(originalString);
		
		System.out.println("");
		originalString = "^h0j7d@@Vl&0$PgQ";
		charToASCII(originalString);

	}

}
