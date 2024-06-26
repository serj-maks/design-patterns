package edu.serjmaks.patterns.structural.flyweight.pen;

public class ThinPen implements Pen {
    final BrushSize brushSize = BrushSize.THIN;
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THIN content in color : " + color);
    }
}
