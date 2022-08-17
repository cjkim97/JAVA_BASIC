import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner scanner = new Scanner(System.in); 백준에서는 비추하는 입력방법 

        // for(;;) : 무조건 참
        // while 에서는 조건식을 비울 수 없으므로 (true)를 추가해야 함

        // 백준 https://www.acmicpc.net/problem/25304 영수증

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_price = Integer.parseInt(br.readLine());
        int kind_count = Integer.parseInt(br.readLine());

        int price = 0;
        int ct = 0;
        int cal_price = 0;

        for (int i=0; i<kind_count; i++) {
            // 물건 종류 만큼 입력 받음
            String inp = br.readLine();
            StringTokenizer st = new StringTokenizer(inp, " ");
            price = Integer.parseInt(st.nextToken());
            ct = Integer.parseInt(st.nextToken());
            cal_price += price * ct;
        }
        if (cal_price != total_price) {
            System.out.print("No");
        }
        else {
            System.out.print("Yes");
        }
        br.close();
    
    }
}