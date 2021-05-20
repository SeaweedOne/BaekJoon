//통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
//영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이, 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
//민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이, 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
//동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다. 통화 시간은 10,000보다 작거나 같은 자연수이다.
//첫째 줄에 싼 요금제의 이름(영식은 Y로, 민식은 M)을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다. 만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.

import java.util.Scanner;

public class BaekJoon1267PhoneBills {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int y = 30; //요금이 청구되는 시간 정의 
		int m = 60;
		int cntY = 0; //요금을 누적시킬 값 정의 
		int cntM = 0;
		int testCase = s.nextInt(); //테스트케이스 인풋
		

		for (int i = 0; i < testCase; i++) { //테스트케이스만큼  for
			int time = s.nextInt(); //통화시간받아외기
			cntY += (time / y + 1)*10; //29초가 넘어가면 요금이 한번 더 청구되니 +1 을 해주고 가격을 곱한다. 
			cntM += (time / m + 1)*15; //시간초과횟수 * 가격
		}

		if (cntY < cntM) { //만약 영식요금제가 더 싸다면 영식요금제를 민식이 싸다면 민식을 둘이 가격이 같아면 둘 다 출력.
			System.out.println("Y " + cntY);
		} else if (cntY > cntM) {
			System.out.println("M " + cntM);
		} else {
			System.out.println("Y M " + cntY);
		}
		
	}
}