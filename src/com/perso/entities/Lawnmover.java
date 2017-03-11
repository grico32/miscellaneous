package com.perso.entities;

import com.perso.position.*;

/**
 * Created by edarce on 09/03/2017.
 */
public class Lawnmover {

    private final Area area;

    private PositionImpl position;


    public Lawnmover(int x, int y, Orientation orientation,Area area) {

        position= new PositionImpl(x,y,orientation);
        this.area=area;
    }


    public void move(String movements) {
        for (int i=0; i<movements.length() ;i++)
        {
            char command = movements.charAt(i);
           if (command=='G')
               position=position.rotateReverse();
           else
           if (command=='D')
               position=position.rotateClockWise();
           else
               if (command=='A')
               position.move(area);
        }

        System.out.println(position.toString());
    }


    public Position getPosition() {
        return position;
    }
}
