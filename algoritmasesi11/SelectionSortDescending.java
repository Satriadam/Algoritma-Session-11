public class SelectionSortDescending {
    public static void main(String[] args) {
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array sebelum pengurutan:");
        printArray(arr);
        
        selectionSortDescending(arr);
        
        System.out.println("\nArray setelah pengurutan descending:");
        printArray(arr);
    }
    
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        
        
        for (int i = 0; i < n-1; i++) {
           
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}