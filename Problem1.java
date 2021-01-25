
class Solution {
    int MissingNumber(int arr[], int n) {
        // Your Code Here
        // int n = arr.length + 1; // length of original array
        // arr.length => length of input
        Arrays.sort(arr);
        if(n != arr[n-2]){
            return n;
        }
        if(arr[0] != 1){
            return 1;
        }
        if(n==2){
            if(arr[0] == 1){
                return 2;
            }else if(arr[0] == 2){
                return 1;
            }
        }
        int low = 0;
        int high = n - 2;
        while(low <= high && (high-low)>1){
            int mid = low + (high - low)/2;
            int difference = arr[low]-low;
            if(mid+arr[0] == arr[mid]){
                // there is nothign missing in the first half
                low = mid;
            }else{ // mid-1 < arr[mid]
                high = mid;
            }
            // if I can find |arr[mid] - arr[mid+1]| > 1    
            //                  4           6 > 1
            //                         return (4+6)/2
        }
        // we know l, h
        return (arr[high]+arr[low])/2; //
        // return arr[low]+1;
    }
}
