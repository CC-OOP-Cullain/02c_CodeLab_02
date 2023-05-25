package com.cc.java;

public class Mitarbeiter {

    private String familyName;
    private String name;
    private String role;
    private int yearofEntry;
    
    // Konstruktor
    public Mitarbeiter(String familyName, String name, String role, int yearofEntry) {
        this.familyName = familyName;
        this.name = name;
        this.role = role;
        this.yearofEntry = yearofEntry;
    }
    
    // Ausgabeswitch
    public String getInfo(String parameter) {
        switch(parameter) {
            case "familyName":
                return familyName;
            case "name":
                return name;
            case "role":
                return role;
            case "yearofEntry":
                return Integer.toString(yearofEntry);
            default:
                return "Ungültiger Parameter";
        }
    }
}