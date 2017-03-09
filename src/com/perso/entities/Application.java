package com.perso.entities;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by edarce on 09/03/2017.
 */
public class Application {

  // 5 5
  // 1 2 N
  // GAGAGAGAA
  // 3 3 E
  // AADAADADDA

    public void process(Stream<String> stream )

    {
        final Area[] area = {null};

        stream.forEach(new P());

    }

    class P implements Consumer<String>
    {
        Area area = null;
        Lawnmover lawnmover = null;

        @Override
        public void accept(String s) {
            if (area == null)
            {
                String[] split = s.split(" ");
                area= new Area(new Coordinates(0,0),
                        new Coordinates(Integer.valueOf(split[0]),Integer.valueOf(split[1])));

            }
            else
            if (lawnmover != null && (s.contains("A")||s.contains("G")||s.contains("G")))
            {
                lawnmover.move(s);
            }
            else {
                String[] split = s.split(" ");

                lawnmover = new Lawnmover(Integer.valueOf(split[0]),Integer.valueOf(split[1]),Orientation.from(split[2]),area);
            }
        }
    }
}
