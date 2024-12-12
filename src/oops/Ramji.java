package oops;

public class Ramji {

	public static void main(String[] args) {
		String original = "Shivji";
        String reversed = "";

        // Loop through the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
        	reversed += original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
	       }
		}

	


