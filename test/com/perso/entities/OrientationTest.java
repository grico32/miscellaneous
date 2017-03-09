package com.perso.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by edarce on 09/03/2017.
 */
public class OrientationTest {
    @Test
    public void rotateClockWise() throws Exception {
        assertEquals(Orientation.South,Orientation.East.rotateClockWise());
        assertEquals(Orientation.North,Orientation.West.rotateClockWise());
    }

    @Test
    public void rotateReverse() throws Exception {
        assertEquals(Orientation.South,Orientation.West.rotateReverse());
        assertEquals(Orientation.West,Orientation.North.rotateReverse());

    }

}