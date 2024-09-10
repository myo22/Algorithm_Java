import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        int x =  sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < N; i++){
            exist[a[i]] = true;
        }

        int ans = 0;

        for(int i = 0; i <= (x - 1) /2; i++){
            if(i <= 1000000 && x - i <= 1000000)
                ans += (exist[i] && exist[x - i]) ? 1 : 0;

//            int pairValue  = x - a[i]; // 쌍이되는 값을 찾는 것
//            if(1 <= pairValue && pairValue < 1000000){ // 인덱스로 사용할때는 항상 범위를 체크해야 한다.
//                ans += exist[pairValue] ? 1 : 0;
//            }
        }
        System.out.println(ans);


    }
}