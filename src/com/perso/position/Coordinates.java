package com.perso.position;

/**
 * Created by edarce on 09/03/2017.
 */
public class Coordinates {
    private int x ;
    private int y;

    public Coordinates(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return +x+" "+y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }


    void translate(int x, int y) {
        this.x = this.x +x;
        this.y=this.y+y;
    }



}
