import java.util.Scanner;
//정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 4가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다. 합을 이루고 있는 수의 순서만 다른 것은 같은 것으로 친다.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 10,000보다 작거나 같다.
//정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
public class BaekJoon15989_123Sum4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		int[] arr = { 1, 2, 3 };
		
		for (int k = 0; k < testCase; k++) { //테스트케이스만큼 포문돌며 디피 리셋 
			int input = s.nextInt();
			int[] dp = new int[input+1]; //인풋값으로 디피의 크기 설정 
			dp[0] = 1; //인덱스 0 값을 1로 잡아줌. 1번째도 1로 잡았더니 결과가 달랴졌다. 
			for (int i = 0; i < arr.length; i++) { //포문 돌며 arr배열 하나씩 가지고오기 
				int num = arr[i]; //넘으로 정의한 배열 값으로 아래에서 점화식 만들기
				for (int j = num; j < dp.length; j++) { //포문이 돌면서 배열 채우기/해당 값을 만드는 경우의 수는 (해당값에 현재 존재하는 경우의 수 + (해당 값 - 동전의 가치)일 떄의 경우의 수) 
					dp[j] += dp[j - num];
				}
			}
			System.out.println(dp[input]); //인풋값에 해당하는 경우의 수 출력 
		}

	}

}
