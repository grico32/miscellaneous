package com.perso.entities;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by edarce on 09/03/2017.
 */
public enum Orientation
{
    North("N"),
    East("E"),
    South("S"),
    West("W");

    private final String shortcut;

    Orientation(String n) {
        this.shortcut=n;
    }

    Orientation rotateClockWise()
    {
        return Orientation.values()[(this.ordinal() + 1) % 4];
    }

    Orientation rotateReverse()
    {
        return Orientation.values()[(this.ordinal()+3)%4];
    }

    static  Orientation from(String s)
    {
        Optional<Orientation> any = Arrays.stream(Orientation.values()).filter(orientation -> orientation.shortcut.equals(s)).findAny();
        return any.get();
    }

    public String shortcut() {
      return shortcut;
    }

}
