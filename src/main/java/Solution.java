class Solution {
    public static void main(String[] args) {
        String str = "Aja";
                //"Leetcode is cool";
                //"leetcode exercises sound delightful";
        System.out.println(isCircularSentence(str));
    }
    public static boolean isCircularSentence(String s) {
        String []arr = s.split(" ");
        int k=0;
        for(String a:arr)
            arr[k++]=a.toLowerCase();
        if(arr.length==1) return arr[0].charAt(0)==arr[0].charAt(s.length()-1);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1].charAt(arr[i-1].length()-1)!=arr[i].charAt(0)) return false;
            //if(arr[i-1].charAt(arr[i-1].length()-1))
        }
        if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr[arr.length-1].length()-1)) return false;
        return true;
    }
}
//
//class Solution {
//    public static void main(String[] args) {
//        int []arr = {3,2,5,1,3,4,1,5,2,4};
//        System.out.println(dividePlayers(arr));//Brace yourself solution accepted😵‍
//    }
//    public static long dividePlayers(int[] arr) {
//        mergeSort(0,arr.length-1,arr);
//        int n=arr.length;
//        long res=0,prevSum=arr[0]+arr[n-1];
//        for(int i=1;i<n/2;i++)
//        {
//            //res += prevProd;
//            if(arr[i]+arr[n-1-i]!=prevSum) return -1;
//            prevSum=arr[i]+arr[n-1-i];
//            //prevProd=arr[i]*arr[n-1-i];
//        }
//        for(int i=0;i<n/2;i++)
//        {
//            res += arr[i]*arr[n-1-i];
//        }
//        return res;
//
//    }
//
//    public static void mergeSort(int low, int high, int[] arr)
//    {
//        if(low==high) return;
//        int mid = low + (high-low)/2;
//        mergeSort(low,mid,arr);
//        mergeSort(mid+1,high,arr);
//        merge(low,mid,high,arr);
//    }
//    public static void merge(int low, int mid, int high, int[] arr)
//    {
//        int i=low,j=mid+1,k=0;
//        int []res = new int[high-low+1];
//        while(i<=mid && j<=high)
//        {
//            if(arr[i]<arr[j]) res[k]=arr[i++];
//            else res[k]=arr[j++];
//            k++;
//        }
//        while(j<=high) res[k++]=arr[j++];
//        while(i<=mid) res[k++]=arr[i++];
//        k=0;
//        for(i=low;i<=high;i++) arr[i]=res[k++];
//    }
//}