import java.util.Scanner;

//동전의 종류가 주어질 때에 주어진 금액을 만드는 모든 방법을 세는 프로그램을 작성하시오
//입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스의 첫 번째 줄에는 동전의 가지 수 N(1 ≤ N ≤ 20)이 주어지고 두 번째 줄에는 N가지 동전의 각 금액이 오름차순으로 정렬되어 주어진다. 각 금액은 정수로서 1원부터 10000원까지 있을 수 있으며 공백으로 구분된다. 세 번째 줄에는 주어진 N가지 동전으로 만들어야 할 금액 M(1 ≤ M ≤ 10000)이 주어진다.
//같은 동전이 여러 번 주어지는 경우는 없다. 각 테스트 케이스에 대해 입력으로 주어지는 N가지 동전으로 금액 M을 만드는 모든 방법의 수를 한 줄에 하나씩 출력한다.

public class BeakJoon9084DP_Coin_Value {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int testCase = s.nextInt();
		for (int a = 0; a < testCase; a++) { // 테스트케이스만큼 돌기

			int coinNum = s.nextInt(); // 코인갯수 받아오기
			int[] coins = new int[coinNum + 1]; // 코인개수 + 1 배열설정

			for (int i = 1; i <= coinNum; i++) { // 코인 가치 받아오기
				coins[i] = s.nextInt();
			}

			int M = s.nextInt(); // 목표금액
			int[] dp = new int[M + 1]; // 배열
			dp[0] = 1; // 초기화

			for (int i = 1; i <= coinNum; i++) { // 코인돌며 값 가지고오기
				int coin = coins[i];
				if (coin > M) {
					continue;
				}
				for (int j = coin; j <= M; j++) { // 디피배열 돌기
					dp[j] += dp[j - coin]; // 디피 값 설정
				}
			}

			System.out.println(dp[M]);

		}

	}

}
