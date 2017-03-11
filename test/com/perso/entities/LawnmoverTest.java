package com.perso.entities;

import com.perso.position.Coordinates;
import com.perso.position.Orientation;
import com.perso.position.Area;
import org.junit.Assert;
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

        Lawnmover lawnmover = new Lawnmover(1,2, Orientation.North,area);
        lawnmover.move("GAGAGAGAA");

      //  lawnmover.move('G');


        Assert.assertEquals(new Coordinates(1,3), lawnmover.getPosition().getCoordinates());
        Assert.assertEquals(Orientation.North, lawnmover.getPosition().getOrientation());

        lawnmover= new Lawnmover(3,3, Orientation.East,area);
        lawnmover.move("AADAADADDA");

        Assert.assertEquals(new Coordinates(5,1), lawnmover.getPosition().getCoordinates());
        Assert.assertEquals(Orientation.East, lawnmover.getPosition().getOrientation());

    }


    @Test
    public void testOutOfBound() throws Exception {

        Area area = new Area(new Coordinates(0,0),new Coordinates(5,5));


        Lawnmover lawnmover = new Lawnmover(1,0, Orientation.South,area);

        lawnmover.move("A"); // illegal move

        Assert.assertEquals(new Coordinates(1,0), lawnmover.getPosition().getCoordinates());
        Assert.assertEquals(Orientation.South, lawnmover.getPosition().getOrientation());

         lawnmover = new Lawnmover(1,5, Orientation.North,area);

        lawnmover.move("A"); // illegal move

        Assert.assertEquals(new Coordinates(1,5), lawnmover.getPosition().getCoordinates());
        Assert.assertEquals(Orientation.North, lawnmover.getPosition().getOrientation());


    }


}