import java.util.Scanner;

//오른쪽, 아래쪽으로만 움직일 수 있을 때, D[1][1]에서 D[x][y]까지 도달하는 경우의 수를 구하는 문제는 일일히 모든 경우를 다 계산할 필요 없이, D[i][j] = (i, j)에 도달하는 누적 경우의 수 = D[i-1][j] + D[i][j-1]를 세워서 해결할 수도 있죠.
//어때요? 다이나믹 어렵지 않죠? 이제 문제를 풀어볼게요!
//“→, ↓, ↘의 세 방향만 사용해서 한 번에 한 칸씩 이동할 때, 왼쪽 위 (1, 1)에서 출발하여 오른쪽 아래 (n, m)에 도착하는 경우의 수를 구하여라.”

public class BaekJoon14494MultidimensionalArrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int d = 1000000007;
		long[][] dp = new long[n + 1][m + 1]; //배열 설정  0 번째 줄을 버리기 위해 +1 설정 

		dp[0][0] = 1; //0,0 에는 경우의 수가 없지만 포문을 1부터 돌리기위해 0,0을 1로설정해주었다 

		for (int i = 1; i <= n; i++) { //현재 칸 까지 오는 경우의 수는 바로 전에 밟을 수 있는 칸의 경우의 수 들을 모두 더한 것 
			for (int j = 1; j <= m; j++) { //이 문제에서는 세방향임으로 세 경우의 수 모두 더하기 
				dp[i][j] = (dp[i - 1][j] % d) + (dp[i][j - 1] % d) + (dp[i - 1][j - 1] % d); //도데체 이해가 안간다 왜 나누고 또나누지 근데 이거 없으면 에러남 ㅜㅜ
			}
		}
		long result = (int) (dp[n][m] % d); //시키는데로 나누고 나머지 출력 
		System.out.println(result);
	}

}
