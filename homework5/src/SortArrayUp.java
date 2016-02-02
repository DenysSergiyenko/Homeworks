import jdk.nashorn.internal.parser.Scanner;

/**
 * Created by DsergiyenkoN on 27.12.2015.
 */
public class SortArrayUp {
    public static int[] sortArray(int[] arr) {

        for (int j = 0; j < arr.length-1; j++) {
            int maxElement = j;
            int maxValue = arr[j];
            if (j==3) {  //желательно не используемые куски кода убирать
                //System.out.println("maxElement =" + maxElement);
                //System.out.println("maxValue =" + maxValue);
            }
            for (int i = j; i < arr.length-1; i++) {
                if (arr[i + 1] > maxValue) {
                    maxElement = i+1;
                    maxValue = arr[i + 1];
                }
            }
            //System.out.println("(" + j + "): maxValue=" + maxValue + "  maxElement=" + maxElement);

            //int temp = arr[maxElement];            arr[maxElement]=arr[j];            arr[j]=temp;

            if (j == maxElement) continue;

            arr[j] = arr[j] + arr[maxElement];
            arr[maxElement] = arr[j] - arr[maxElement];
            arr[j]=arr[j]-arr[maxElement];


            //arr[maxElement]=arr[maxElement]+arr[j];
           // arr[j]=arr[maxElement]-arr[j];
        }
        return arr;
    }
}
