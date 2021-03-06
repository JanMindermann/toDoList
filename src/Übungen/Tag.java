package Übungen;

public class Tag {
    private String name; // bsp. Freizeit, Arbeit
    private Color color;


    // Color bei der instanziierung = none, da nicht expliziet eingegeben.
    public Tag(String name){
        this.name=name;
        this.color=Color.NONE;
        System.out.println("Es wurde noch keien Farbe für diese Aufgabe ausgewählt");
    }

    // Name und Color bei der Objekt instanziierung setzen
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

    public String toString(){
        return this.name+ ", "+ this.color;
    }

}
