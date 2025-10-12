package Array.Easy;

public class MaximumNumberOfWordsYouCanType {
    public static int canBeTypedWords(String text, String brokenLetters) {
        boolean broken[] = new boolean[26];
        for(int i=0;i<brokenLetters.length();i++){
            char ch = brokenLetters.charAt(i);
            broken[ch-'a']=true;
        }
        boolean missing = false;
        int totalWords = 0;
        int incompleteWord = 0;
        for(int i =0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch==' '){
                if(missing){
                    incompleteWord++;
                }
                totalWords++;
                missing = false;
            }

            else{
                if(broken[ch-'a']){
                    missing = true;
                }
            }
        }
        totalWords++;
        if(missing) incompleteWord++;
        return totalWords-incompleteWord;
    }
    public static void main(String[] args) {
      String  text = "hello world", brokenLetters = "ad";
        System.out.println(canBeTypedWords(text,brokenLetters));

    }
}
