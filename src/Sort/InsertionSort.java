package Sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
		int i,j,temp;
		
		for(i=1 ; i<index.length ; i++){
			temp = index[i]; //기준 값 저장
			for(j=i-1 ; j>=0 && temp < index[j] ; j--){
					index[j+1] = index[j]; // 기준 값 왼쪽의 값들을 하나씩 오른쪽으로 이동
			}
			index[j+1] = temp;
		}
		for (int k = 0; k < index.length; k++) {
			System.out.print(index[k] + " ");
		}
	}
}
