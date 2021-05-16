//3개의 시간조절용 버튼 A B C가 달린 전자레인지가 있다. 해당 버튼을 한번 누를 때마다 그 시간이 동작시간에 더해진다. 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초이다.
//냉동음식마다 요리해야할 시간 T가 초단위로 표시되어 있다. 우리는 A, B, C 3개의 버튼을 적절히 눌러 그 시간의 합이 정확히 T초가 되도록 해야 한다. 단 버튼 A, B, C를 누른 횟수의 합은 항상 최소가 되어야 한다. 
//여러분은 T초를 위한 최소버튼 조작의 A B C 횟수를 첫 줄에 차례대로 출력해야 한다. 누르지 않는 경우에는 숫자 0을 각각의 횟수 사이에는 빈 칸을 둔다. 3개의 버튼으로 T초를 맞출 수 없으면 -1을 첫 줄에 출력. 
import java.util.Scanner;

public class BaekJoon10162MicroWave {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = 300; //각각 버튼의 시간 정의 
		int B = 60;
		int C = 10;
		int cntA = 0; //버튼마다 횟수를 누적할 변수 정의 
		int cntB = 0;
		int cntC = 0;

		int T = s.nextInt(); //요리시간 input받기

		cntA = T / A; //가장 큰수부터 차례로 나눠 내려오며 그 몫을  count 변수에 넣어줌
		T = T % A; //T를 나머지 값으로 재정의 

		cntB = T / B;
		T = T % B;

		cntC = T / C;
		T = T % C;

		if (T == 0) { //만약 연산 후의 값이 0이라면 각 버튼의 count 변수 출력
			System.out.println("" + cntA + " " + cntB + " " + cntC + " ");
		} else { //0이 아니라면 시간을 정화하게 맞출 수 없음으로 -1출력
			System.out.println(-1);
		}
	}
}
