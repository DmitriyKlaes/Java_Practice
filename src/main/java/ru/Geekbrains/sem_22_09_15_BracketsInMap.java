package ru.Geekbrains;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/

import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class sem_22_09_15_BracketsInMap {

    public static Map<Character, Character> bracketMap = Map.of('(',')',
                                                                '[',']',
                                                                '{','}',
                                                                '<','>');

    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        brackets("a+(d*3)");

    }
    public static void brackets (String str) {
        LinkedList<Character> charStack = new LinkedList<>();
        for (Character ch: str.toCharArray()) {
            if (bracketMap.containsKey(ch)) {
                charStack.push(ch);
            } else if (bracketMap.containsValue(ch)){

            }

        }
    }


//
//    public static Map<Character,
//    public static void main(String[] args) {
//        LinkedList<Character> linkedList = new LinkedList<>();
//        String str = "{a+]}{(d*3)} ";
//        for (char ch : str.toCharArray()) {
//            if (bracketsMap.containsKey(ch)) {
//                linkedList.push(ch);
//            } else {
//                if (bracketsMap.containsValue(ch)) {
//                    if (linkedList.isEmpty()) {
//                        System.out.println(false);
//                        return;
//                    }
//                    Character openBracket = linkedList.pop();
//                    if (!bracketsMap.get(openBracket).equals(ch)) {
//                        System.out.println(false);
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println(linkedList.isEmpty());
//    }

}
