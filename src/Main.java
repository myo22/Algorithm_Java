import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        boolean found = false;
        int[] ans = new int[7];

        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    int index = 0;
                    for(int k = 0; k < 9; k++){
                        if(k != i && k != j){
                            ans[index++] = arr[k];
                        }
                    }
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }

        Arrays.sort(ans);

        for(int i = 0; i < 7; i++){
            System.out.println(ans[i]);
        }


    }
}