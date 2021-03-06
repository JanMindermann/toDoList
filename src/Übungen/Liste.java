package Übungen;

import java.util.ArrayList;

public class Liste {
    private String name;
    private ArrayList<Aufgabe> tasks;

    public Liste()
    {
        tasks = new ArrayList<Aufgabe>();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Aufgabe> getTasks()
    {
        return tasks;
    }

    public void addAufgabe(Aufgabe aufgabe)
    {
        tasks.add(aufgabe);
    }
    public void removeAufgabe(Aufgabe aufgabe)
    {
        tasks.remove(aufgabe);
    }

    public ArrayList<Aufgabe> getAufgabe(String description){
        ArrayList<Aufgabe> aufgaben = new ArrayList<>();
        for(Aufgabe task:tasks){
            if(task.getDescription().equals(description)){
                aufgaben.add(task);
            }
        }if(aufgaben.size()>0){return aufgaben;}
        else{ System.out.println("Keine Aufgabe mit der Beschreibung '"+description+"' gefunden.");return null;}
    }

    public void getAufgabeIndex(String description){
        //Wenn es das Objekt gibt, dann Index des Objektes in den tasks zurückgeben,
        //Wenn es das Objekt nicht gibt, dann -1 als "Index" zurückgeben.
        for(Aufgabe task:tasks){
            if (task.getDescription().equals(description)){

            }
        }
    }

    public String toString()
    {
        String ergebnis = name + "\n";
        for (Aufgabe task : tasks)
        {
            ergebnis += "  ";
            ergebnis += task.toString();
            ergebnis += "\n";
        }
        return ergebnis;
    }
}
