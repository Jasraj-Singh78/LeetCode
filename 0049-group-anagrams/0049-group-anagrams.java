class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String word : strs){
            //convert string into character
            char ch[]=word.toCharArray();
            //sort on key bases
            Arrays.sort(ch);
            // create key
            String key = new String(ch);
            //Add string to corresponding group
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(word);

        }
        return new ArrayList<>(mp.values()); //why again arraylist beacuse we need to return array list of list this will
                                                //return in list of list
    }
}