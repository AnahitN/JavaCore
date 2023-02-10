package chapter7.box;

public class OverloadCons {

    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;
        vol = mybox1.volume();
        System.out.println("vol mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("vol mybox2 = " + vol);

        vol = mybox3.volume();
        System.out.println("vol mybox3 = " + vol);

    }

}
