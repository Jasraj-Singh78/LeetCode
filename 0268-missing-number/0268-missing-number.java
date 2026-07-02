class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;                       //Approach 2 is using formula n=n*(n+1)/2 formula then compute the original array
                                                    // then subtract value of n - nums array;
        for(int i=0;i<nums.length;i++){
              xor^=i;
              xor^=nums[i]; 
              //xor=3(nums.length because we are computer it with that ) 
        //Concept xor = 3 ^ 0 = 3
               // xor = 3 ^ 3 = 0
            }
               return xor;
        }
     
        
    }
