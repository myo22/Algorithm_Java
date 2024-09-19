import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] a = new int[45];

        for(int i = 1; i < 45; i++){
            a[i] = i * (i + 1) / 2;
        }

        for(int i = 0; i < T; i++) {

            int K = sc.nextInt();
            boolean found = false;

            for(int j = 1; j < a.length; j++){
                for(int k = 1; k < a.length; k++){
                    for(int l = 1; l < a.length; l++){
                        if(a[j] + a[k] + a[l] == K){
                            found = true;
                            break;
                        }
                    }
                    if(found){
                        break;
                    }
                }
                if(found){
                    break;
                }
            }

            if(found){
                System.out.println("1");
            }else {
                System.out.println("0");
            }

        }


    }
}