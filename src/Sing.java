import java.util.HashSet;

public class Sing {

	public static void main(String[] args) {
		int[] numbers = { 50, 4, 30, 45, 67, 45, 50 };
		HashSet<Integer> arr1 = new HashSet<>();
		for (int num : numbers) {
			arr1.add(num);
			{
				

			}
			
			System.out.println("remove duplicate: " + arr1);
		}

	}
}