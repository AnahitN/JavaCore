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
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char sym = text.charAt(i);
            char sym2;

            switch (sym) {
                case '(':
                case '[':
                case '{':
                    stack.push(sym);
                    break;
                case ')':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else {
                        lastBracket = (char) sym2;
                        if (lastBracket != '(') {
                            System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                        }
                    }
                    break;
                case ']':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else {
                        lastBracket = (char) sym2;
                        if (lastBracket != '[') {
                            System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                        }
                    }
                    break;
                case '}':
                    sym2 = (char) stack.pop();
                    if (sym2 == 0) {
                        System.out.println("Error: closed " + sym + "at " + i + ", but not opened ");
                    } else {
                        lastBracket = (char) sym2;
                        if (sym2 != '{') {
                            System.out.println("Error: closed " + sym + ", but opened " + sym2 + " at " + i);
                        }
                    }
                    break;
            }
        }
        while ((lastBracket = (char)stack.pop()) != 0) {
            System.out.println("Error: opened " + lastBracket + ", but not closed");
        }


    }
}
