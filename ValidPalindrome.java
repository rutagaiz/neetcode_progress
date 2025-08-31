package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "tab a cat";
        boolean answer = isPalindrome(s);
        System.out.println(answer);
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            char tempL = Character.toLowerCase(s.charAt(l));
            char tempR = Character.toLowerCase(s.charAt(r));
            if (tempL == tempR){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;

//        StringBuilder sentence = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            if (Character.isLetterOrDigit(temp)) {
//                sentence.append(Character.toLowerCase(temp));
//            }
//        }
//        int l = 0;
//        int r = sentence.length() - 1;
//        while (l < r) {
//            if (sentence.charAt(l) == sentence.charAt(r)) {
//                l++;
//                r--;
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
    }
}
