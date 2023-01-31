package homework.homework9;

import chapter6.Stack;

public class BraceChecker {


    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        StackForBraces stack = new StackForBraces();

        text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char sym = text.charAt(i);
            char sym2;
            switch (sym) {
                case '(':
                    stack.push(sym);
                    break;
                case '[':
                    stack.push(sym);
                    break;
                case '{':
                    stack.push(sym);
                    break;
                case ')':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else if (sym2 != '(') {
                        System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                    }
                    break;
                case ']':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else if (sym2 != '[') {
                        System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                    }
                    break;
                case '}':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else if (sym2 != '{') {
                        System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                    }
                    break;
            }
        }

    }
}
