package BruteForce;

import java.util.Scanner;

public class Algorithm_11005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        String ans = "";

        // 1. N을 B로 나눈 나머지를 구하고, B로 나누자
        // 2. 이때 가장 마지막 나머지부터 가장 자릿값이 된다.
        while (N > 0) {
            int digit = N % B;
            if (digit < 10){
                ans += digit;
            }else{
                ans += (char) ('A' + digit - 10);
            }
            N /= B;
        }

        for(int i = ans.length() - 1; i >= 0; i--){
            System.out.print(ans.charAt(i));
        }

    }
}
