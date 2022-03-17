package com.app.web_demo.models;

public class Etudiant {
    private long id;
    private String nom;
    private String prenom;
    private double note;

    public Etudiant(String nom, String prenom, double note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    public Etudiant() {
    }

    public Etudiant(long id, String nom, String prenom, double note) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
