package com.minijeu.uheros;

import com.minijeu.uheros.PersonnagesPack.Personne;

import java.io.IOException;
import java.util.ArrayList;

import static com.minijeu.uheros.SavePersonnages.SavePersonnes.ListePersonnage;
import static com.minijeu.uheros.SavePersonnages.SavePersonnes.WriteSavePerso;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Personne> arL = new ArrayList<Personne>();
        arL.add(new Personne("Spiderman", "Masculin", 25, 12));
        arL.add(new Personne("Superman", "Masculin", 36, 20));
        arL.add(new Personne("Dr Strange", "Masculin", 34, 21));
        WriteSavePerso(arL);
        ListePersonnage();
//        Personne p = new Personne("rouan", "femme", 32, 12);
//        p.addArmor("casque", "torse", "jambiére");
    }
}

