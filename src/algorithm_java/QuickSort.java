package algorithm_java;

public class QuickSort {
	public void quickSort(int[] arr, int l, int r){
		int left = l;
		int right = r;
		int pivot = arr[(l+r)/2];
		int temp;
		
		do{
			while(arr[left] < pivot) left++;
			while(arr[right] > pivot) right--;
			if(left <= right){
				temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
			}
		}while(left <= right);
		
		if(l<right) quickSort(arr, l, right);
		if(r>left) quickSort(arr, left, r);
	}
	
	public static void main(String[] args) {
		int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
		
		QuickSort quick = new QuickSort();
		quick.quickSort(index, 0, index.length-1);
		
		for (int k = 0; k < index.length; k++) {
			System.out.print(index[k] + " ");
		}
	}
}

