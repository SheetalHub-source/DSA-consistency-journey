package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValidParenthesis(s));
    }

    private static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.empty()) st.push(ch);
            else if((ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[')){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }

        return st.empty();
    }
}
