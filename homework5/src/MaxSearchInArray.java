/**
 * Created by DsergiyenkoN on 26.12.2015.
 */
public abstract class MaxSearchInArray {
    public static int maxElementSearch(int[] arr, int fromWhereToBegin) {
        int max = arr[fromWhereToBegin];
        int maxElement = fromWhereToBegin;
        for (int i=fromWhereToBegin; i<arr.length; i++){
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }
}
