package Search;
 
public class BinarySearch {
	public void binarySearch(int iKey, int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length - 1;
		
		while (right >= left) { //right와 left가 교차되기 전까지
			mid = (right + left) / 2; //기준 인덱스
			
			if (iKey == arr[mid]) { //기준 인덱스의 값과 찾는 값이 같을 때
				System.out.println(iKey + " is in the array with index value: " + mid);
				break;
			}
			
			if (iKey < arr[mid]) { //기준 인덱스의 값이 찾는 값보다 큰경우
				right = mid - 1; //기준 인덱스 왼쪽 sub배열을 다시 탐색
			} else { //기준 인덱스의 값이 찾는 값보다 작은 경우
				left = mid + 1; //기준 인덱스 오른쪽 sub배열을 다시 탐색
			}
			
		}
	}
	
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearch binary = new BinarySearch();
        binary.binarySearch(4, arr);
    }
 
}