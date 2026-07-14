class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>h=new HashSet<>();
        int i=0;
        int j=0;
        int maxlength=0;int n=s.length();
        while(j<n){
            char ch = s.charAt(j);

            if(!h.contains(ch)){
                h.add(ch);
                maxlength=Math.max(maxlength,j-i+1);
                j++;
            }
            else{
                while(h.contains(ch)){
                    h.remove(s.charAt(i));
                    i++;
                }
            }
        }
        
        return maxlength;
    }
}