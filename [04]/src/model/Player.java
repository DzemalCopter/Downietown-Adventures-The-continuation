package model;

public class Player {

    private String name;
    private int level;

    public Player(String n){
        name = n;
        level = 1;
    }

    public  String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

}
