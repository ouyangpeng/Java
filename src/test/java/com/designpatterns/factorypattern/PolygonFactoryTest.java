package src.test.java.com.designpatterns.factorypattern;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.designpatterns.factorypattern.Polygon;
import src.main.java.com.designpatterns.factorypattern.PolygonFactory;

public class PolygonFactoryTest {
    @Test
    public void testPolygonFactory() {
        String failReason = "";
        PolygonFactory polFactory = new PolygonFactory();

        // Test for triangle
        Polygon triangle = polFactory.getPolygon(3);
        if (!"Triangle".equals(triangle.getType())) {
            failReason += "Polygon Factory failed for Triangle.";
        }
        if (triangle.area(4) != 6.928208) {
            failReason += "Triangle area is incorrect!";
        }


        // Test for square
        Polygon square = polFactory.getPolygon(4);
        if (!"Square".equals(square.getType())) {
            failReason += "Polygon Factory failed for Square.";
        }
        if (square.area(5) != 25) {
            failReason += "Square area is incorrect!";
        }


        // Test for pentagon
        Polygon pentagon = polFactory.getPolygon(5);
        if (!"Pentagon".equals(pentagon.getType())) {
            failReason += "Polygon Factory failed for Pentagon.";
        }
        if (pentagon.area(9) != 311.615424) {
            failReason += "Pentagon area is incorrect!";
        }

        Assert.assertEquals(failReason, failReason, "");
    }
}
