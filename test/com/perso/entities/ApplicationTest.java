package com.perso.entities;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by edarce on 09/03/2017.
 */
public class ApplicationTest {

    @Test
    public void test()
    {
        Application application = new Application();
        application.process(
                Stream.of(
                "5 5",
                "1 2 N" ,
                "GAGAGAGAA" ,
                "3 3 E" ,
                "AADAADADDA"));


    }
}