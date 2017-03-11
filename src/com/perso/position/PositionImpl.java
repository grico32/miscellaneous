package com.perso.position;

/**
 * Created by edarce on 10/03/2017.
 */
public class PositionImpl implements Position {

    private Coordinates coordinates;
    private Orientation orientation;

    public PositionImpl(int x, int y, Orientation orientation) {
        this.orientation = orientation;
        coordinates = new Coordinates(x, y);
    }

    public PositionImpl rotateReverse() {
        orientation=orientation.rotateReverse();
        return this;
    }

    public PositionImpl rotateClockWise() {
        orientation=orientation.rotateClockWise();
        return this;
    }


    public void move(Area area) {

        switch (orientation) {
            case North:
                coordinates = area.shiftCoordinates(coordinates, 0, 1);
                break;
            case South:
                coordinates = area.shiftCoordinates(coordinates, 0, -1);
                break;
            case East:
                coordinates = area.shiftCoordinates(coordinates, 1, 0);
                break;
            case West:
                coordinates = area.shiftCoordinates(coordinates, -1, 0);
                break;
        }

    }

    @Override
    public String toString() {
        return coordinates.toString() + " " + orientation.shortcut();
    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public Orientation getOrientation() {
        return orientation;
    }
}
