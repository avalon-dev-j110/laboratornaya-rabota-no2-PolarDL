package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
    
    private PointImpl pointImplRectangleA;
    private PointImpl pointImplRectangleB;
    private String rectangleName;
    
//    когда объявлял переменные координат точек здесь, то выдавало NPE. Когда запихнул напрямую в методы, то все сработало.
//    private float aXCoord = pointImplRectangleA.xCoordinate;
//    private float aYCoord = pointImplRectangleA.yCoordinate;
//    private float bXCoord = pointImplRectangleB.xCoordinate;
//    private float bYCoord = pointImplRectangleB.yCoordinate;
    
// конструктор с указанием конкректных точек и имени
    public Rectangle (String rectangleName, PointImpl pointImplRectangleA, PointImpl pointImplRectangleB) {
        this.rectangleName = rectangleName;
        this.pointImplRectangleA = pointImplRectangleA;
        this.pointImplRectangleB = pointImplRectangleB;
    }
    
    
// конструктор со встроенным созданием точек
//    public Rectangle (String rectangleName) {
//        this.pointImplRectangleA = new PointImpl();
//        this.pointImplRectangleB = new PointImpl();
//        this.rectangleName = rectangleName;
//    }
    
    @Override
    public float getPerimeter() {
//        float rectanglePerimeter = Math.abs((bXCoord - aXCoord)) * 2 + Math.abs((bYCoord - aYCoord)) * 2; // было для случая объявления переменных координат точкек чуть выше в этом классе
        float rectanglePerimeter = Math.abs((pointImplRectangleB.xCoordinate - pointImplRectangleA.xCoordinate)) * 2 + Math.abs((pointImplRectangleB.yCoordinate - pointImplRectangleA.yCoordinate)) * 2;
        return rectanglePerimeter;
    }

    @Override
    public float getArea() {
//        float rectangleArea = Math.abs((bXCoord - aXCoord)) * Math.abs((bYCoord - aYCoord)); // было для случая объявления переменных координат точкек чуть выше в этом классе
        float rectangleArea = Math.abs((pointImplRectangleB.xCoordinate - pointImplRectangleA.xCoordinate)) * Math.abs((pointImplRectangleB.yCoordinate - pointImplRectangleA.yCoordinate));
        return rectangleArea;
    }

    @Override
    public String toString() {
        return rectangleName;
    }
    
    
}
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
