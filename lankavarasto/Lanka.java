/**
 * @author Iida
 * @version 1.0
 */

package lankavarasto;
/**Olioluokka Lanka */
public class Lanka {
    private String nimi;
    private double maara;
    private double juoksevuus;
    private String vari;
    private boolean sukkalanka;
    private boolean varattu;

    /**
     * parametriton alustaja uuden lankaolion luomista varten.
     */
    public Lanka(){
    }

    /**parametrillinen alustaja luo uuden lankaolion.
     * @param nimi kertoo langan nimen.
     * @param maara kertoo langan määrän grammoina.
     * @param juoksevuus kertoo langan juoksevuuden eli metrimäärän per 100g.
     * @param vari kertoo langan värin.
     * @param sukkalanka kertoo, onko kyseessä sukkiin kelpaava (vahvistettu) lanka.
     * @param varattu kertoo, onko lanka varattu johonkin käsityöprojektiin.
     */
    public Lanka(String nimi, double maara, double juoksevuus, String vari, boolean sukkalanka){
        this.nimi=nimi;
        this.maara=maara;
        this.juoksevuus=juoksevuus;
        this.vari=vari;
        this.sukkalanka=sukkalanka;
    }

    /**
     * Asettaa nimen.
     * @param nimi uusi nimi lankaoliolle.
    */
    public void setNimi(String nimi){
        this.nimi=nimi;
    }
    
    /**
     * Asettaa määrän.
     * @param maara uusi määrä lankaoliolle.
    */
    public void setMaara(double maara){
        this.maara=maara;
    }

    /**
     * Asettaa juoksevuuden.
     * @param juoksevuus uusi juoksevuus lankaoliolle.
     */
    public void setJuoksevuus(double juoksevuus){
        this.juoksevuus=juoksevuus;
    }

    /**
     * Asettaa värin.
     * @param vari uusi väri lankaoliolle.
    */
    public void setVari(String vari){
        this.vari=vari;
    }

    /**
     * Asettaa arvon sukkalangalle
     * @param sukkalanka onko sukkalanka vai ei.
    */
    public void setSukkalanka(boolean sukkalanka){
        this.sukkalanka=sukkalanka;
    }

    /**
     * Asettaa arvon siitä, onko lanka varattu toiseen projektiin.
     * @param varattu kertoo, onko varattu vai ei.
    */
    public void setVarattu(boolean varattu){
        this.varattu=varattu;
    }

    /**
     * Palauttaa nimen.
     * @return langan nimi.
    */
    public String getNimi(){
        return nimi;
    }

    /**
     * Palauttaa määrän.
     * @return langan määrä.
    */
    public double getMaara(){
        return maara;
    }

    /**
     * Palauttaa juoksevuuden.
     * @return langan juoksevuus.
    */
    public double getJuoksevuus(){
        return juoksevuus;
    }

    /**
     * Palauttaa langan värin.
     * @return langan väri.
     */
    public String getVari(){
        return vari;
    }

    /**
     * Palauttaa tiedon, onko sukkalanka vai ei.
     * @return onko sukkalanka.
     */
    public boolean getSukkalanka(){
        return sukkalanka;
    }

    /**
     * Palauttaa tiedon, onko lanka varattu toiseen projektiin vai ei.
     * @return onko varattu.
     */
    public boolean getVarattu(){
        return varattu;
    }

    /**TÄSSÄ EKA 30 MIN = loin olioluokan Lanka, muuttujat, konstruktorit sekä getterit ja setterit */

    /**
     * Lisää lankaa langan määrään.
     * @param maara määrä, johon lankaa lisätään.
     * @param lisattavaMaara määrä, joka lankaa halutaan lisätä.
     * @param uusiMaara uusi määrä, johon haluttu määrä on lisätty.
     * @return tieto, että lanka on lisätty onnistuneesti.
     */
    public String lisaaLankaa(double lisattavaMaara){
        double uusiMaara=maara+lisattavaMaara;
        maara=uusiMaara;
        return "Lanka lisätty";
    }
    /**
     * Vähentää langan määrää. 
     * Tarkistaa, onko lankaa mahdollista vähentää haluttu määrä.
     * @param vahennettavaMaara lankavaraston langasta vähennettävä määrä
     * Jos lankaa voidaan vähentää
     * @return true
     * Jos lankaa ei voida vähentää
     * @return false
     * Jos lanka vähennyksen yhteydessä loppuu
     * @return true ja tieto, että lanka loppui.
    */
    public boolean vahennaLankaa(double vahennettavaMaara) {
        if (vahennettavaMaara > maara) {
            System.out.println("Virhe: lankaa on liian vähän.");
            return false;
        }
        maara -= vahennettavaMaara;
        if (maara == 0) {
            System.out.println("Lanka loppui nyt.");
        }
        return true;
    }
    /**TÄSSÄ ENSIMMÄISEN TUNNIN TYÖ - lisätty langan lisäykseen ja vähentämiseen metodit */
public static void main(String[] args) {
    System.out.println("moi");
}
}

/**
 * Käytetty 40 min Javadoc-dokumentaatioon olioluokalle 
 */