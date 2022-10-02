package org.perscholas.gladiator;


import org.perscholas.gladiator.Gladiator.name;
import org.perscholas.gladiator.Gladiator.Arena;

import javax.naming.Name;

public class Main {
    public static void main(String[] args){

        name Lamine = new name("Lamine","Greeny", "Shiela",  "Sebatian");
        System.out.println(Lamine.firstName);
        System.out.println(Lamine.Spear);
        System.out.println(Lamine.Club);
        System.out.println(Lamine.Trindent);



        Arena Roma = new Arena ("Kalib", "Roma Italy");
        System.out.println(Roma.arenaName);
        System.out.println(Roma.arenaLocation);
    }
}
