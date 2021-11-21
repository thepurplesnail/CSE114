package GeometricObject;

import GeometricObject.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    public Square(String color, boolean filled, java.util.Date dateCreated){
        super(color,filled,dateCreated);
    }
    @Override
    public void howToColor() {
        System.out.println("Color inside the square");
    }
}
