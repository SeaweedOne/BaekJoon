import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
//달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
public class BaekJoon2869Snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String temp  = br.readLine();
		String[] tempList = temp.split(" ");
		
		int A = Integer.parseInt(tempList[0]);
		int B = Integer.parseInt(tempList[1]);
		int V = Integer.parseInt(tempList[2]);

		int snail = 0;
		double day = (V - B) / (double)(A - B);
		double tempResult = Math.ceil(day);
		int result = (int) tempResult;
		System.out.println(result);

//나무에서 B를 뺴지 않고 그냥 하루 이동거리만 가지고 처리하게되면 마지막날 낮에 달팽이가 정상에 도달할 수 있음에도 밤이 되어 흘러내리는 것까지 반영되어 실제 걸리는 날짜보다 +1이 더해진다. 
//마지막 날 달팽이가 정상에 도달하면, 흘러내리지 않음에도 조건문이 아닌 단순 수식이기 떄문에 마지막날을 예외처리해줄 수 없다.
//그래서 나는 미리 (나무의 값 - 마지막날 흘러내릴 값) 으로 나무의 길이를 미리 깎아둠으로써 하루이동거리만으로도 수식을 쉽게 처리할 수 있도록 했다.
//그리고 식의 결과가 1.000001이더라도 1.00001은 1이 아님으로 하루를 초과한 것이기 때문에 소수점은 무조건 올림처리해줌으로서 모든 케이스들을 커버했다.

	}

}
