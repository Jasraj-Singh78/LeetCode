class Solution {
    public static void solve(String ip,String op,List<String>ans){
        //base Case
        if(ip.length()==0){
            ans.add(op);
            return;
        }
        char ch = ip.charAt(0);
        // If character is a digit , only one choices
        if(Character.isDigit(ch)){
            solve(ip.substring(1),op+ch,ans);
        }
        else{
        String op1 = op;
        String op2 = op;
     
        op1= op1+Character.toLowerCase(ch);
        op2= op2+Character.toUpperCase(ch);
        ip=ip.substring(1);
        solve(ip,op1,ans);
        solve(ip,op2,ans);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        String op = "";
        solve(s,op,ans);
        return ans;
    }
}