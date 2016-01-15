/**
 * Created by DsergiyenkoN on 02.01.2016.
 */
public class SortArrayShakerMethod {

    public static int[] sort (int[] arr) {
        int leftSideSorted=0;
        int rightSideSorted=arr.length;
        boolean swapOccuered=true;
        while ((swapOccuered)){
            swapOccuered=false;
            for (int i=leftSideSorted; i<rightSideSorted-1; i++) {
                if (arr[i]>arr[i+1]) {
                    arr[i+1]=arr[i]+arr[i+1];
                    arr[i]=arr[i+1]-arr[i];
                    arr[i+1]=arr[i+1]-arr[i];
                    swapOccuered = true;
                }
            }
            rightSideSorted--;
            for (int i = rightSideSorted; i>leftSideSorted; i--){
                if (arr[i]<arr[i-1]) {
                    arr[i]=arr[i]+arr[i-1];
                    arr[i-1]=arr[i]-arr[i-1];
                    arr[i]=arr[i]-arr[i-1];
                    swapOccuered = true;
                }
            }
            leftSideSorted++;
        }
        return arr;
    }

}
