import java.util.HashMap;
/**
 * class Verkiezing - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */

public class Verkiezing
{
    private HashMap<String, Kandidaat> kandidaten;
    private HashMap<String, Personeelslid> personeelsLeden;
    private HashMap<Kandidaat, Stem> stemmen;
    private int geldigeStemmen;
    private int ongeldigeStemmen;

    public Verkiezing()
    {
        kandidaten = new HashMap<>();
        personeelsLeden = new HashMap<>();
        stemmen = new HashMap<>();
        geldigeStemmen = 0;
        ongeldigeStemmen = 0;
    }

    public int getAantalGeldigeStemmen()
    {
        return geldigeStemmen;
    }

    public int getAantalOngeldigeStemmen()
    {
        return ongeldigeStemmen;
    }

    public void toevoegenPersoneelslid(Personeelslid lid)
    {
        if (!personeelsLeden.containsValue(lid))
        {
            personeelsLeden.put(lid.getUcode(), lid);
        }
    }

    public void toevoegenKandidaat(Kandidaat kandidaat)
    {
        if (!kandidaten.containsValue(kandidaat))
        {
            kandidaten.put(kandidaat.getCode(), kandidaat);
        }
    }

    public boolean gestemd(Stem stem)
    {
        String codeStemmer = stem.getCodeStemmer();
        String codeKandidaat = stem.getCodeKandidaat();
        if (kandidaten.containsKey(codeKandidaat) && personeelsLeden.containsKey(codeStemmer) && !stemmen.containsValue(stem))
        {
            stemmen.put(kandidaten.get(codeKandidaat), stem);
            Faculteit faculteitStemmer = personeelsLeden.get(codeStemmer).getFaculteit();
            Kandidaat kandidaatStem = kandidaten.get(codeKandidaat);
            kandidaatStem.geefStem(faculteitStemmer);
            geldigeStemmen++;
            return true;
        }
        else
        {
            ongeldigeStemmen++;
            return false;
        }
    }
    
    public Kandidaat wieIsNieuweRector()
    {
        Kandidaat nieuweRector = null;
        int meestBehaaldeStemmen = 0; 
        for (HashMap.Entry<Kandidaat, Stem> stem : stemmen.entrySet())
        {
            Kandidaat kandidaat = stem.getKey();
            int aantalStemmen = kandidaat.totaalAantalStemmen();
            if (aantalStemmen >= meestBehaaldeStemmen)
            {
                meestBehaaldeStemmen = aantalStemmen;
                nieuweRector = kandidaat;
            }
        }
        return nieuweRector;
    }
    
}
