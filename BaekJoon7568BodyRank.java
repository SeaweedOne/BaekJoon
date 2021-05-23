import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시된다. 
//두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 
//그런데 두 사람 C와 D의 덩치가 각각 (45, 181), (55, 173)이라면 몸무게는 D가 C보다 더 무겁고, 키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.
//N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 
//첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
//여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.

public class BaekJoon7568BodyRank {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine()); //testCase 받아오기 

		int[][] bodyInfo = new int[testCase][2]; //testCase만큼의 배열 생성 ( 각 배열의 크기는 키와 몸무게 2개를 받기위해 2로 설정)

		for (int i = 0; i < testCase; i++) { // 테스트케이스만큼 포문 돌기 
			String[] input = br.readLine().split(" "); //라인 읽어서 공백을 기준으로 잘라주기 
			bodyInfo[i][0] = Integer.parseInt(input[0]); //i번째 사람의 몸무게 
			bodyInfo[i][1] = Integer.parseInt(input[1]); //i번째 사람의 키

		}

		for (int i = 0; i < testCase; i++) { //포문돌며 기본 랭크는 1로설정
			int rank = 1;

			for (int j = 0; j < testCase; j++) { //i사람을 기준으로 j가 돌며 비교 

				if (i != j) { //i와 j가 같지않을 때 j가 i보다 키와 몸무게 둘 다 크다면 랭크를 1 더해줌 (등수가 한개 밀려남) j가 배열의 마지막까지 돌며 비교 최종적으로 나보다 큰 사람이 몇명인지 판별 가능
					if ((bodyInfo[i][0] < bodyInfo[j][0]) && (bodyInfo[i][1] < bodyInfo[j][1])) {
						rank++;
					}
				}
			}
			System.out.print(rank + " "); //한줄에 출력해야 함으로 프린트를 이용해 출력 
		}

	}

}
