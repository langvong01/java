package Session4;

public class Rectangle {
    private  float length ;
    private  float width  ;
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float length, float width){
        this.width = width;
        this.length = length;
    }
    public float getLength(){
        return  length;
    }
    public  void  setLength(float length){
        this.length  = length;
    }
    public  void setWidth(float width){
        this.width = width;
    }
    public float getWidth(){
        return  width;
    }
    public  double getArea(){
        return width * length;
    }
    public  double getPerimeter(){
        return (width+ length)*2;
    }
    public String toString(){
        return "Rectangle[width= " + width +" length = "  + length+ "]";
    }
}
