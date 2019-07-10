package com.minijeu.uheros.PersonnagesPack;

public class EquipementsSet {
    private ItemsEquipement head;
    private ItemsEquipement cheast;
    private ItemsEquipement legs;
    private ItemsEquipement weapon;

    public  EquipementsSet( ItemsEquipement head, ItemsEquipement cheast, ItemsEquipement legs, ItemsEquipement weapon){
        this.head = head;
        this.cheast = cheast;
        this.legs = legs;
        this.weapon = weapon;

    }

    public ItemsEquipement getHead() {
        return head;
    }

    public void setHead(ItemsEquipement head) {
        this.head = head;
    }

    public ItemsEquipement getCheast() {
        return cheast;
    }

    public void setCheast(ItemsEquipement cheast) {
        this.cheast = cheast;
    }

    public ItemsEquipement getLegs() {
        return legs;
    }

    public void setLegs(ItemsEquipement legs) {
        this.legs = legs;
    }

    public ItemsEquipement getWeapon() {
        return weapon;
    }

    public void setWeapon(ItemsEquipement weapon) {
        this.weapon = weapon;
    }

}
