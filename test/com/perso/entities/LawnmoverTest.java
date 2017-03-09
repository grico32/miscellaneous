package com.perso.entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by edarce on 09/03/2017.
 */
public class LawnmoverTest {

    public LawnmoverTest()
    {}

    @Test
    public void nominal() throws Exception {

        Area area = new Area(new Coordinates(0,0),new Coordinates(5,5));

        Lawnmover lawnmover = new Lawnmover(1,2,Orientation.North,area);
        lawnmover.move("GAGAGAGAA");

      //  lawnmover.move('G');
        System.out.println(lawnmover.getCoordinates());

        assertEquals(new Coordinates(1,3), lawnmover.getCoordinates());
        assertEquals(Orientation.North, lawnmover.getOrientation());

        lawnmover= new Lawnmover(3,3,Orientation.East,area);
        lawnmover.move("AADAADADDA");

        assertEquals(new Coordinates(5,1), lawnmover.getCoordinates());
        assertEquals(Orientation.East, lawnmover.getOrientation());

    }


    @Test
    public void testOutOfBound() throws Exception {

        Area area = new Area(new Coordinates(0,0),new Coordinates(5,5));


        Lawnmover lawnmover = new Lawnmover(1,0,Orientation.South,area);

        lawnmover.move("A"); // illegal move

        assertEquals(new Coordinates(1,0), lawnmover.getCoordinates());
        assertEquals(Orientation.South, lawnmover.getOrientation());

         lawnmover = new Lawnmover(1,5,Orientation.North,area);

        lawnmover.move("A"); // illegal move

        assertEquals(new Coordinates(1,5), lawnmover.getCoordinates());
        assertEquals(Orientation.North, lawnmover.getOrientation());


    }


}