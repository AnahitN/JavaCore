package homework.homework9;

public class StackForBraces {
    int[] stck = new int[10];
    int tos;

    StackForBraces() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("стек заполнен!");
        } else {
            stck[++tos] = item;
        }
    }


    int pop() {
        if (tos < 0) {
            return 0;
        } else
            return stck[tos--];
    }
}
