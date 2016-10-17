package objectorientedprogramming;

import java.util.Date;

public class Regiseur {
    public String naam;
    public String genre;
    public Date geboortedatum;
    public int salaris;
    
    
    public Regiseur() {
        naam = "Geen naam bekend.";
        genre = "Comedy";
        salaris = -1;
    }
    
    public void verdubbelSalaris() {
        salaris *= 2; 
    }
    
    @Override
    public String toString() {
        String tekst = naam + " " + genre + " " + salaris;
        
        return tekst;
    }
}
