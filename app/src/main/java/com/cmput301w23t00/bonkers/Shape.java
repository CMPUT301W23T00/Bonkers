package com.cmput301w23t00.bonkers;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "yellow";

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
