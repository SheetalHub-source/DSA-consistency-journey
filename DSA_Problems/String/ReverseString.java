package String;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    private static String reverseString(String str) {
        int n = str.length();
      int left =0;
      int right = n-1;
      StringBuilder sb = new StringBuilder(str);
      while(left<right){
        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);
        left++;
        right--;
    }
        return sb.toString();
        }
}
