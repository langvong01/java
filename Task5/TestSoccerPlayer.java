package Session3;

public class TestSoccerPlayer {
    public static void main(String[] args) {
       SoocerPlayer player1 = new SoocerPlayer("Beck",10,5,9);
        SoocerPlayer player2 =  new SoocerPlayer("Ronaldo",7,2,1);
        SoocerPlayer player3 =  new SoocerPlayer("Messi",8,3,4);

        System.out.println("The run of player 1 is  " + player1.run());
        System.out.println("The kickBall of player 1 is "+ player1.kickBall());
        System.out.println("The jumof player1 is "+ player1.jump());
        System.out.println(player1.name);
    }
}
