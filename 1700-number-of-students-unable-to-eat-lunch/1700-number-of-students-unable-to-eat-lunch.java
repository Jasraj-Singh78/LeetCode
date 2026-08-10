class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
       
      
            for(int i=0;i<len;i++){
                q.add(students[i]);
                st.push(sandwiches[len-1-i]);
              
                
            }
              int count=0;
            while(!q.isEmpty()){
                if(q.peek()==st.peek()){
                    q.poll();
                    st.pop();
                    count=0;
                }
                else {
                        q.add(q.peek());
                        q.poll();
                        count++;
                        if(count==q.size())break;
                }
            }
        return q.size(); //or stack size
    }
}