package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
        @Test
        public void testArea(){
            Point p = new Point(4,8,4,8);
            Assert.assertEquals(p.area(),16.0);
        }
        {
        Point p = new Point(10,-1,-10,0);
        Assert.assertEquals(p.area(),110.0);

        }
        {
        Point p = new Point(2,4,1,2);
        Assert.assertEquals(p.area(),2.0);
        }
    }

