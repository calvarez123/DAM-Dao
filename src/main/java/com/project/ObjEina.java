package com.project;

import java.util.ArrayList;

public class ObjEina {
    private int id;
    private String nom;
    private int any;
    private ArrayList<Integer> llenguatges;

    public ObjEina(int id, String nom, int any, ArrayList<Integer> llenguatges) {
        this.id = id;
        this.nom = nom;
        this.any = any;
        this.llenguatges = new ArrayList<>(llenguatges);
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public ArrayList<Integer> getLlenguatges() {
        return llenguatges;
    }

    public void addLlenguatge(int idLlenguatge) {
        this.llenguatges.add(idLlenguatge);
    }

    public void removeLlenguatge(int idLlenguatge) {
        this.llenguatges.remove(Integer.valueOf(idLlenguatge));
    }

    @Override
public String toString() {
    return String.format("ObjEina{ ID: %d, Nombre: '%s', Año: %d, Lenguajes: %s }", id, nom, any, llenguatges);
}
}