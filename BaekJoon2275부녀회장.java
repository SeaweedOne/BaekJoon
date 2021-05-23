import java.util.Scanner;

//이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
//아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
//단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
//첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
public class BaekJoon2275부녀회장 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] apt = new int[15][15];

		int testCase = s.nextInt();

		for (int i = 0; i < 15; i++) { // 초기값 설정
			apt[0][i] = i; //0층 1호 = 1 2호 =2 3호 =3
//			apt[i][1] = 0; //각층의 1호는 1명
		}

		for (int i = 0; i < testCase; i++) { //테스트케이스만큼 돌며 숫자 받아오기 
			int floor = s.nextInt();
			int room = s.nextInt();

			for (int j = 1; j <= floor; j++) { // 해당 층/호의 인원은 아래층 같은호  + 바로 앞호 ( 302 = 202 + 301) 
				for (int k = 1; k <= room; k++) { //공식을 통해 포문돌며 아파트 채워주기 
					apt[j][k] = apt[j - 1][k] + apt[j][k - 1];
				}
			} System.out.println(apt[floor][room]); //해당 호수에 거주 인원 출력 

		}

	}

}
