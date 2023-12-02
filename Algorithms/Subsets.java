import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	// public static void calcSubset(List<Integer> A,
	// List<List<Integer>> res,
	// List<Integer> subset,
	// int index) {
	// // Add the current subset to the result list

	// System.out.println(subset);
	// res.add(new ArrayList<>(subset));

	// // Generate subsets by recursively including and
	// // excluding elements
	// for (int i = index; i < A.size(); i++) {
	// // Include the current element in the subset
	// subset.add(A.get(i));

	// // Recursively generate subsets with the current
	// // element included
	// calcSubset(A, res, subset, i + 1);

	// // Exclude the current element from the subset
	// // (backtracking)
	// subset.remove(subset.size() - 1);

	// }
	// }

	// public static List<List<Integer>> subsets(List<Integer> A) {
	// List<Integer> subset = new ArrayList<>();
	// List<List<Integer>> res = new ArrayList<>();

	// int index = 0;
	// calcSubset(A, res, subset, index);

	// return res;
	// }

	// // Driver code

	// public static void main(String[] args) {
	// List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
	// List<List<Integer>> res = subsets(array);

	// // Print the generated subsets
	// // for (List<Integer> subset : res) {
	// // for (Integer num : subset) {
	// // System.out.print(num + " ");
	// // }
	// // System.out.println();
	// // }
	// }
	// }

	public static void main(String[] args) {
		System.out.println(subsets(new int[] { 1, 2, 3 }));
	}

	public static List<List<Integer>> subsets(int[] arr) {
		int n = arr.length;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> subAns = new ArrayList<>();
		GenerateSubsets(arr, ans, subAns, n, 0);
		return ans;
	}

	public static void GenerateSubsets(int[] arr,
			List<List<Integer>> ans, List<Integer> subAns, int n, int index) {
		// base case
		if (index == n) {
			ans.add(new ArrayList<>(subAns));
			return;
		}

		// include item
		// ArrayList<Integer> temp= new ArrayList<>(subAns);
		subAns.add(arr[index]);
		GenerateSubsets(arr, ans, subAns, n, index + 1);

		// exclude item
		subAns.remove(subAns.size() - 1);
		GenerateSubsets(arr, ans, subAns, n, index + 1);
		return;
	}
}