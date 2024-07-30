public class RotatedSortedArr {
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] >= arr[low]) {
                if (target >= arr[low] && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (target <= arr[high] && target > arr[mid]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
        /* Approach:


         */
        public int search1(int[] arr, int k) {
            // 0 1 2 3 4 5 6 <- Indexes
            // Ex: arr = [4,5,6,7,0,1,2], k = 0, Output: 4


            int low = 0;
            int high = arr.length - 1;

            while(low <= high){
                // Find middle index
                int mid = (low + high) / 2;
                // Quick check to see if we found the k high away
                if(k == arr[mid]){
                    return mid;
                }

                // Left Sorted Portion
                if(arr[low] <= arr[mid]){
                    // first condition is normal BS if k greater then make low equal mid+1
                    // second condition checks since rotated, k lesser than arr[low] its rotated check high sorted portion
                    if(k > arr[mid] || k < arr[low]){
                        low = mid + 1;   // Normal Binary Search make low mid+1;
                    }
                    else{
                        high = mid - 1;  // obviously if the other side fails we just make high equal mid-1; Normal BS
                    }
                }
                // Right Sorted Portion of Array
                else{
                    if(k < arr[mid] || k > arr[high]){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
            }
            return -1;
        }
}
