package GeometricObject;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject(){

    }
    public GeometricObject(String color, boolean filled, java.util.Date dateCreated){
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public void setDateCreated(java.util.Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
