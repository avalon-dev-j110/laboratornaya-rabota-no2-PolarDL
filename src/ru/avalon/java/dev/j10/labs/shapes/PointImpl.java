package ru.avalon.java.dev.j10.labs.shapes;

public class PointImpl implements Point {
    
    float xCoordinate;
    float yCoordinate;
    
//  указываем координаты сами при создании точки
//    public PointImpl (float xCoordinate, float yCoordinate) {
//        this.xCoordinate = xCoordinate;
//        this.yCoordinate = yCoordinate;
//    }
    
//    чтобы каждая точка при создании сама генерила себе координаты    
    public PointImpl () {
        this.xCoordinate = (float) Math.random() * 100;
        this.yCoordinate = (float) Math.random() * 100;
   }
    
    @Override
    public float getX() {
        return xCoordinate;
    }

    @Override
    public float getY() {
        return yCoordinate;
    }
    
}
