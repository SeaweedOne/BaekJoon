import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
//2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.
public class BaekJoon2167 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("src/case1.txt"));
		Scanner sc = new Scanner(System.in);
		int arraySize1 = sc.nextInt();
		int arraySize2 = sc.nextInt();
		int[][] arr = new int[arraySize1][arraySize2];
		for (int i = 0; i < arraySize1; i++) {
			for (int j = 0; j < arraySize2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int start1 = sc.nextInt() - 1; // 인덱스 생성
			int start2 = sc.nextInt() - 1;
			int last1 = sc.nextInt() - 1;
			int last2 = sc.nextInt() - 1;

			int sum = 0;
			for (int j = start1; j <= last1; j++) { // 열
				for (int k = start2; k <= last2; k++) { // 행
					sum += arr[j][k];
				}
			}
			System.out.println(sum);
		}
	}

}
