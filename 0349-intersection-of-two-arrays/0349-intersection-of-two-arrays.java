class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Map<Integer,Integer> mp=new HashMap<>();
      
        for(int num:nums1){
            mp.put(num,1);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int num:nums2){
            if(mp.containsKey(num)){
                li.add(num);
                mp.remove(num);
            }
        }
        int n = li.size();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
         ans[i]=li.get(i);   
        }
        
        
       
        return ans;
    }
}