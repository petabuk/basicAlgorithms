public class Sort {


    public static void bubbleSort(int[] data){
        System.out.print("\nOriginal array:\n");
        printArr(data);
        boolean swapped;

       do {
           swapped = false;
           for (int i=0; i<data.length-1; i++){
               if (data[i] > data[i+1]){
                   int temp = data[i];
                   data[i] = data[i+1];
                   data[i+1] = temp;
                   printArr(data);
                   swapped = true;
               }




           }
       } while (swapped);


    }

    private static void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }




}
