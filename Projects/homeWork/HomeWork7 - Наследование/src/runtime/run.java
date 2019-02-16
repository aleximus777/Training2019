package runtime;

import auxulary.ShapeUtils;
import figures.EqualSidedTriangle;
import figures.FourSquare;
import figures.Rectangle;

public class run {

    public static void main(String[] s) {
        FourSquare testFourSquare = new FourSquare("Rectangle", "Foursquare", 6.0);
        Rectangle testRectangle = new Rectangle("Rectangle", "Rectangle", 2.0, 2.0);
        EqualSidedTriangle testEqSidedTriangle = new EqualSidedTriangle(5.0);
        figures.Figure[] dimFigures = new figures.Figure[3];
        dimFigures[0] = testFourSquare;
        dimFigures[1] = testRectangle;
        dimFigures[2] = testEqSidedTriangle;

        testimony(testFourSquare, dimFigures);
        testimony(testRectangle, dimFigures);
        testimony(testEqSidedTriangle, dimFigures);
    }

    public static void testimony(figures.Figure figure, figures.Figure dimFigures[]) {

        System.out.println(figure.toString());
        System.out.println("Check for square: " + figure.calculateSquare());
        System.out.println("Is Figure Triangle? : " + ShapeUtils.isFigureTriangle(figure));
        System.out.println("Is Figure Rectangle? : " + ShapeUtils.isFigureRectangle(figure));

        for (int i = 0; i < dimFigures.length; i++) {
            System.out.print("Is squares: (" + figure.calculateSquare() + ")");
            System.out.println(" and (" + dimFigures[i].calculateSquare() + ") are equal: " + figure.isFiguresOfOneSquare(dimFigures[i]));
        }
        System.out.println("--------------------------------------------------------");
    }
}
