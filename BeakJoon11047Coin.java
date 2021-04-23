import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BeakJoon11047Coin {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("src/coin.txt"));
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		int money = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[maxNum];
		for (int i = 0; i < maxNum; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = maxNum - 1; i >= 0; i--) {
			if (money >= arr[i]) {
				cnt = (cnt + (money / arr[i]));
				money = (money % arr[i]);
			}
		}
		System.out.println(cnt);

	}

}
