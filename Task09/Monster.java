package Task09;

abstract class Monster {
    private String name;
    public  Monster(String name){
        this.name = name;
    }
    abstract public  String attack();
}
