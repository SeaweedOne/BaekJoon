import java.util.Scanner;

public class BaekJoon2294DP_Coin_MinCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // 동전가짓수
		int k = s.nextInt(); // 만들어야 할 금액

		int[] coins = new int[n]; // 동전배열
		int[] dp = new int[k + 1]; // 디피 비교값 배열 0부터 인풋값까지 모두사용해야해서 +1
		dp[0] = 0; // 0번째 0으로 초기화
		for (int i = 0; i < n; i++) { // 코인입력받기
			coins[i] = s.nextInt();
		}

		for (int i = 1; i <= k; i++) { // 만들 수 있는지 없는지 보기 위해서 이상한 값 지정
			dp[i] = 999999;
		}

		for (int i = 0; i < n; i++) { // 코인 가져올 배열
			int coin = coins[i]; // 코인하나씩 가지고옴
			if (coin > k) { // 가져온 코인이 만들 액수보다 크면 컨티뉴 ( 볼필요 없음)
				continue;
			}
			for (int j = coin; j <= k; j++) { // 디피 값 -> 현재 지금 배열에 저장되어있는 값보다 [j-coin]+1값이 작다면 그 값을 저장
				dp[j] = Math.min(dp[j], dp[j - coin] + 1); // dp[0] = 0이기때문에 동전이 1원일 경우 -> dp[1-coin(1)] = 0 +1 = 1 ,
															// 100001보다 1이 작기때문에 1 저장 다른 코인액수도 그렇게 돌면서 설정
			}
		}

		int result = dp[k]; // k원에서 만들 수 있는 최소값을 결과 변수에 저장
		if (result == 999999) { // dp[k] 값이 이상값이라면? 우리가 초기화 해둔 값이라면? 최소값이 없다는 소리 , 그렇다면 -1 출력
			System.out.println(-1);
		} else { // 최소값이 저장되어있는 경우 최소값 출력
			System.out.println(dp[k]);
		}

	}

}
