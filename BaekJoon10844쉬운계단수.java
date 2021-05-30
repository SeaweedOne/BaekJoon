import java.util.Arrays;
import java.util.Scanner;

//45656이란 수를 보자.이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
//N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다. 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

public class BaekJoon10844쉬운계단수 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		long[][] dp = new long[input+1][10];
		int mod = 1000000000;

		for (int i = 1; i < 10; i++) { // 한자리수에서 나올 수 있는 계단수는 무조건 1개
			dp[1][i] = 1; // 0으로 시작되는 식은 없음으로 1부터 돌림
		}

		if (input >= 2) { // 점화식 - 3자리 중에서 마지막 자리가 3인 경우 나올 수 있는 계단수는 (2자리 마지막 수 2 의 계단수 + 2자리 마지막수 4의 계단수)
			for (int i = 2; i <= input; i++) { 								
				for (int j = 0; j < 10; j++) { // [3][3]의 점화식은 ([2][3-1] + [2][3+1]
					if (j == 0) { // 0과 9의 경우 인덱스 에러가 나게된다. 예외처리
						dp[i][j] = dp[i - 1][j + 1];
					} else if (j == 9) {
						dp[i][j] = dp[i - 1][j - 1];
					} else {
						dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
					}
					dp[i][j] = dp[i][j] % mod; //정답을 mod로 나누라며.. 밑에서 어차피 나눌건데 왜 이렇게 해야하는건지 전혀 이해가 안가고 매우 화가나지만 이거 없으면 틀림 ^^ 
				}
			}
		}
		long result = 0; // 결과값 도출을 위해 해당 자리수의 모든 계단식 더해주기
		for (int i = 0; i < 10; i++) {
			result += dp[input][i];
		}
		System.out.println(result % mod); // 결과출력

	}

}
