package sort;

public class sortTestClient
{
    public static void main(String args[])
    {
        int [] unsortedArray = {3, 1, 4, 6, 8, 1, 9, 9, 7};
        System.out.println("Printing unsorted array...");
        for (int i = 0; i < unsortedArray.length; i++)
        {
            System.out.print(unsortedArray[i]);
        }
        System.out.println(" ");
        int [] selectionSortedArray = sort.selectionSort(unsortedArray);
        System.out.println("Printing array sorted by selection sort...");
        for (int i = 0; i < selectionSortedArray.length; i++)
        {
            System.out.print(selectionSortedArray[i]);
        }
        System.out.println(" ");
        int [] insertionSortedArray = sort.selectionSort(unsortedArray);
        System.out.println("Printing array sorted by insertion sort...");
        for (int i = 0; i < insertionSortedArray.length; i++)
        {
            System.out.print(insertionSortedArray[i]);
        }
        System.out.println(" ");
        int [] bubbleSortedArray = sort.selectionSort(unsortedArray);
        System.out.println("Printing array sorted by bubble sort...");
        for (int i = 0; i < bubbleSortedArray.length; i++)
        {
            System.out.print(bubbleSortedArray[i]);
        }
        System.out.println(" ");
        int [] mergeSortedArray = sort.selectionSort(unsortedArray);
        System.out.println("Printing array sorted by merge sort...");
        for (int i = 0; i < mergeSortedArray.length; i++)
        {
            System.out.print(mergeSortedArray[i]);
        }
        System.out.println(" ");
    }
}
