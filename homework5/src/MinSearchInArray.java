/**
 * Created by DsergiyenkoN on 26.12.2015.
 */
public class MinSearchInArray {
    public static int minArrayValue (int[] arr, int fromWhereToBegin){
        int min = arr[fromWhereToBegin];
        for (int i=fromWhereToBegin;i<arr.length;i++){
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }
}
