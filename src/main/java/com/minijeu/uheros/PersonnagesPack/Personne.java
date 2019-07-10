package com.minijeu.uheros.PersonnagesPack;



public class Personne  implements  Equipements{

    private String pseudo;
    private String sexe;
    private int age;
    private int niveau;
    private int vie;
    private int xp;
    private int force;
    private String head;
    private String cheast;
    private String legs;
    private String weapon;

    public Personne(String pseudo, String sexe, int age, int niveau){
        this.pseudo = pseudo;
        this.sexe = sexe;
        this.age = age;
        this.niveau = niveau;


    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getCheast() {
        return cheast;
    }

    public void setCheast(String cheast) {
        this.cheast = cheast;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
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

    @Override
    public boolean worn(EquipementsSet piece) {
        return false;
    }

    @Override
    public int moreDangerous(int velocite) {
        int newForce;
        if(velocite > 0){
            newForce = getForce() + velocite;
        } else {
            newForce = getForce() - velocite;
        }
        return newForce;
    }

    @Override
    public int moreDefense(int defense) {
        return 0;
    }

    @Override
    public int moreMagic(int magic) {
        return 0;
    }

    @Override
    public void addMagicPiece(EquipementsSet piece) {

    }

    @Override
    public void addWeapon(EquipementsSet weapon) {

    }

    @Override
    public void addArmor(String head, String cheast, String legs) {

        // il remplace le casque par le nouveau casque (TODO mettre l'ancien head dans une collection de casque dans l'inventaire)
        if(getHead() != null) {
            this.head = head;
        }

        if(getCheast() != null){
            this.cheast = cheast;
        }

        if(getLegs() != null){
            this.legs = legs;
        }


    }
}
