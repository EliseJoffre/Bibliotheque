package com.example.elisejoffre.bibliothque;

/**
 * Created by elisejoffre on 04/03/2018.
 */

public class Livre {

    private String titre;
    private String auteur;
    private int nombreDePages;

    public Livre(String titre, String auteur, int nombreDePages) {
        this.titre=titre;
        this.auteur=auteur;
        this.nombreDePages=nombreDePages;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + this.titre + '\'' +
                ", auteur='" + this.auteur + '\'' +
                ", nombreDePages=" + this.nombreDePages +
                '}';
    }
}
