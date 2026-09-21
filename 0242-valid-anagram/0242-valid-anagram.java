class Solution {
    public boolean isAnagram(String s, String t) {
      Map <Character,Integer> map = new HashMap<>();
      if(s.length()!=t.length())return false;
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);// add into map for string s
      }
      for(int i=0;i<t.length();i++){ 
        char ch = t.charAt(i);
        if(!map.containsKey(ch))return false; //if key mismatch obv false
        map.put(ch,map.get(ch)-1);   //if key matched subtract it 
        if(map.get(ch)==0){             //if key value becomes zero remove it
            map.remove(ch);
        }
            
        }
        return map.isEmpty();  //after removing value if map is empty return empty map as the strings are anagram
      }
      
        
    }
