import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class trash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] sequence = new int[end * (end + 1) / 2]; // 최대 길이의 수열 생성

        int idx = 0;
        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                sequence[idx++] = i; // 수열 생성
            }
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += sequence[i]; // 주어진 범위의 합 계산
        }

        System.out.println(sum);
    }
}
