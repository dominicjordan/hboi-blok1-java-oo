package objectorientedprogramming;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        
        Scanner lezer = new Scanner(System.in);
        
        
        Regiseur regiseur = new Regiseur();
        regiseur.naam = "Pieter Jacobs";
        regiseur.genre = "Actie";
        regiseur.geboortedatum = new Date(1995, 2, 28);
        regiseur.salaris = 12000000;
        //System.out.println(regiseur);
        //System.out.println(regiseur.naam + " " + regiseur.salaris);
        
        regiseur.verdubbelSalaris();
        //System.out.println("Nieuw salaris: " + regiseur.salaris);
        
        
        
        Regiseur[] regiseurs = new Regiseur[10];
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            Regiseur r = new Regiseur();
            r.naam = "Regiseur " + (i+1);
            r.salaris = random.nextInt(20000000);
            
            regiseurs[i] = r;
            System.out.println(r);
        }
        
        System.out.println();
        System.out.println();
        
        for (int i = 0; i < regiseurs.length; i++) {
            Regiseur r = regiseurs[i];
            
            int nummer = random.nextInt();
            if(nummer%2 == 0) {
                r.verdubbelSalaris();
                System.out.println(r);
            }
        }
    }
    
}
