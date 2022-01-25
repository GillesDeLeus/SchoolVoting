
/**
 * class Hoofd - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Hoofd
{
  public static void main(String[] args)
    {
        Verkiezing v = new Verkiezing();
        // opvullen van de HashMaps
        v.toevoegenPersoneelslid(new Personeelslid("P09","Andre",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("P07","Bart",Faculteit.MED));
        v.toevoegenPersoneelslid(new Personeelslid("C04","Carine",Faculteit.SOC));
        v.toevoegenPersoneelslid(new Personeelslid("V88","Daan",Faculteit.SOC));
        v.toevoegenPersoneelslid(new Personeelslid("V45","Els",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("V344","Fien",Faculteit.TAAL));
        v.toevoegenPersoneelslid(new Personeelslid("V445","Gerard",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("G43","Herald",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("T55","Ilse",Faculteit.ECON));
        v.toevoegenPersoneelslid(new Personeelslid("R456","Jan",Faculteit.RECHT));
        v.toevoegenPersoneelslid(new Personeelslid("T343","Kathleen",Faculteit.RECHT));
        v.toevoegenPersoneelslid(new Personeelslid("B67","Lasse",Faculteit.RECHT));
        v.toevoegenPersoneelslid(new Personeelslid("H888","Marleen",Faculteit.TAAL));
        v.toevoegenPersoneelslid(new Personeelslid("J776","Nadine",Faculteit.MED));
        v.toevoegenPersoneelslid(new Personeelslid("H223","OLAF",Faculteit.TAAL));
        v.toevoegenPersoneelslid(new Personeelslid("J8889","Patrick",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("C78","Quenten",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("Q678","Raphael",Faculteit.TAAL));
        v.toevoegenPersoneelslid(new Personeelslid("D009","SAM",Faculteit.PEDA));
        v.toevoegenPersoneelslid(new Personeelslid("D007","Tine",Faculteit.PEDA));
        v.toevoegenPersoneelslid(new Personeelslid("D001","Ulrike",Faculteit.PEDA));
        v.toevoegenPersoneelslid(new Personeelslid("D008","Veerle",Faculteit.PEDA));
        v.toevoegenPersoneelslid(new Personeelslid("D012","Wendy",Faculteit.SOC));
        v.toevoegenPersoneelslid(new Personeelslid("A008","Xavier",Faculteit.PEDA));
        v.toevoegenPersoneelslid(new Personeelslid("A055","Yves",Faculteit.WET));
        v.toevoegenPersoneelslid(new Personeelslid("F008","Zora",Faculteit.PEDA));
        
        v.toevoegenKandidaat(new Kandidaat("R456","Jan"));
        v.toevoegenKandidaat(new Kandidaat("Q678","Raphael"));
        v.toevoegenKandidaat(new Kandidaat("T55","Ilse"));
        // het stemmen begint...
        v.gestemd(new Stem("R456","R456"));
        v.gestemd(new Stem("D009","Q678"));
        v.gestemd(new Stem("J776","Q678"));
        v.gestemd(new Stem("A055","Q678"));
        v.gestemd(new Stem("Q678","R456"));
        v.gestemd(new Stem("C78","R456"));
        v.gestemd(new Stem("C78","R456")); // tweemaal dezelfde
        v.gestemd(new Stem("D012","R456"));
        v.gestemd(new Stem("F008","T55"));
        v.gestemd(new Stem("J8889","T56"));// ongeldige kandidaat
        v.gestemd(new Stem("A008","T55"));
        v.gestemd(new Stem("D008","T55"));
        v.gestemd(new Stem("V445","T55"));
        v.gestemd(new Stem("V88","T55"));
        v.gestemd(new Stem("A055","Q678"));// heeft reeds gestemd
        v.gestemd(new Stem("J776","Q679"));// ongeldige kandidaat
        v.gestemd(new Stem("T55","T55"));
        v.gestemd(new Stem("H223","T55"));
        
        System.out.println("De nieuwe rector is:"+v.wieIsNieuweRector());
        System.out.println("Het aantal geldige stemmen bedraagt: "+ v.getAantalGeldigeStemmen());
        System.out.println("Het aantal ongeldige stemmen bedraagt: "+ v.getAantalOngeldigeStemmen());
    }  
}
