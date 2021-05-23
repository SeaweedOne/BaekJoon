
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon10448TriangleNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[45];
		for (int i = 1; i < 45; i++) {
			arr[i] = arr[i - 1] + i;
		}

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			int num = Integer.parseInt(br.readLine());
			boolean result = false;
			for (int j = 0; j < 45; j++) {
				if (j > num) {
					break;
				}
				for (int k = 0; k < 45; k++) {
					for (int l = 0; l < 45; l++) {
						if (arr[i] + arr[j] + arr[k] == num) {
							result = true;
						}
					}
				}
			}
			if (result == true) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
