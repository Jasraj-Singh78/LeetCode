class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>seen=new HashSet<>();
        
        while(n!=1){
            int sum=0;
            int curr=n;
            while(curr!=0){
                int digit=curr%10;
                sum+=digit*digit;
                curr/=10;
            }
            if(seen.contains(sum))return false;
            seen.add(sum);
            n=sum;
        }
        return true;
    }
}