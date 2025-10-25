package String;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        int n = s.length()-1;
        boolean isWord=false;
        char ch ='1';
        int count=0;
        while(n>=0){
           if(s.charAt(n)!=' '){
               isWord=true;
               count++;
           }
           if(s.charAt(n)==' '&&isWord) break;
           n--;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World       ";
        System.out.println(lengthOfLastWord(s));
    }
}
