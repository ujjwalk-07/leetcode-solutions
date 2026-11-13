class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int aditions = 0;

        for (char ch : s.toCharArray())  {
            if(ch == '('){
                st.push('(');

            }
            else {
                if(st.isEmpty()){
                    aditions++;
                }
                else{
                    st.pop();
                }
            }
           
        }
         return aditions+st.size();
    }
}
