package chapter7.box2;

public class OverloadCons2 {

    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("vol mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("vol mybox2 = " + vol);

        vol = mycube.volume();
        System.out.println("vol cube = " + vol);

        vol = myclone.volume();
        System.out.println("vol clone = " + vol);
    }
}
