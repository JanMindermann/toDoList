package Übungen;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Aufgabe {
    private String description;
    private LocalDateTime todoUntil;
    private Priority priotrity;
    private ArrayList<Tag> tags;

   /* public Aufgabe(String description, LocalDateTime todoUntil, Priority priority){
        this.description=description;
        this.todoUntil= todoUntil;
        this.priotrity=priority;
    }*/


    public String getDescription()
    {
        return description;
    }

    public void setPriority(Priority priotrity){
        this.priotrity=priotrity;
    }

    public Priority getPriotrity(){
        return this.priotrity;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public LocalDateTime getTodoUntil()
    {
        return todoUntil;
    }

    public void setTodoUntil(LocalDateTime datum)
    {
        todoUntil = datum;
    }

    public String toString()
    {
        return "Die Aufgabe: "+ this.description + " soll bis zum "+ this.todoUntil +" erledigt werden.";
    }
}