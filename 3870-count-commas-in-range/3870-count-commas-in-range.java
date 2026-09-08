import java.text.NumberFormat;
import java.util.Locale;
class Solution {
    public int countCommas(int n) {
        // return Math.max(0,n-999);
        int count=0;
        int threshold=1000;
        while(n>=threshold){
            count+=(n-threshold+1);
            threshold*=1000;
        }
        return count;
    }
}