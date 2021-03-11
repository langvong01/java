package Session5;

public class Point {
    int x;
    int y;
    int[] begin = {x,y};
    public Point(int x1, int y1){
        this.x = x1;
        this.y  = y1;
    }
    public int getX(){
        return  x;
    }
    public  int getY(){
        return  y;
    }
    public  void setX(int x1){
        this.x = x1;
    }
    public  void setY(int y1){
        this.y = y1;
    }
    public  int[] getXY(){
        return  begin ;
    }
    public void  setXY(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }
    public String toString(){
        return  "[x1 = "  + x + ", y1 = "+ y + "]";
    }
}
