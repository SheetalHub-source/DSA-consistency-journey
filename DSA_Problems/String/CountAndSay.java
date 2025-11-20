package String;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println("The " + n + "th term in the Count and Say sequence is: " + result);
    }

    private static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        if (n == 1) {
            return "1";
        }

        String previousTerm = countAndSay(n - 1);
        StringBuilder currentTerm = new StringBuilder();

        int count = 1;
        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == previousTerm.charAt(i - 1)) {
                count++;
            } else {
                currentTerm.append(count).append(previousTerm.charAt(i - 1));
                count = 1;
            }
        }
        currentTerm.append(count).append(previousTerm.charAt(previousTerm.length() - 1));

        return currentTerm.toString();
    }
}
