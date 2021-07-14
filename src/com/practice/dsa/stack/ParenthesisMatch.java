package com.practice.dsa.stack;

import java.util.*;

public class ParenthesisMatch {
    public static void main(String[] args) {
        String str = "{ABC(EFG)[PQR]}";
        boolean flag = checkParenthesis(str);
        System.out.println(flag);
    }

    private static boolean checkParenthesis(String str) {
        Map<Character, Character> matchingParenthesisMap = new HashMap<>();
        matchingParenthesisMap.put('}','{');
        matchingParenthesisMap.put(')','(');
        matchingParenthesisMap.put(']','[');

        Set<Character> openingParenthesisSet = new HashSet<>(matchingParenthesisMap.values());

        LinkedList<Character> stack = new LinkedList<>();

        for(int i=0; i<str.length();i++){
            Character ch = str.charAt(i);
            if(openingParenthesisSet.contains(ch)){
                stack.push(ch);
            }

            if(matchingParenthesisMap.containsKey(ch)){
                Character lastChar = stack.pop();
                if(lastChar!=matchingParenthesisMap.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
