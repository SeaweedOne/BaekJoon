import java.util.Scanner;

public class BaekJoon2748FibonacciWithDp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		long[] dp = new long[input + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= input; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[input]);
	}
}
