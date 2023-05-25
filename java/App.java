package com.cc.java;

public class App {

    public static void main(String[] args) {
        
        // Objekte der Klasse Mitarbeiter erstellen
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schreiner", "Klaus", "Manager", 2010);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mützerich", "Marie", "Entwicklerin", 2015);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Meier", "Hans", "Verkäufer", 2018);
        
        // Informationen ausgeben
        output("Name: " + mitarbeiter1.getInfo("name"));
        output("Vorname: " + mitarbeiter1.getInfo("familyName"));
        output("Funktion: " + mitarbeiter1.getInfo("role"));
        output("Eintrittsjahr: " + mitarbeiter1.getInfo("yearofEntry"));
        
		printSeparator();
        
        output("Name: " + mitarbeiter2.getInfo("name"));
        output("Vorname: " + mitarbeiter2.getInfo("familyName"));
        output("Funktion: " + mitarbeiter2.getInfo("role"));
        output("Eintrittsjahr: " + mitarbeiter2.getInfo("yearofEntry"));
        
		printSeparator();
        
        output("Name: " + mitarbeiter3.getInfo("name"));
        output("Vorname: " + mitarbeiter3.getInfo("familyName"));
        output("Funktion: " + mitarbeiter3.getInfo("role"));
        output("Eintrittsjahr: " + mitarbeiter3.getInfo("yearofEntry"));
    }

    // Output
    private static void output(String outStr) {
        System.out.println(outStr);
    }

    // Trennlinie
    private static void printSeparator() {
        System.out.println("------------------------");
    }
}