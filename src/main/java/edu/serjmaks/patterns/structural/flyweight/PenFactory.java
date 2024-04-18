package edu.serjmaks.patterns.structural.flyweight;

import edu.serjmaks.patterns.structural.flyweight.pen.MediumPen;
import edu.serjmaks.patterns.structural.flyweight.pen.Pen;
import edu.serjmaks.patterns.structural.flyweight.pen.ThickPen;
import edu.serjmaks.patterns.structural.flyweight.pen.ThinPen;

import java.util.HashMap;

public class PenFactory {
    private static final HashMap<String, Pen> hashMap = new HashMap<>();

    public static Pen getThickPen(String color) {
        String key = color + "-THICK";
        Pen pen = hashMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new ThickPen();
            pen.setColor(color);
            hashMap.put(key, pen);
        }

        return pen;
    }

    public static Pen getThinPen(String color) {
        String key = color + "-THIN";
        Pen pen = hashMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new ThinPen();
            pen.setColor(color);
            hashMap.put(key, pen);
        }

        return pen;
    }

    public static Pen getMediumPen(String color) {
        String key = color + "-MEDIUM";
        Pen pen = hashMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new MediumPen();
            pen.setColor(color);
            hashMap.put(key, pen);
        }

        return pen;
    }
}
