package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private PointImpl pointImplTriangleA;
    private PointImpl pointImplTriangleB;
    private PointImpl pointImplTriangleC;
    private String triangleName;
    
//    private float aXCoord = pointImplTriangleA.xCoordinate;
//    private float aYCoord = pointImplTriangleA.yCoordinate;
//    private float bXCoord = pointImplTriangleB.xCoordinate;
//    private float bYCoord = pointImplTriangleB.yCoordinate;
//    private float cXCoord = pointImplTriangleC.xCoordinate;
//    private float cYCoord = pointImplTriangleB.yCoordinate;
    
// конструктор с указанием конкректных точек и имени
    public Triangle (String triangleName, PointImpl pointImplTriangleA, PointImpl pointImplTriangleB, PointImpl pointImplTriangleC){
        this.triangleName = triangleName;
        this.pointImplTriangleA = pointImplTriangleA;
        this.pointImplTriangleB = pointImplTriangleB;
        this.pointImplTriangleC = pointImplTriangleC;
    }
    
// конструктор со встроенным созданием точек
//    public Triangle (String triangleName){
//        this.pointImplTriangleA = new PointImpl();
//        this.pointImplTriangleB = new PointImpl();
//        this.pointImplTriangleC = new PointImpl();
//        this.triangleName = triangleName;
//    }
    
    @Override
    public float getPerimeter() {
//        double sideAB = Math.pow(((Math.pow((bXCoord - aXCoord), 2) + Math.pow((bYCoord - aYCoord), 2))), 0.5); // было для случая объявления переменных координат точкек чуть выше в этом классе
//        double sideBC = Math.pow(((Math.pow((cXCoord - bXCoord), 2) + Math.pow((cYCoord - bYCoord), 2))), 0.5); // было для случая объявления переменных координат точкек чуть выше в этом классе
//        double sideCA = Math.pow(((Math.pow((aXCoord - cXCoord), 2) + Math.pow((aYCoord - cYCoord), 2))), 0.5); // было для случая объявления переменных координат точкек чуть выше в этом классе
        double sideAB = Math.pow(((Math.pow((pointImplTriangleB.xCoordinate - pointImplTriangleA.xCoordinate), 2) + Math.pow((pointImplTriangleB.yCoordinate - pointImplTriangleA.yCoordinate), 2))), 0.5);
        double sideBC = Math.pow(((Math.pow((pointImplTriangleC.xCoordinate - pointImplTriangleB.xCoordinate), 2) + Math.pow((pointImplTriangleB.yCoordinate - pointImplTriangleB.yCoordinate), 2))), 0.5);
        double sideCA = Math.pow(((Math.pow((pointImplTriangleA.xCoordinate - pointImplTriangleC.xCoordinate), 2) + Math.pow((pointImplTriangleA.yCoordinate - pointImplTriangleB.yCoordinate), 2))), 0.5);
        float trianglePerimeter = (float)(sideAB + sideBC + sideCA);
        return trianglePerimeter;
    }

    @Override
    public float getArea() {
//        float triangleArea = ((bXCoord - aXCoord) * (cYCoord - aYCoord) - (cXCoord - aXCoord) * (bYCoord - aYCoord))/2; // было для случая объявления переменных координат точкек чуть выше в этом классе
        float triangleArea = (Math.abs((pointImplTriangleB.xCoordinate - pointImplTriangleA.xCoordinate) * (pointImplTriangleB.yCoordinate - pointImplTriangleA.yCoordinate) - (pointImplTriangleC.xCoordinate - pointImplTriangleA.xCoordinate) * (pointImplTriangleB.yCoordinate - pointImplTriangleA.yCoordinate)))/2;
        return triangleArea;
    }
    
    
    @Override
    public String toString() {
        return triangleName;
    }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
