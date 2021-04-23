import java.util.Scanner;

public class BaekJoon5585Change {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("거스름돈의 액수를 입력하세요.");
		int inputNum = s.nextInt();
		int coin1 = 5;
		int coin2 = 2;
		int cnt5 = 0;
		int cnt2 = 0;

		while (inputNum > 0) {
			if (inputNum % coin1 == 0) {//인풋값이 5의 배수이면 나눠서 출력하고 바로 탈출
				cnt5 = inputNum / coin1;
				System.out.println("거스름돈 " + cnt5);
				break;
			} else if (inputNum % coin2 == 0) { //인풋값이 2의 배수이면 나눠서 출력하고 바로 탈출
				cnt2 = inputNum / coin2;
				System.out.println("거스름돈 " + cnt2);
				break;
			} else {
				while (true) {
					inputNum = inputNum - coin2; //2로 계속 빼기 
					cnt2++;
					if (inputNum % 5 == 0) {//남은 돈을 5로 나누었을 때 0이나오면 브레이크 
						cnt5 += inputNum / coin1;
						inputNum = inputNum % coin1;
						System.out.println("거스름돈 " +(cnt5 + cnt2));
						break;
					} else if(inputNum<coin2){ //5로 나눈 나머지가 0이아니고 2보다 작으면 -1출력
						System.out.println(-1);
						break;
					}
				}
			}
		}
	}
}
