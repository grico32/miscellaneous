package com.perso.position;

/**
 * Created by edarce on 09/03/2017.
 */
public class Area
{
    Coordinates min = new Coordinates(Integer.MIN_VALUE,Integer.MIN_VALUE);
    Coordinates max = new Coordinates(Integer.MAX_VALUE,Integer.MAX_VALUE);

    public Area() {}

    public Area(Coordinates min, Coordinates max) {
        this.min = min;
        this.max = max;
    }



    public Coordinates shiftCoordinates(Coordinates coordinates, int deltaX, int deltaY) {

         boolean outOfArea =
                 (coordinates.getX()+deltaX < min.getX())|| (coordinates.getY()+deltaY < min.getY())
                 ||(coordinates.getX()+deltaX >max.getX())|| (coordinates.getY()+deltaY > max.getY());

         if (!outOfArea)
             coordinates.translate(deltaX,deltaY);
         return coordinates;
    }
}
