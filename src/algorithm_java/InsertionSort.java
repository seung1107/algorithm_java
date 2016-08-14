package algorithm_java;

public class InsertionSort {
	public static void main(String[] args) {
		int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
		int i, j, min;
		int temp = 0;

		for (i = 0; i < index.length; i++) {
			min = index[i];
			for (j = i; j < index.length - 1; j++) {
				if (min > index[j + 1]) {
					min = index[j + 1];
					temp = j + 1;
				}
				// System.out.print("index[j]"+j+"------"+index[j+1]+" ");
			}
			// System.out.println("");
			if (min < index[i]) {
//				System.out.println("index[temp] = " + index[temp]
//						+ "------------" + "index[i] = " + index[i]);
				index[temp] = index[i];
//				System.out.println("index[i] = " + index[i] + "------------"
//						+ "min = " + min);
				index[i] = min;
//				System.out.println();
			}
		}

		for (int k = 0; k < index.length; k++) {
			System.out.print(index[k] + " ");
		}
	}
}
