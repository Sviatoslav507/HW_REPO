package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZenithTest {


    @Test
    public void zenithCheck() {
        Zenith zenith = new Zenith(false, 30);
        int expected = zenith.getCount();
        int actual = 30;
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void testToString1() {
    Zenith zen = new Zenith(true,30);
    String expected = "\"Zenith{\" +\n" +
            "                \"frame=\" + frames +\n" +
            "                \", count='\" + count + '\\'' +\n" +
            "                \", isEmpty=\" + isEmpty +\n" +
            "                \", rewinded=\" + rewinded +\n" +
            "                '}'";
    Assert.assertEquals(expected, zen.toString());
    }
    public void testToString2() {
        Zenith zen = new Zenith(true,30);
        String tostring = zen.toString();
        assertTrue(tostring.matches("(.*)isEmpty(.*)"));
    }
}