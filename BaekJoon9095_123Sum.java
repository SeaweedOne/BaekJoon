import java.util.Scanner;

//수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
//정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
//1+1+1+1
//1+1+2
//1+2+1
//2+1+1
//2+2
//1+3
//3+1

public class BaekJoon9095123Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = { 1, 2, 3 }; // 동전배열
		int testCase = s.nextInt();

		for (int k = 0; k < testCase; k++) {
			int input = s.nextInt();
			int[] dp = new int[11]; // 알아보기 쉽게 디피의 배열을 인풋값 + 1로 설정해주고 0번째 인덱스는 버림
			dp[1] = 1; // 1원 2원 3원을 만들 수 있는 각각의 경우의 수 dp[0]을 1이라 가정했을 때 각 금액의 경우의 수는 앞의 3번째를 모두 더한것과 같다
			dp[2] = 2;
			dp[3] = 4;
			if (input > 3) {
				for (int i = 4; i < dp.length; i++) { // 1,2,3까지는 규칙을 찾기위해 내가 구했다 4번부터 다시 구하자
					dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
				}
			}
			System.out.println(dp[input]);
		}

	}

}
