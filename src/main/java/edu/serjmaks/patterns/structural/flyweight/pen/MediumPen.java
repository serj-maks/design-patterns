package edu.serjmaks.patterns.structural.flyweight.pen;

public class MediumPen implements Pen {
    final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
