package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private String name = "Triangle";
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return a*h*0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.h, h) != 0) return false;
        return Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}