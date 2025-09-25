package Easy;

import java.util.ArrayList;

public class GenerateBinaryNumbers {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> res = new ArrayList<>();
        for(int i =1;i<=n;i++){
            String binary = convertBinary(i);
            binary = binary+"1";
            StringBuilder sb = new StringBuilder(binary);
            res.add(sb.reverse().toString());
        }
        return res;
    }
    public String convertBinary(int n){
        StringBuilder sb = new StringBuilder("");
        while(n!=1){
            int rem = n%2;
             n = n/2;
            sb.append(rem);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GenerateBinaryNumbers obj = new GenerateBinaryNumbers();
        int n = 5;
        System.out.println(obj.generateBinary(n));
    }
}
