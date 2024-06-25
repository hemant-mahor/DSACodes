public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,9,6,5};
        insertionSort(arr, arr.length);
    }

    static void insert(int arr[],int i)
    {
        int j=i;
        while (j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            insert(arr, i);
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
