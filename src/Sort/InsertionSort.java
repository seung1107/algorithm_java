package Sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
		int i,j,temp;
		
		for(i=1 ; i<index.length ; i++){
			temp = index[i]; //���� �� ����
			for(j=i-1 ; j>=0 && temp < index[j] ; j--){
					index[j+1] = index[j]; // ���� �� ������ ������ �ϳ��� ���������� �̵�
			}
			index[j+1] = temp;
		}
		for (int k = 0; k < index.length; k++) {
			System.out.print(index[k] + " ");
		}
	}
}
