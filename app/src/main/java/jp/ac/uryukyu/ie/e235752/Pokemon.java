package jp.ac.uryukyu.ie.e235752;

import java.util.ArrayList;

public class Pokemon {
    String name;
    int type1;
    int type2;
    double hitPoint;
    double attackOfPhisical;
    double diffenceOfPhisical;
    double attackOfSpecial;
    double diffenceOfSpecial;
    double speed;
    public ArrayList<Skill> skills = new ArrayList<>();

    public Pokemon(String name,  int type1, int type2, double hitPoint, double attackOfPhisical, double diffenceOfPhisical, double attackOfSpecial, double diffenceOfSpecial, double speed){
        this.type1 = type1;
        this.type2 = type2;
        this.hitPoint = hitPoint;
        this.attackOfPhisical = attackOfPhisical;
        this.diffenceOfPhisical = diffenceOfPhisical;
        this.attackOfSpecial = attackOfSpecial;
        this.diffenceOfSpecial = diffenceOfSpecial;
        this.speed = speed;
    }
}
