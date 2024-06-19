package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution("10 Z 20 Z"));
    }
}


class Solution {
    public static int solution(String s) {
        int a = 0;
        String x = "";
        int c = 1;
        int q = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(" ") && q == 1){continue;}
            if (s.substring(i, i +1).equals(" ")&&c == 0){
                a = a + Integer.parseInt(x);
                c = Integer.parseInt(x);
                x = "";
            }
            else if(s.substring(i, i +1).equals("Z")){
                a = a - c;
                q = 1;
            }
            else{
                x = x + s.substring(i, i +1);
                c = 0;
                q = 0;
            }
        }
        if ( s.substring(s.length()-1,s.length()).equals("Z")){
            return a;
        }
        return a + Integer.parseInt(x);
    }
}