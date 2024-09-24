package BruteForce;

import java.util.Scanner;

public class Algorithm_11005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        String ans = "";

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
