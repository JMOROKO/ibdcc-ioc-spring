package com.silsTechnologie.pres;

import com.silsTechnologie.ext.DaoImpl2;
import com.silsTechnologie.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Res = "+metier.calcule());
    }
}
