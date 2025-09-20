package Easy;

import java.util.Stack;

public class MinAddtoMakeParenthesesValid {
    public static int minParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.size()!=0&&ch==')'&&st.peek()=='('){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
    String parenthesis =")()()";
        System.out.println(minParentheses(parenthesis));
    }
}
