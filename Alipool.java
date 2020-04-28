package New2020.alitest;

import java.util.Arrays;
import java.util.Scanner;

public class Alipool {


    private int findIndex(int[][] arr, int target) {
        int l = 0, r = arr.length;
        while(l < r) {
            int mid = (r - l) / 2 + l;
            if(target >= arr[mid][0]) r = mid;
            else l = mid + 1;
        }
        return r;
    }


    private void alipool(int[][] arr, int allocatFund) {
        System.out.println("hello");
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int remFund = allocatFund;
        int curLevel = arr[0][0];
        while(true) {
            curLevel -= 1;
            int index = findIndex(arr, curLevel);
            // 如果剩余资金多于index*1， 减去index*1
            if(remFund > index) {
                remFund -= index;
                for (int i = 0; i < index; i++) arr[i][0] -= 1;
            } else break; //否则减去index个1
        }

        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
        System.out.println("allocateFund: " + allocatFund);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
        }
        int allocatFund = sc.nextInt();
        new Alipool().alipool(arr, allocatFund);
    }


}
