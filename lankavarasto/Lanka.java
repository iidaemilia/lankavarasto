/**Olioluokka Lanka */
public class Lanka {
    private String nimi;
    private double maara;
    private double juoksevuus;
    private String vari;
    private boolean sukkalanka;
    private boolean varattu;

    /**parametriton alustaja*/
    public Lanka(){
    }

    /**parametrillinen alustaja langalle */
    public Lanka(String nimi, double maara, double juoksevuus, String vari, boolean sukkalanka){
        this.nimi=nimi;
        this.maara=maara;
        this.juoksevuus=juoksevuus;
        this.vari=vari;
        this.sukkalanka=sukkalanka;
    }

    /**Set-metodi nimen asettamiselle*/
    public void setNimi(String nimi){
        this.nimi=nimi;
    }
    
    /**Set-metodi langan määrän asettamiselle */
    public void setMaara(double maara){
        this.maara=maara;
    }

    /**Set-metodi langan juoksevuuden asettamiselle */
    public void setJuoksevuus(double juoksevuus){
        this.juoksevuus=juoksevuus;
    }

    /**Set-metodi langan värin asettamiselle */
    public void setVari(String vari){
        this.vari=vari;
    }

    /**Set-metodi sen määrittämiselle onko lanka sukkalankaa vai ei */
    public void setSukkalanka(boolean sukkalanka){
        this.sukkalanka=sukkalanka;
    }

    /**Set-metodi sen määrittämiseksi, onko lanka varattu jo johonkin käsityöprojektiin */
    public void setVarattu(boolean varattu){
        this.varattu=varattu;
    }

    /**Seuraavaksi määritellään arvon palauttavat get-metodit */
    /**Get-metodi langan nimen palauttamiselle */
    public String getNimi(){
        return nimi;
    }

    /**Get-metodi langan määrän palauttamiseksi */
    public double getMaara(){
        return maara;
    }

    /**Get-metodi langan juoksevuuden palauttamiselle */
    public double getJuoksevuus(){
        return juoksevuus;
    }

    /**Get-metodi värin palauttamiselle */
    public String getVari(){
        return vari;
    }

    /**Get-metodi sen palauttamiselle, onko lanka sukkalankaa vai ei */
    public boolean getSukkalanka(){
        return sukkalanka;
    }

    /**Get-metodin sen palauttamiselle, onko lanka jo varattu projektiin vai ei */
    public boolean getVarattu(){
        return varattu;
    }

    /**TÄSSÄ EKA 30 MIN = loin olioluokan Lanka, muuttujat, konstruktorit sekä getterit ja setterit */

    /**Metodeja ohjelman toimintaan liittyen */
    /**Lisää langan määrää -metodi */
    public String lisaaLankaa(double lisattavaMaara){
        double uusiMaara=maara+lisattavaMaara;
        maara=uusiMaara;
        return "Lanka lisätty";
    }
    /**Metodi, joka vähentää langan määrää */
    public boolean vahennaLankaa(double vahennettavaMaara) {
        /**Tarkistetaan, onko lankaa liian vähän vähennyksen tekemiseen, jos on, palautetaan false */
        if (vahennettavaMaara > maara) {
            System.out.println("Virhe: lankaa on liian vähän.");
            return false;
        }
        /**Tehdään vähennys, jos se onnistuu */
        maara -= vahennettavaMaara;
        /**Jos kaikki lanka käytetään, ilmoitetaan erikseen, että lanka loppui nyt */
        if (maara == 0) {
            System.out.println("Lanka loppui nyt.");
        }
        /**palautetaan true, kun vähennys onnistui */
        return true;
    }
    /**TÄSSÄ ENSIMMÄISEN TUNNIN TYÖ - lisätty langan lisäykseen ja vähentämiseen metodit */
public static void main(String[] args) {
    System.out.println("moi");
}
}