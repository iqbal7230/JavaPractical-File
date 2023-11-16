public class SortingAlgorithm{
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 36, 98, 75, 68, 44};

        System.out.println("Original Array:");
        printArray(arr);


        bubbleSort(arr);

    
        selectionSort(arr);

 
        insertionSort(arr);
    }



    static void printArray(int[] arr) {
        for (int num : arr) { 
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++) {
        
            for (int j = 0; j < n - i - 1; j++) {
             
                if (arr[j] > arr[j + 1]) {
           
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    
        System.out.println("Array sorted using Bubble Sort:");
        printArray(arr); 
    }
    

    static void selectionSort(int[] arr) {
        int n = arr.length; 
    

        for (int i = 0; i < n - 1; i++) { 
            int minIndex = i; 
    
           
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                   
                    minIndex = j;
                }
            }
    
           
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    
        System.out.println("Array sorted using Selection Sort:"); 
        printArray(arr); 
    }
    

   

    static void insertionSort(int[] arr) {
        int n = arr.length;  
        for (int i = 1; i < n; i++) {  
            int k = arr[i];  
            int j = i - 1;  
    
            
            while (j >= 0 && arr[j] > k) { 
                

                arr[j + 1] = arr[j];  
                j--; 
            }
    
            arr[j + 1] = k;  
        }
        System.out.println("Array sorted using Insertion Sort:");  
        printArray(arr);  
    }
    
}