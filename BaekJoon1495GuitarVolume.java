import java.util.Scanner;

//기타리스트 강토는 다가오는 공연에서 연주할 N개의 곡을 연주하고 있다. 이번 공연에서는 매번 곡이 시작하기 전에 볼륨을 바꾸고 연주하려고 한다.
//먼저, 공연이 시작하기 전에 각각의 곡이 시작하기 전에 바꿀 수 있는 볼륨의 리스트를 만들었다. 
//이 리스트를 V라고 했을 때, V[i]는 i번째 곡을 연주하기 전에 바꿀 수 있는 볼륨을 의미한다. 항상 리스트에 적힌 차이로만 볼륨을 바꿀 수 있다. 즉, 현재 볼륨이 P이고 지금 i번째 곡을 연주하기 전이라면, i번 곡은 P+V[i]나 P-V[i] 로 연주해야 한다. 하지만, 0보다 작은 값으로 볼륨을 바꾸거나, M보다 큰 값으로 볼륨을 바꿀 수 없다.
//곡의 개수 N과 시작 볼륨 S, 그리고 M이 주어졌을 때, 마지막 곡을 연주할 수 있는 볼륨 중 최댓값을 구하는 프로그램을 작성하시오. 모든 곡은 리스트에 적힌 순서대로 연주해야 한다.
//첫째 줄에 N, S, M이 주어진다. (1 ≤ N ≤ 100, 1 ≤ M ≤ 1000, 0 ≤ S ≤ M) 둘째 줄에는 각 곡이 시작하기 전에 줄 수 있는 볼륨의 차이가 주어진다. 이 값은 1보다 크거나 같고, M보다 작거나 같다.
//첫째 줄에 가능한 마지막 곡의 볼륨 중 최댓값을 출력, 만약 마지막 곡을 연주할 수 없다면 (중간에 볼륨 조절을 할 수 없다면) -1을 출력한다.

public class BaekJoon1495GuitarVolume {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int musicNum = s.nextInt();
		int startVol = s.nextInt();
		int maxVol = s.nextInt();

		int[] volList = new int[musicNum + 1]; // 볼륨 리스트 만들기 dp와 짝을 맞추기위해 곡수 + 1을 해주고 1번인덱스부터 채워주었다.
		for (int i = 1; i <= musicNum; i++) {
			volList[i] = s.nextInt();
		}

		int[][] dp = new int[musicNum + 1][maxVol + 1]; // 시작볼륨을 넣기 위해서 곡수 +1 / 0도 볼륨으로 포함됨으로 맥스볼륨 + 1

		dp[0][startVol] = 1; // 디피 0번째 배열의 스타트 볼륨 값을 1로 바꿔줌

		for (int i = 1; i <= musicNum; i++) { // 0번줄은 시작볼륨이니 1부터 포문을 돌린다
			int vol = volList[i]; // 증가값 (볼륨리스트의 i 번째 값)을 변수에 넣어줌 (이렇게 동시에 쓰려고 볼륨리스트 길이를 +1을 해주었다)
			for (int j = 0; j <= maxVol; j++) { // 두번째 포문은 maxVol만큼 돈다.
				if (dp[i - 1][j] == 1) { // 만약 이전 배열 (전 곡의 볼륨이 1로 체크되어있다.) 값이 1이면 아래 if문 실행
					if (j + vol <= maxVol) {// 만약 j값이 + 증가값이 맥스보다 작거나 같으면 배열[i]의 j+증가값 칸을 1로 바꿔줌
						dp[i][j + vol] = 1;
					}
					if (j - vol >= 0) {// 만약 j값이 - 증가값이 0보다 크거나 같으면 배열[i]의 j-증가값 칸을 1로 바꿔줌
						dp[i][j - vol] = 1;
					}
				}

			}

		}
		// int result = dp[musicNum - 1].lastIndexOf(1); //왜안될까?
		for (int i = maxVol; i >= 0; i--) { // 배열이 완성되면 마지막 배열을 뒤에서부터 포문을 돌린다.
			if (dp[musicNum][i] == 1) { // 1이 나타나면 i값 (출력 후 브레이크)
				System.out.print(i);
				System.exit(0);

			}
		}
		System.out.println(-1);
	}
}
