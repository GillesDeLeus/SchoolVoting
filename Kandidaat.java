import java.util.ArrayList;
/**
 * class Kandidaat - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Kandidaat
{
    private String naam;
    private String code;
    private int[] faculteitsTabel;
    
    public Kandidaat(String naam, String id)
    {
        this.naam = naam;
        code = id;
        faculteitsTabel = new int[7];
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public Faculteit getFaculteit(int i)
    {
        Faculteit fac = null;
        switch(i)
        {
            case 0:
            fac = Faculteit.MED;
            break;
            case 1:
            fac = Faculteit.WET;
            break;
            case 2:
            fac = Faculteit.TAAL;
            break;
            case 3:
            fac = Faculteit.PEDA;
            break;
            case 4:
            fac = Faculteit.RECHT;
            break;
            case 5:
            fac = Faculteit.ECON;
            break;
            case 6:
            fac = Faculteit.SOC;
            break;
        }
        return fac;
    }
    
    /*
     * overloopt de gehele tabel en telt telkens de waarde op bij het totaal
     * 
     * @return geeft het totaal aantal stemmen terug¨als int
     */
    public int totaalAantalStemmen()
    {
        int totaal = 0;
        for (int i = 0; i < faculteitsTabel.length;i++)
        {
            totaal += faculteitsTabel[i];
        }
        return totaal;
    }
    
    /*
     * zal voor elke opgegeven faculteit de overeenkomstige waarde in de tabel
     * optellen
     * 
     *@param geef de faculteit op ¨
     *@return geen returntype
     */
    public void geefStem(Faculteit fac)
    {
        switch(fac)
        {
            case MED:
            faculteitsTabel[0] = faculteitsTabel[0] + 1;
            break;
            case WET:
            faculteitsTabel[1]++;
            break;
            case TAAL:
            faculteitsTabel[2]++;
            break;
            case PEDA:
            faculteitsTabel[3]++;
            break;
            case RECHT:
            faculteitsTabel[4]++;
            break;
            case ECON:
            faculteitsTabel[5]++;
            break;
            case SOC:
            faculteitsTabel[6]++;
            break;
        }
    }
    
    /*
     *@return een stringrepresentatie ¨
     */
    
    public String toString()
    {
        String string = "naam: " + naam;
        string += "\naantal Stemmen: " + totaalAantalStemmen();
        for (int i =0;i<faculteitsTabel.length;i++)
        {
            string += "\n " + getFaculteit(i) +  ": " + faculteitsTabel[i];
        }
        
        return string;
    }
    
}
