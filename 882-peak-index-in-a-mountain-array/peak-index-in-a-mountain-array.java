class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int left=0;
       int right=arr.length-1; 


       while(left<right){
          int mid=(left+right)/2;

          if(arr[mid]>arr[mid+1])
             right=mid;
         else{
            left=mid+1;
         }
         
             


       }
       return left;
    }
}

/**
Use binary search to find the peak. If arr[mid] > arr[mid + 1], we are on the decreasing side, so the peak is at mid or to its left; otherwise, it lies to the right.

Complexity
Time complexity:

O(log n) because the search space is halved in each iteration.
Space complexity:

O(1) since only a few variables are used.
 */