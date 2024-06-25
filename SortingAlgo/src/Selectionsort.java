public class Selectionsort {
    public static void main(String[] args) {

        int[] arr = {2,1,4,3,9,6,5};
        selectionSort(arr, arr.length);
    }

    static int select(int arr[], int i)
    {
        int min = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j] < arr[min]){
                min = j;
            }
        }
        return min;
    }

    static void selectionSort(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            int min = select(arr,i);
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
