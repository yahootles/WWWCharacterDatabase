/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwwcharacterdatabase;

/**
 *
 * @author antho6229
 */
//"Name", "Health", "Aura", "Reflex", "DADA", "Potions", "Herb", "CI","Int", "Strength", 
//"Darkness", "MU", "Charisma", "Trans"
public class Character implements java.io.Serializable{

    //variables
    String name;
    String notes;
    int health;
    int aura;
    int reflex;
    int dada;
    int potions;
    int herb;
    int ci;
    int intel;
    int stren;
    int dark;
    int mu;
    int charis;
    int trans;

    public Character(String n, int heal, int a, int r, int d, int p, int h, int c, int i, int s, int dar, int m, int ch, int t) {
        name = n;
        health = heal;
        aura = a;
        reflex = r;
        dada = d;
        potions = p;
        herb = h;
        ci = c;
        intel = i;
        stren = s;
        dark = dar;
        mu = m;
        charis = ch;
        trans = t;
        notes = "";
    }

    
    public void setName(String n) {
        name = n;
    }
    
    public void setHealth(int h) {
        health = h;
    }
    
    public void setAura(int a) {
        aura = a;
    }
    
    public void setReflex(int r) {
        reflex = r;
    }
    
    public void setDADA(int d) {
        dada = d;
    }
    
    public void setPotions(int p) {
        potions = p;
    }
    
    public void setHerb(int b) {
        herb = b;
    }
    
    public void setCI(int c) {
        ci = c;
    }
    
    public void setIntel(int i) {
        intel = i;
    }
    
    public void setStren(int s) {
        stren = s;
    }
    
    public void setDark(int d) {
        dark = d;
    }
    
    public void setMU(int m) {
        mu = m;
    }
    
    public void setCharis(int c) {
        charis = c;
    }
    
    public void setTrans(int t) {
        trans = t;
    }
    
    /**
     * Method used to get a stat based on a numerical value
     * @param stat Which stat is wanted
     * @return value of the stat wanted 
     */
    public int getNumericalStat(int stat){
    //String n, int heal, int a, int r, int d, int p, int h, int c, int i, int s, 
    //int dar, int m, int ch, int t
        switch(stat){
            case 1:
                return health;
            case 2:
                return aura;
            case 3:
                return reflex;
            case 4:
                return dada;
            case 5:
                return potions;
            case 6:
                return herb;
            case 7:
                return ci;
            case 8:
                return intel;
            case 9:
                return stren;
            case 10:
                return dark;
            case 11:
                return mu;
            case 12:
                return charis;
            case 13:
                return trans;
            default:
                return -1;
        }
    }

   
    
}
