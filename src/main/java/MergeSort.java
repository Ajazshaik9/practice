import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int []arr = {1,4,2,5,3,7,9,8,12,9,15,18,21,11,15,13,19,20};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid); // left half
            mergeSort(arr, mid + 1, r); // right half
            merge(arr, l, mid, r); // merging sorted halves
        }
    }
    static void merge(int arr[], int low, int mid, int high) {
        int i = low; // starting index of left half of arr
        int j = mid + 1; // starting index of right half of arr
        int k = 0; // index used to transfer elements in temporary array
        int res[] = new int[high-low+1]; // temporary array

        // storing elements in the temporary array in a sorted manner//

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }

        // if elements on the right half are still left //

        if (i > mid) {
            while (j <= high) {
                res[k] = arr[j];
                k++;
                j++;
            }
        } else {
            // if elements on the left half are still left //
            while (i <= mid) {
                res[k] = arr[i];
                k++;
                i++;
            }
        }
        // transfering all elements from temporary to arr //
        k=0;
        for (int q = low; q <= high; q++) {
            arr[q] = res[k];
            k++;
        }
    }
}