package objectorientedprogramming;

public class Film {
    
    public int id;
    public String naam;
    public String studio;
    public int jaar;
    public String taal;
    
    public Acteur[] acteurs;
    public Regiseur regiseur;
   
    public Film(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }
    
    @Override
    public String toString() {
        return this.naam;
    }
}
