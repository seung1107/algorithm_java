package Search;

import java.util.Scanner;

public class SequentialSearch {
	public int sequentialSearch(int[] arr, int target){
		for(int index=0 ; index<arr.length ; index++){
			if(arr[index] == target){
				return index; 
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SequentialSearch search = new SequentialSearch();
		int[] arr = {8, 4, 7, 3, 1, 6, 5, 2};
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		int result = search.sequentialSearch(arr, input);
		if(result == -1){
			System.out.println("���� ���� �ʽ��ϴ�.");
		}else{
			System.out.println(result+1+" ��°");
		}
		
	}
}
