package Übungen;

public class Main {

    public static void main(String[] args) {

        // Eine Todo-Liste erzeugen.
        Liste l1 = new Liste();

        //Tags erzeugen
        Tag freizeit = new Tag("Freizeit");
        Tag arbeit =new Tag("Arbeit",Color.BLUE);
        Tag sport = new Tag("Sport",Color.GREEN);
        Tag jahreziele = new Tag("Jahrevorsätze", Color.RED);

        // Namen für die Liste vergeben.
        l1.setName("Wichtige Aufgaben");

        // Aufgaben hinzufügen.
        Aufgabe a1 = new Aufgabe();
        a1.setDescription("Im Lotto gewinnen");
        a1.setPriority(Priority.VERY_HIGH);
        a1.setTag(freizeit);
        a1.setTag(jahreziele);

        Aufgabe a2 = new Aufgabe();
        a2.setDescription("Dem Chef auf den Tisch ka...");
        a2.setPriority(Priority.COMMON);
        a2.setTag(arbeit);

        Aufgabe a3 = new Aufgabe();
        a3.setDescription("Geld ausgeben");//Geld ausgeben
        a3.setPriority(Priority.LOW);
        a3.setTag(freizeit);

        Aufgabe a4 = new Aufgabe();
        a4.setDescription("Job suchen");
        a4.setPriority(Priority.VERY_LOW);
        a4.setTag(arbeit);
        a4.setTag(jahreziele);

        l1.addAufgabe(a1);
        l1.addAufgabe(a2);
        l1.addAufgabe(a3);
        l1.addAufgabe(a4);

        System.out.println(l1);

        System.out.println(l1.getAufgabe("Job d"));
    }
}
