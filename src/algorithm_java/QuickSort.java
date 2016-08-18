package algorithm_java;

public class QuickSort {
	public void quickSort(int[] arr, int l, int r){
		int left = l;
		int right = r;
		int pivot = arr[(l+r)/2]; //비교 기준 설정
		int temp;
		
		do{
			while(arr[left] < pivot) left++; // 피벗 기준 왼쪽의 원소가 피벗 값보다 큰 값이 나올 때까지
			while(arr[right] > pivot) right--; //피벗 기준 오른쪽의 원소가 피벗 값보다 작은 값이 나올 때까지
			if(left <= right){ 
				temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
			} //left, right 교체
		}while(left <= right); //left와 right가 교차 되기 전까지만
		
		if(l<right) quickSort(arr, l, right); //피벗 기준 왼쪽 sub배열을 재귀
		if(r>left) quickSort(arr, left, r); //피벗 기준 오른쪽 sub배열을 재귀
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

