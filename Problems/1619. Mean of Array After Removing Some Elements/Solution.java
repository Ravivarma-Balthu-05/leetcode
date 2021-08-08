import java.util.*;
class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        double max=((double)n/100)*5;
        int maxi = (int) max;
        Arrays.sort(arr);
        double sum = 0;
        if(maxi>0){
            for (int i=maxi ; i < n- maxi; i++) {
                sum += arr[i];
            }
        }
        return sum / (double)(n - 2*maxi);
    }
}
