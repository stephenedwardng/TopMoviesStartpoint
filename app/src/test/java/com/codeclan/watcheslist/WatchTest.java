package com.codeclan.watcheslist;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class WatchTest {

    Watch watch;

    @Before
    public void before() {
        watch = new Watch(101, "Monty Python and the Holy Grail", 1975);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)101, watch.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Monty Python and the Holy Grail", watch.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)1975, watch.getYear());

    }
}