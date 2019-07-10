package com.minijeu.uheros.SavePersonnages;

import com.minijeu.uheros.PersonnagesPack.Personne;

import java.io.*;
import java.util.ArrayList;

public class SavePersonnes {


    private static ArrayList<Personne> ReadSavePerso() throws IOException {
        FileInputStream fis = null;
        ArrayList<Personne> persLec = new ArrayList<Personne>();
        File file = new File("SavePersonnes.dat");
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            persLec = (ArrayList<Personne>) ois.readObject();

        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found");
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("class not found");
            cnfe.printStackTrace();
        } catch (IOException io) {
            System.out.println("io exception");
            io.printStackTrace();
        } finally {
            if (fis != null) {
                safeClose(fis);
            }
        }
        return persLec;
    }

    //
    public static void WriteSavePerso(Personne ps) throws IOException {

//-----------------Ecriture--------------
        ArrayList<Personne> persEcr = ReadSavePerso();
        for (Personne i :persEcr) {
            if (ps.getPseudo() == i.getPseudo()){
                persEcr.remove(i);
            }
        }
        persEcr.add(ps);
        File file = new File("SavePersonnes.dat");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(persEcr);
        } catch (FileNotFoundException fnfe) {
            System.out.println("fil not found");
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("io exception");
            ioe.printStackTrace();
        } finally {
            if (fos != null) {
                safeClose(fos);

            }
        }
    }
    public static void WriteSavePerso(ArrayList<Personne> arL) throws IOException {
        for (Personne p:arL) {
            WriteSavePerso(p);
        }
    }


    private static void safeClose(Closeable closeable) {
// Permet d'éviter de faire des try/catch autour des .close()
        try {
            closeable.close();
        } catch (IOException io) {
            throw new RuntimeException(io);
        }
    }

    public static void ListePersonnage() throws IOException {
        ArrayList<Personne> persLec;
        persLec = ReadSavePerso();
        System.out.println("Liste Personnage : ");
        for (Personne i : persLec) {
            System.out.println(i.toString());
        }
    }

}
