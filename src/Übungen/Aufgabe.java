package Übungen;
import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Aufgabe {
    private String description;
    private LocalDateTime todoUntil;
    private Priority priotrity;
    public ArrayList<Tag> tags = new ArrayList<>();

    public void setTag(Tag tag){
        this.tags.add(tag);
    }


    public Tag getTag(){
        return this.tags.get(0);
    }

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
        return  this.description + ": Priorität " + this.priotrity + " mit (" + tags.size() +" Tags)";
    }
}