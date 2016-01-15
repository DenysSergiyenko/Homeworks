/**
 * Created by DsergiyenkoN on 26.12.2015.
 */
public class homework5 {
    //public static final int ARRAY_ELEMENTS_CONST = 10;

    public static void main (String[] args){
        //final int arrayElemnts10 = ARRAY_ELEMENTS_CONST;


        int[] arr1 = {155, -6, 100, 50, 20, -55, 6,-100, 50, -20, -500};
        //int[] arr1 = {6, 55, 50, 20, 100};
        //int[] arr2 = new int[];
        //System.out.println("array has the following " + arr1.length + " elements:");
        //for (int i =0; i < arr1.length; i++) {
        int counter = 0;
        for (int a : arr1) {
            System.out.print("arr[");
            System.out.print(counter);
            System.out.print("]=");
            System.out.println(a);
            counter++;
        }
        System.out.println();
        //System.out.println("max array value =" + MaxSearchInArray.maxElementSearch(arr1,0));
        //System.out.println();
        //System.out.println("min array value =" + MinSearchInArray.minArrayValue(arr1,0));
        //System.out.println();

        int[] arr2 = SortArrayShakerMethod.sort(arr1);

        counter = 0;
        for (int a : arr2) {
            System.out.print("[");
            System.out.print(a); //System.out.print(counter);
            System.out.print("], ");

            counter++;
        }
    }


}
