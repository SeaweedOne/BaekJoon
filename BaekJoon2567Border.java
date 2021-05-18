//가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 
//이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 둘레의 길이를 구하는 프로그램을 작성하시오.
//첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 
//색종이의 수는 100이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다. 
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2567Border {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt(); //테스트케이스 받아주고 101*101배열을 생성한다 (좌표값을 그대로 쓰기위해)
		int[][] arr = new int[101][101];
		int result = 0; //둘레 값을 누적시킬 변수

		for (int i = 0; i < testCase; i++) { //1. 테스트케이스만큼 좌표 받아오기 
			int x = s.nextInt();
			int y = s.nextInt();

			for (int j = x; j < x + 10; j++) { //2. 인풋값을 받아 그 좌표 + 10 *10 (색종이의 넓이) 만큼을 1로 채워준다.
				for (int k = y; k < y + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}

		for (int i = 0; i < 101; i++) { // 3. 색종이의 넓이만큼 1이 채워진 배열의 요소들을 하나씩 확인한다. 만약 좌측과 상단에 0이 있다면 둘레는 1이 아닌 2가 더해져야한다.
			for (int j = 0; j < 101; j++) { 
				int[] temp = new int[4]; // 상하좌우를 확인할 4개짜리 배열을 만든다.
				if (arr[i][j] == 1) { //타겟이 1일때 상하좌우값을 배열에 temp배열에 넣어줌.
					temp[0] = arr[i][j - 1];
					temp[1] = arr[i][j + 1];
					temp[2] = arr[i - 1][j];
					temp[3] = arr[i + 1][j];

					for (int k = 0; k < temp.length; k++) { //temp 배열을 확인하기 위한 for문
						if (temp[k] == 0) { //배열에 들어있는 값이 0이라면 result변수를 하나씩 높여준다.
							result++;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
