public class BubbleSortAscending {
    public static void main(String[] args) {
        
        String[] kota = {"Semarang", "Malang", "Cianjur", "Sukabumi", "Jakarta", "Bekasi", "Denpasar"};
        
        System.out.println("Array kota sebelum pengurutan:");
        printArray(kota);
        
        bubbleSortAscending(kota);
        
        System.out.println("\nArray kota setelah pengurutan ascending:");
        printArray(kota);
    }
    
    public static void bubbleSortAscending(String[] arr) {
        int n = arr.length;
        boolean swapped;
        
        
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            
            for (int j = 0; j < n-1-i; j++) {
                
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void printArray(String[] arr) {
        for (String kota : arr) {
            System.out.print(kota + " ");
        }
        System.out.println();
    }
}