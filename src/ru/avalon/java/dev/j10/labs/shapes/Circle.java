package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {
    
    private PointImpl pointImplCircle;
    private float radius;
    private String circleName;

//    конструктор с указанием конкретной точки и вводом значения радиуса и имени круга    
    public Circle (String circleName, float radius, PointImpl pointImplCircle){
        this.circleName = circleName;
        this.radius = radius;
        this.pointImplCircle = pointImplCircle;
    }

//  конструктор с указанием конкретной точки рандомным радиусом
//    public Circle (PointImpl pointImplCircle){
//        this.pointImplCircle = pointImplCircle;
//        this.radius = (float) Math.random() * 70;
//    }

//    конструктор с встроенным созданием новой точки и рандомным радиусом        
//    public Circle (String circleName, float radius){
//        this.pointImplCircle = new PointImpl();
//        this.radius = radius;
//        this.circleName = circleName;
//    }

    @Override
    public float getLength() {
        float circleLength = 2 * PI * radius;
        return circleLength;
    }

    @Override
    public float getArea() {
        float circleArea = PI * (float) Math.pow(radius, 2);
        return circleArea;
    }
    
    @Override
    public String toString() {
        return circleName;
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */  
}
