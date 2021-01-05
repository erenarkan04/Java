
public class javaex1 {
	public static void main (String[] args) {
	System.out.println(reverse(args[0])); 		
	}


	public static String reverse (String input) {

		String output = ""; 

		for (int i = input.length()-1; i >= 0; i--) {

			if (i == input.length()-1) 
				output += Character.toUpperCase(input.charAt(i));
			else 
			output += input.charAt(i); 
		



		}
		return output; 
	}


}




