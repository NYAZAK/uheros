package com.minijeu.uheros.PersonnagesPack;



public class Personne {

    private String pseudo;
    private String sexe;
    private int age;
    private int niveau;


    public Personne(String pseudo, String sexe, int age, int niveau){
        this.pseudo = pseudo;
        this.sexe = sexe;
        this.age = age;
        this.niveau = niveau;

    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

}
