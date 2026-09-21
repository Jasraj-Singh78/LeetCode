class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp  = new HashMap<>();
        int n = s.length();
        for(char ch :s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            if(mp.get(s.charAt(i))==1)return i;
        }
        return -1;
    }
}