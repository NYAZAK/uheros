package com.minijeu.uheros.PersonnagesPack;

import java.io.Serializable;

public class Personne implements Serializable {
    public String name;
    public int age;
    public int niveau;


    public  Personne(){}

    public Personne(String name ,int age ,int niveau){
        this.name=name;
        this.age=age;
        this.niveau=niveau;
    }
    public String toString(){
        return  "je suis "+ name+" de niveau "+niveau+" à "+age+" ans";
    }

    public String getName() {
        return name;
    }
}


