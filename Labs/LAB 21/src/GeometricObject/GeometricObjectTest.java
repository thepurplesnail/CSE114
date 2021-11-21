package GeometricObject;

import GeometricObject.GeometricObject;

import java.util.Date;

public class GeometricObjectTest {
    public static void main(String[] args){
        GeometricObject[] arr = new GeometricObject[]{
                new GeometricObject("blue", true, new Date()),
                new GeometricObject("orange", false, new Date()),
                new Square("green", true, new Date()),
                new GeometricObject("indigo", true, new Date()),
                new Square("violet", false, new Date())};
        for (GeometricObject shape:arr)
            if (shape instanceof Colorable){
                System.out.print(shape.getColor() + " " + shape.getClass() + ": ");
                ((Colorable) shape).howToColor();
            }

    }
}
