class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
                PriorityQueue<int []>minh=new PriorityQueue<>(
            (a,b)->a[0] - b[0]
        );
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            int element = ent.getKey();
            int freq = ent.getValue();
            minh.add(new int[]{freq,element});
            if(minh.size()>k)minh.poll();
        }
         int[] ans=new int[k];
     for(int i=0;i<k;i++){
        ans[i]=minh.poll()[1]; //need to get element from 1st index not frequency on 0th
     }   
     return ans;
    }
}
















    
//         PriorityQueue<Integer>minh=new PriorityQueue<>(
//             (a,b)->map.get(a)-map.get(b)
//         );
//         for(int num : map.keySet()){
//             minh.add(num);
        
//         while(minh.size()>k){
//             minh.poll();
//     }
    
//     }
//     int[] ans=new int[k];
//      for(int i=0;i<k;i++){
//         ans[i]=minh.poll();
//      }   
//      return ans;
//     }

// }