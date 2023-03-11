package chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap is "+ ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap ==Apple.GoldenDel){
            System.out.println("ap contains Goldendel \n");
        }
        switch (ap) {
            case Jonathan:
                System.out.println("jonathan is red");
                break;
            case GoldenDel:
                System.out.println("golden delicious is yellow");
                break;
            case RedDel:
                System.out.println("red delicious is red");
                break;
            case WineSap:
                System.out.println("winesap is red");
                break;
            case Cortland:
                System.out.println("cortland is red");
                break;
        }
    }
}
