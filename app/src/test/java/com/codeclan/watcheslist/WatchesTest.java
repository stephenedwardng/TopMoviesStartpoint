package com.codeclan.watcheslist;

import org.junit.Test;
import static org.junit.Assert.*;


public class WatchesTest {

    @Test
    public void getListTest() {
        Watches watches = new Watches();
        assertEquals(20, watches.getList().size());
    }
}