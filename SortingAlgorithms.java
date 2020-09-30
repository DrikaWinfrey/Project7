
package project7;

public class SortingAlgorithms 
{
    public static void BubbleSort(int[] array)
    {
        int k = 0;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if(array[j] > array[j+1])
                {
                    
                    int temp = array [j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    k++;
                    
                }
        System.out.print("Number of steps: " + k);
    }
    
    public static void BubbleSortCS(int[] array)
    {
        boolean Swap = false;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array [j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                    Swap = true;
                }
        
            if(Swap == false)
                break;
            }
    }
     
    public static void SelectionSort(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int minIndex = i;
            
            //Find the index of the minimum value in the array
            for(int j = i; j < array.length; j++)
            {
                if(array[j] < array[minIndex])
                    minIndex = j;
            }
            
            //swap element inth 
            int temp = array[i];
            array [i] = array[minIndex];
            array[minIndex]= temp;
        }
    }
    
    public static void InsertionSortWhile(int arr[]) 
    {
        int i, key, j;
        for (i = 1; i < arr.length; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
              arr[j + 1] = arr[j];
               j = j - 1;
            }
            arr[j + 1] = key;
        } 
    }
    
    public static void mergeSort(int[] array) 
    {
        if (array.length < 2)
           return;
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++)
            l[i] = array[i];
            
        for (int i = mid; i < array.length; i++)
            r[i - mid] = array[i];
               
        mergeSort(l);
        mergeSort(r);
                
        merge(array, l, r, mid, array.length - mid);
    }
    
    public static void merge(int[] array, int[] l, int[] r, int left, int right) 
    {
        int i = 0, j = 0, k = 0;
        
        while (i < left && j < right) 
        {
            if (l[i] <= r[j]) 
            {
                array[k] = l[i];
                i++;
            }
        
            else 
            {
                array[k] = r[j];
                j++;
            }
        
            k++;
        }
        
        while (i < left)
              array[k++] = l[i++];
        while (j < right)
              array[k++] = r[j++];
    }
    
    public static void quickSort(int[] array, int start, int end){
 
        int partition = partition(array, start, end);
 
        if(partition - 1 > start) 
        {
            quickSort(array, start, partition - 1);
        }
        if(partition + 1 < end) 
        {
            quickSort(array, partition + 1, end);
        }
    }
 
    public static int partition(int[] array, int start, int end)
    {
        int pivot = array[end];
 
        for(int i=start; i<end; i++)
        {
            if(array[i]<pivot){
                int temp= array[start];
                array[start]=array[i];
                array[i]=temp;
                start++;
            }
        }
 
        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;
 
        return start;
    }
    
    public static void heapSort(int[] array) 
    { 
        int n = array.length; 
  
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(array, n, i); 
  
        for (int i=n-1; i>0; i--) 
        { 
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp; 
   
            heapify(array, i, 0); 
        } 
    } 
  
 
    public static void heapify(int[] array, int n, int i) 
    { 
        int largest = i;  
        int l = 2*i + 1;
        int r = 2*i + 2; 
   
        if (l < n && array[l] > array[largest]) 
            largest = l; 
  
        if (r < n && array[r] > array[largest]) 
            largest = r; 
   
        if (largest != i) 
        { 
            int swap = array[i]; 
            array[i] = array[largest]; 
            array[largest] = swap; 
  
            heapify(array, n, largest); 
        } 
    } 
  
}
