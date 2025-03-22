package edu.serjmaks.patterns.creational.factory;

class WoodenDoor implements Door {
    private int width;
    private int height;

    public WoodenDoor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}
