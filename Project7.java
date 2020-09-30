
package project7;

import java.util.Arrays;
import java.util.Random;
public class Project7 
{
   
    public static void main(String[] args) 
    {
        int size = 10;
        int[] array = new int [size];
        populateArray(array);
        
        long start, elapsed;
        
        start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Bubble Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortCS(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Bubble Sort CS: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.SelectionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Selection Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.InsertionSortWhile(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Insertion Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Merge Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.quickSort(array.clone(), 0, array.length - 1);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Quick Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        Arrays.sort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Java Sort: %,d\n", elapsed);
        
        start = System.currentTimeMillis();
        SortingAlgorithms.heapSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Heap Sort: %,d\n", elapsed);
        
    }
    
    public static void populateArray(int[] array)
    {
      Random rand = new Random();
      
      for(int i = 0; i < array.length;i++)
          array[i] = rand.nextInt(1000);
    }
    
    public static void printArray(int [] array)
    {
        for (int e: array)
            System.out.print(e + ",");
        
        System.out.println();
    }
}
