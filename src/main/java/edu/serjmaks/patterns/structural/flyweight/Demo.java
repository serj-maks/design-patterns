package edu.serjmaks.patterns.structural.flyweight;

import edu.serjmaks.patterns.structural.flyweight.pen.Pen;

public class Demo {
    public static void main(String[] args) {
        Pen yellowThinPen1 = PenFactory.getThinPen("YELLOW");
        yellowThinPen1.draw("hello!");

        Pen yellowThinPen2 = PenFactory.getThinPen("YELLOW");
        yellowThinPen2.draw("hello!");

        Pen blueMediumPen = PenFactory.getMediumPen("BLUE");
        blueMediumPen.draw("hello!");

        System.out.println(yellowThinPen1.hashCode() + " //same object");
        System.out.println(yellowThinPen2.hashCode() + " //same object");

        System.out.println(blueMediumPen.hashCode());
    }
}
