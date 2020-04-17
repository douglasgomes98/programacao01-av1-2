/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Country;

/**
 * @author dougl
 */
public class Program {

    public static void main(String[] args) {

        Country brasil = new Country("brasil", "brasilia", 10.5);
        Country uruguay = new Country("Uruguay", "nao sei", 11.5);
        Country venezuela = new Country("Venezuela", "Roraima", 0.24);
        Country paraguay = new Country("Paraguay", "Roraima", 0.24);
        Country bolivia = new Country("Bolivia", "Roraima", 0.24);
        Country chile = new Country("Chile", "Roraima", 0.24);

        if (brasil.addCountryToBorder(uruguay)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application");
        }

        if (brasil.addCountryToBorder(brasil)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application.Program");
        }

        if (brasil.addCountryToBorder(uruguay)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application");
        }

        if (brasil.addCountryToBorder(venezuela)) {
            System.out.println("application.Program.main()");
        } else {
            System.err.println("application2");
        }

        System.out.println(brasil.getBorder_countries());

        chile.addCountryToBorder(bolivia);
        chile.addCountryToBorder(paraguay);
        chile.addCountryToBorder(uruguay);
        chile.addCountryToBorder(venezuela);

        System.out.println(brasil.showCountriesEquals(chile).toString());
    }

}
