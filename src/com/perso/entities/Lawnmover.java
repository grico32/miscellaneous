package com.perso.entities;

/**
 * Created by edarce on 09/03/2017.
 */
public class Lawnmover {

    private final Area area;
    private Coordinates coordinates;
    private Orientation orientation=Orientation.North;


    public Lawnmover(int x, int y, Orientation orientation,Area area) {
        coordinates=new Coordinates(x,y);
        this.orientation =orientation;
        this.area=area;
    }


    public Coordinates getCoordinates() {return coordinates;}


    public Orientation getOrientation() {return orientation;}


    public void move(String movements) {
        for (int i=0; i<movements.length() ;i++)
        {
            char command = movements.charAt(i);
           if (command=='G')
               orientation=orientation.rotateReverse();
           else
           if (command=='D')
               orientation=orientation.rotateClockWise();
           else
               if (command=='A')
               updatePosition();
        }

        System.out.println(coordinates.toString()+" "+orientation.shortcut());
    }

    private void updatePosition() {

        switch (orientation)
        {
            case North:
                coordinates=area.shiftCoordinates(coordinates,0,1);
                break;
            case South:
                coordinates=area.shiftCoordinates(coordinates,0,-1);
                break;
            case East:
                coordinates=area.shiftCoordinates(coordinates,1,0);
                break;
            case West:
                coordinates=area.shiftCoordinates(coordinates,-1,0);
                break;
        }
    }

}
