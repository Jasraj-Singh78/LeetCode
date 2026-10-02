class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
        //move left until it reaches a vowel
        while(left<right && !isVowel(arr[left]))left++;

        //move right until it reaches a vowel
        while(left<right && !isVowel(arr[right]))right--;
        
            //once they hit swap both
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return new String(arr);
        }
        private boolean isVowel(char c){
            return "aAeEiIoOuU".indexOf(c)!=-1;
        }
    }
