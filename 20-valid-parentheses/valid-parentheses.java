class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            //if open bracket 
            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push(ch);
            }
            else{
                // if ch is closing 
                //check stack top and before check empty
                if(st.isEmpty()){
                    return false;
                }
                if(ch == ')' && st.peek() != '('){
                    return false;
                }
                else if(ch == ']' && st.peek() != '['){
                    return false;
                }
                else if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        //if stack empty
        if(st.isEmpty()){
            return true;
        }
        else
        return false;
    }
}