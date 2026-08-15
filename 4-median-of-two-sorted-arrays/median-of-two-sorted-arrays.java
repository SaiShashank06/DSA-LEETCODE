class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j,k=0,len=nums1.length+nums2.length;
        double mid;
        int a[]=new int[len];
        for(i=0,j=0;i<nums1.length&&j<nums2.length;){
            if( nums1[i]<nums2[j]){
              a[k++]=nums1[i++];
            }
            else{
                a[k++]=nums2[j++];
            }

        }
        while(i<nums1.length)
        a[k++]=nums1[i++];
        while(j<nums2.length)
        a[k++]=nums2[j++];
         
    if(len%2 !=0){
        mid=a[a.length/2];
        return mid;
    }
    else{
        
        mid=(a[len/2]+a[len/2-1])/2.0;
        return mid;
    }
    }
}
    
    





