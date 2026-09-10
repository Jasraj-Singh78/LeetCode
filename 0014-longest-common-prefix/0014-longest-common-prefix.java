class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<n;j++){
                if(i>=strs[j].length())
                return strs[0].substring(0,i);

            char ch1=strs[0].charAt(i);
            char ch2=strs[j].charAt(i);

            if(ch1!=ch2)return strs[0].substring(0,i);

            }
           
        }
         return strs[0];
    }
}