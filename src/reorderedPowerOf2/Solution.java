package reorderedPowerOf2;

import java.util.Arrays;

public class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(n==0) return false;
        if(n==1) return true;
        int[] arrN = freqAr(n);

        for(int i=0; i<30; i++){
            int m = 1 << i;
            int[] arrM = freqAr(m);
            if(Arrays.equals(arrN, arrM)) return true;
        }

        return false;
    }

    public int[] freqAr(int n){
        int[] arr = new int[10];

        while (n > 0){
            arr[n%10]++;
            n /= 10;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reorderedPowerOf2(812));
    }
}
