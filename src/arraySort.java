import java.util.ArrayList;
import java.util.Collections;

public class arraySort {

	public static void sortArray(int[] num) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			arr1.add(num[i]);
			{

			}
			Collections.sort(arr1);
			System.out.println(arr1);

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 6, 5 };
		sortArray(arr);
	}

}
