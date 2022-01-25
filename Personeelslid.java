
/**
 * class Personeelslid - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
import java.time.Year;
public class Personeelslid
{
    private String ucode;
    private String naam;
    private Faculteit fac;
    private int geboortejaar;
    
    public Personeelslid(String ucode, String naam, Faculteit fac)
    {
        this.ucode = ucode;
        this.naam = naam;
        this.fac = fac;
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public String getUcode()
    {
        return ucode;
    }
    
    public Faculteit getFaculteit()
    {
        return fac;
    }
    
    public int getGeboortejaar()
    {
        return geboortejaar;
    }
    
    public int getLeeftijd()
    {
        return Year.now().getValue() - geboortejaar;
    }
     
}
