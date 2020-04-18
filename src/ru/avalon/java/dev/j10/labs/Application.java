package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.PointImpl;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = null;
        shapes = new Shape[10];
        
//        PointImpl pointImplCircleOne = new PointImpl(); // точка круга1 генерит себе координаты
//        PointImpl pointImplCircleOne = new PointImpl(15, -5); // указываем координаты сами при создании точки круга1
        
//        System.out.println(pointImplCircleOne.getX()); // печатаем коорд Х точки круга1
//        System.out.println(pointImplCircleOne.getY()); // печатаем коорд У точки круга1

        Shape circleOne = new Circle("circleOne", (float) Math.random() * 30, new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape circleTwo = new Circle("circleTwo", (float) Math.random() * 30, new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape circleThree = new Circle("circleThree", (float) Math.random() * 30, new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape circleFour = new Circle("circleFour", (float) Math.random() * 30, new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));

//        System.out.println("circleOne Length = " + circleOne.getLength()); // печатаем длину круга1
//        System.out.println("circleOne Area = " + circleOne.getArea()); // печатаем площадь круга1
//        System.out.println("circleOne radius = " + 2 * circleOne.getArea() / circleOne.getLength()); // печатаем радиус круга1

        
        
//        PointImpl pointImplRectOneA = new PointImpl(); // точка А прямоуг1 генерит себе координаты
//        PointImpl pointImplRectOneB = new PointImpl(); // точка В прямоуг1 генерит себе координаты
//        PointImpl pointImplRectOneA = new PointImpl(12, 16); // указываем координаты при создании точки А прямоуг1
//        PointImpl pointImplRectOneB = new PointImpl(27, 54); // указываем координаты при создании точки В прямоуг1
        
//        System.out.println("RectOne A X = " + pointImplRectOneA.getX()); // печатаем коорд Х точки А прямоуг1
//        System.out.println("RectOne A Y = " + pointImplRectOneA.getY()); // печатаем коорд У точки А прямоуг1
//        System.out.println("RectOne B X = " + pointImplRectOneB.getX()); // печатаем коорд Х точки В прямоуг1
//        System.out.println("RectOne B Y = " + pointImplRectOneB.getY()); // печатаем коорд У точки В прямоуг1
        
//        Rectangle rectangleOne = new Rectangle(pointImplRectOneA, pointImplRectOneB); // создаем прямоуг1 с указанием 2х точек
        
        Shape rectangleOne = new Rectangle("rectangleOne", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100)); 
        Shape rectangleTwo = new Rectangle("rectangleTwo", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape rectangleThree = new Rectangle("rectangleThree", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        
//        System.out.println("RectOne Perimeter = " + rectangleOne.getPerimeter()); // печатаем периметр прямоуг1
//        System.out.println("RectOne Area = " + rectangleOne.getArea()); // печатаем площадь прямоуг1
        
        
        
//        PointImpl pointImplTriangleOneA = new PointImpl(); // точка А треуг1 генерит себе координаты
//        PointImpl pointImplTriangleOneB = new PointImpl(); // точка В треуг1 генерит себе координаты
//        PointImpl pointImplTriangleOneC = new PointImpl(); // точка С треуг1 генерит себе координаты
        
//        System.out.println("TriangleOne A X = " + pointImplTriangleOneA.getX()); // печатаем коорд Х точки А треуг1
//        System.out.println("TriangleOne A Y = " + pointImplTriangleOneA.getY()); // печатаем коорд У точки А треуг1
//        System.out.println("TriangleOne B X = " + pointImplTriangleOneB.getX()); // печатаем коорд Х точки В треуг1
//        System.out.println("TriangleOne B Y = " + pointImplTriangleOneB.getY()); // печатаем коорд У точки В треуг1
//        System.out.println("TriangleOne C X = " + pointImplTriangleOneC.getX()); // печатаем коорд Х точки С треуг1
//        System.out.println("TriangleOne C Y = " + pointImplTriangleOneC.getY()); // печатаем коорд У точки С треуг1
        
//        Triangle triangleOne = new Triangle(pointImplTriangleOneA, pointImplTriangleOneB, pointImplTriangleOneC); // создаем треуг1
        
        Shape triangleOne = new Triangle("triangleOne", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape triangleTwo = new Triangle("triangleTwo", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        Shape triangleThree = new Triangle("triangleThree", new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100), new PointImpl((float) Math.random() * 100, (float) Math.random() * 100));
        
//        System.out.println("TriangleOne Perimeter = " + triangleOne.getPerimeter());
//        System.out.println("TriangleOne Area = " + triangleOne.getArea());
        
        
        shapes[0] = circleOne;
        shapes[1] = rectangleOne;
        shapes[2] = triangleOne;
        shapes[3] = circleTwo;
        shapes[4] = circleThree;
        shapes[5] = circleFour;
        shapes[6] = rectangleTwo;
        shapes[7] = rectangleThree;
        shapes[8] = triangleTwo;
        shapes[9] = triangleThree;
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i] + " area is " + shapes[i].getArea());
        }
        
        System.out.println("");
        
        getLargestShape(shapes);
    }
    
//    static void getLargestShape (Shape[] shapeArray) {
//        float largestShapeArea = 0;
//        int j = 0;
//        
//        for (int i = 0; i < shapeArray.length; i++) {
//            if (largestShapeArea < shapeArray[i].getArea()) {
//                largestShapeArea = shapeArray[i].getArea();
//                j = i;
//            }
//        }
//        
//        System.out.println("The shape with the largest area is: " + shapeArray[j] + ", its area is " + largestShapeArea);
//    }
    
    static void getLargestShape (Shape[] shapeArray) {
        Shape largestShape = shapeArray[0];
        
        for (int i = 1; i < shapeArray.length; i++) {
            if (largestShape.getArea() < shapeArray[i].getArea()) {
                largestShape = shapeArray[i];
            }
        }
        
        System.out.println("The shape with the largest area is: " + largestShape + ", its area is " + largestShape.getArea());
    }
}
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
