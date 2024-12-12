package collection;

import java.util.HashSet;

public class SetMapHash {

	public static void main(String[] args) {
		String str = "saheb";
		String rev = "";
		for (int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
}
}
