import java.util.Scanner;

//n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 
//그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다. 사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.

public class BaekJoon2293DP_Coin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //동전의 가짓수
		int k = s.nextInt(); //만들어야할 금액

		int[] coins = new int[n]; //동전의 가짓수만큼 배열 생성
		int[] dp = new int[k + 1]; //k원까지 가는 금액별 경우의 수를 환산할 것임으로 k 로 설정하려고 0번째 줄을 기본값으로 설정해주기 위해 +1 해줌

		for (int i = 0; i < n; i++) { //가짓수만큼 돌면서 동전 배열에 동전들 채워줌
			coins[i] = s.nextInt();
		}

		dp[0] = 1; //디피의 초기값 1로 설정 
		for (int i = 0; i < n; i++) { //맨 처음 동전부터 탐색 / 돟전을 coin변수에 담아줌 
			int coin = coins[i];
			for (int j = coin; j < dp.length; j++) { //j의 초기값을 coin으로 잡아줌 (왜냐하면 coin의 크기만큼 금액이 올라야 비로서 경우의 수가 1 추가되기 때문!)
				dp[j] += dp[j - coin]; //디피 배열에 현제위치 - 동전의 가치 를 뺀 자리의 경우의 수만큼 누적시켜줌 (추가로 더해줌)
			}
		}

		int result = dp[k]; // 맨 마지막 값이 최종 금액을 만들 수 있는 경우의 수
		System.out.println(result);

	}

}
