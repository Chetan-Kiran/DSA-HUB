class Solution {
    public int findMin(int[] arr) {
        
        int len = arr.length;
        int l=0, r=len-1 ,min = Integer.MAX_VALUE, mid=0;

        while(l <= r){
            mid = l + (r - l) / 2;

            if(arr[l] <= arr[mid]){
                min = Math.min(min, arr[l]);
                l = mid+1;
            }else if(arr[mid] <= arr[r]){
                min = Math.min(min, arr[mid]);
                r = mid-1;
            }
        }
        return min;
    }
}