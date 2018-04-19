public class Demo {



    public static void main(String[] args){


        int [] randomNumbers = {12,65,33,987,56,113,34,63,91};
        int[] dataNumbers = {1,2,5,21,89,95,120,460,1100,1400,9700};



        int linearSearch = Search.linearSearch(randomNumbers,113);
        System.out.println("find at position "+linearSearch);


        int binarySearch = Search.binarySearch(dataNumbers,21,0,dataNumbers.length);
        System.out.println("find at position "+binarySearch );

        Sort.bubbleSort(randomNumbers);




    }
}
