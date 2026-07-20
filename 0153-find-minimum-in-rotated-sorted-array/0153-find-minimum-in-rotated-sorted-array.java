class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            if(arr[start]<=arr[end])return arr[start];
            int mid=start+(end-start)/2;

            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;

            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next])
                return arr[mid];
            if(arr[start]<=arr[mid])start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    }
