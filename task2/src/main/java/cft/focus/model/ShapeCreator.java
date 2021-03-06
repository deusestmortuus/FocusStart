package cft.focus.model;

import cft.focus.exceptions.ModelException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShapeCreator {

    public Shape createShape(String shapeType, double[] parameters) throws ModelException {

        if (shapeType.equals(ShapeType.CIRCLE.name()) && parameters.length == 1) {
            return new Circle(parameters[0]);
        } else if (shapeType.equals(ShapeType.RECTANGLE.name()) && parameters.length == 2) {
            return new Rectangle(parameters[0], parameters[1]);
        } else if (shapeType.equals(ShapeType.TRIANGLE.name()) && parameters.length == 3) {
            return new Triangle(parameters[0], parameters[1], parameters[2]);
        } else {
            throw new ModelException("Такой фигуры не существует");
        }
    }

}
