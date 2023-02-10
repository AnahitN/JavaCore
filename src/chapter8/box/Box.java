package chapter8.box;

import chapter8.a_b.B;

public class Box {

    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
       
    }
}
