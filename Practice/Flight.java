package Practice;

public class Flight {
    int number;
    String destination;
    public Flight(){};
    public Flight(int number , String destination){
        if (number < 0){
            this.number = 0;
            this.destination = null;
            System.out.println("Please enter the flight number in positived-valued");
        }
        else{
            this.number = number;
            this.destination = destination;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    public void  display(){
        System.out.println("The infomation about Flight :\n" + number + ", " +  destination);
    }
}
