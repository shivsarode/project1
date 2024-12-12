import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	public static void removearray(int[]num) {
		LinkedHashSet <Integer> s = new LinkedHashSet<>();
		for(int i=1;i<num.length;i++);
		int i = 0;
		s.add(num[i]);
		System.out.println(s);
	}
	
	
	
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		removearray(array);
	}

}
