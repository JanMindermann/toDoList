package Übungen;

public class Tag {
    private String name; //Kategory
    private Color color;

    public Tag(String name, Color color){
        this.name=name;
        this.color=color;
    }

    public String getName(){
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }

}
