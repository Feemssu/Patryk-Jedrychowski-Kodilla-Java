package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String name = "Circle";
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        return Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
