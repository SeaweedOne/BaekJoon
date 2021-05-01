//흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
//사분면은  1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//예를 들어, (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
//점의 좌표를 입력받아 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 


import java.util.Scanner;

public class BaekJoon14681Quadrant {
	public static void main(String[] args) {

		System.out.println("x값을 입력하세요.");
		Scanner s = new Scanner(System.in); // 사용자 입력값 1
		int x = s.nextInt();
		
		System.out.println("y값을 입력하세요.");
		Scanner s2 = new Scanner(System.in); // 사용자 입력값 2
		int y = s2.nextInt();
		
		System.out.println("입력하신 숫자는 (x,y) : " + x +","+ y);

		if (x > 0 && y > 0) {
			System.out.println("Quadrant 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrant 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrant 3");
		} else {
			System.out.println("Quadrant 4");
		}
		
	}

}
