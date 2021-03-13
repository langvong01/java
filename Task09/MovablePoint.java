package Task09;

public class MovablePoint  implements Moveable{
    private int x ,y ;
    public MovablePoint(int x , int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    @Override
    public  void moveUp(){
        y--;
    }
    @Override
    public  void moveDown(){
        y++;
    }
    @Override
    public  void moveRight(){
        x--;
    }
    @Override
    public  void  moveLeft(){
        x++;
    }
}
