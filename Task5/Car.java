package Session3;

public class Car {
    int plateNumber;
    int xLocation;
    int yLocation;
    int speed;
    public   Car(){}
    public Car(int num, int sp,int x,int y){
        plateNumber = num;
        speed = sp;
        xLocation = x;
        yLocation = y;
    }
    public  int move(){
        return  speed *(xLocation + yLocation);
    }
    public  int park(){
        return yLocation-xLocation;
    }
    public  int accelerate(){
        return  speed ;
    }
}
