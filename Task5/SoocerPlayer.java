package Session3;

public class SoocerPlayer {
    public String name;
    public  int number;
    public int xLocation;
    public  int yLoacation;


    public SoocerPlayer(String naMe,int num,int x, int y ){
        name = naMe;
        number = num;
        xLocation = x;
        yLoacation = y ;
    }
    public int run(){
        return   number * xLocation;
    }
    public  int jump(){
        return number * yLoacation;
    }
    public  int kickBall(){
        return   number * xLocation + number * yLoacation;
    }

}
