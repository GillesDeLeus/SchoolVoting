
/**
 * class Stem - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Stem
{
    private String codeStemmer;
    private String codeKandidaat;
    
    public Stem(String codeStemmer, String codeKandidaat)
    {
        this.codeStemmer = codeStemmer;
        this.codeKandidaat = codeKandidaat;
    }
    
    public String getCodeStemmer()
    {
        return codeStemmer;
    }
    
    public String getCodeKandidaat()
    {
        return codeKandidaat;
    }
    
    public void maakCodeLeeg()
    {
        codeStemmer="";
    } 
}
