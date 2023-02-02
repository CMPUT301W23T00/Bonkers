package com.cmput301w23t00.bonkers;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "blue";

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
