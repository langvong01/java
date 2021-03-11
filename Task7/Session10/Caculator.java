package Session5.Session10;
public class Caculator {
    /**
     *
     */
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if (args.length==2){
            shape = args[0].toLowerCase();
            switch (shape){
                case "circle":objShape = new Circle();
                objShape.caculate(Float.parseFloat(args[1]));
                break;
                case "rectangle": objShape = new Reactangle();
                objShape.caculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else {
            System.out.println("Usage:java Caculator<shape-name><value>");
        }
    }
}
