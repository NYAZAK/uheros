package com.minijeu.uheros.PersonnagesPack;

public interface Equipements {

    public boolean worn(EquipementsSet piece);

    public int moreDangerous(int velocite);

    public int moreDefense(int defense);

    public int moreMagic(int magic);

    public void addMagicPiece(EquipementsSet piece);

    public void addWeapon(EquipementsSet weapon);

    public void addArmor(String head,String cheast, String legs );


}
