import java.util.Arrays;
import java.util.Scanner;

public class Beakjoon2563Paper {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		int arr[][] = new int[101][101];
		int cnt = 0;

		int testCase = s.nextInt();
		for (int i = 0; i < testCase; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					arr[j][k] = 1;

				}
			}
		}

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (arr[i][j] == 1) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}
