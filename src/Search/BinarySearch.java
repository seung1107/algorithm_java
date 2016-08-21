package Search;
 
public class BinarySearch {
	public void binarySearch(int iKey, int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length - 1;
		
		while (right >= left) { //right�� left�� �����Ǳ� ������
			mid = (right + left) / 2; //���� �ε���
			
			if (iKey == arr[mid]) { //���� �ε����� ���� ã�� ���� ���� ��
				System.out.println(iKey + " is in the array with index value: " + mid);
				break;
			}
			
			if (iKey < arr[mid]) { //���� �ε����� ���� ã�� ������ ū���
				right = mid - 1; //���� �ε��� ���� sub�迭�� �ٽ� Ž��
			} else { //���� �ε����� ���� ã�� ������ ���� ���
				left = mid + 1; //���� �ε��� ������ sub�迭�� �ٽ� Ž��
			}
			
		}
	}
	
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearch binary = new BinarySearch();
        binary.binarySearch(4, arr);
    }
 
}