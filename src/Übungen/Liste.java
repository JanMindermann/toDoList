package Übungen;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Liste {
    private String name;
    private ArrayList<Aufgabe> tasks;

    public Liste() {
        tasks = new ArrayList<Aufgabe>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Aufgabe> getTasks() {
        return tasks;
    }

    public void addAufgabe(Aufgabe aufgabe) {
        tasks.add(aufgabe);
    }

    public void removeAufgabe(Aufgabe aufgabe) {
        tasks.remove(aufgabe);
    }

    public ArrayList<Aufgabe> getAufgabe(String description) {
        ArrayList<Aufgabe> aufgaben = new ArrayList<>();
        for (Aufgabe task : tasks) {
            if (task.getDescription().contains(description)) {
                aufgaben.add(task);
            }
        }
        if (aufgaben.size() > 0) {
            return aufgaben;
        } else {
            System.out.println("Keine Aufgabe mit der Beschreibung '" + description + "' gefunden.");
            return null;
        }
    }

    public void getAufgabeIndex(String description) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getDescription().contains(description)) {
                System.out.println("Die gesuchte Aufgabe befindet sich an Index: " + i + " in der ToDoListe '" + this.name + "'.");
                return;
            } else if (i == tasks.size() - 1) {
                System.out.println("Die gesuchte Aufgabe befindet sich nicht in der ToDoListe'" + this.name + "'.");
            }
        }
    }

    /*
    ---------------------
    Binäre suche: TODO
    ---------------------


    public void binarySearch(String description){
        for(int i =0; i<tasks.size();i++){

        }
    }*/


    public void getAufgabenPriority(Priority priority) {
        ArrayList<Aufgabe> tasksWithPriortiy = new ArrayList<>();
        for (Aufgabe task : tasks) {
            if (task.getPriotrity() == priority) {
                tasksWithPriortiy.add(task);
            }
        }
        if (tasksWithPriortiy.size() == 0) {
            System.out.println("Keine Aufgaben mit der Priorität: '" + priority + "' gefunden");
        } else {
            for (Aufgabe task : tasksWithPriortiy) {
                System.out.println(task.toString());
            }
        }
    }

        public String toString(){
            String ergebnis = name + "\n";
            for (Aufgabe task : tasks) {
                ergebnis += "  ";
                ergebnis += task.toString();
                ergebnis += "\n";
            }
            return ergebnis;
        }
    }


