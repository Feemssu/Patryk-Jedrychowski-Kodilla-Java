package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector{

    private List<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public int getFigureQuantity(){
        return shapeList.size();
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape theFigure = null;
        if (n >= 0 && n<shapeList.size()){
            theFigure = shapeList.get(n);
        }
        return theFigure;
    }

    public String showFigure(){
        StringBuilder figures = new StringBuilder(shapeList.size());
        for (Shape shape : shapeList) {
            figures.append(shape.getClass().getSimpleName());
        }
        return figures.toString();
    }
}
