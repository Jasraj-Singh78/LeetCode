class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            // Shift elements to the right starting from the end
            if(arr[i]==0){
                for(int j=n-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                // Skip the next index since we just placed a duplicated zero there
                i++;
            }
        }
    }
}