/**
 * @author Iida
 * @version 1.0
 */

package lankavarasto;
/**
 * Olioluokka Lanka, joka toimii yksittäisen Lankakeran tietomallina
 * lankavaraston hallinnointi -ohjelmassa.
 * */
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

    /**
     * toString-metodi, palauttaa Lanka-olion tiedot tulostettuna
     * @return lankaolion tiedot merkkijonona
     */
    public String toString(){
        String tuloste = "Nimi:" +nimi+ ", määrä: "+maara+" grammaa, juoksevuus: "+juoksevuus+" m/100g, väri: "+vari+ " sukkalanka: " +sukkalanka+" varattu projektiin: "+varattu;
        return tuloste;
    }
}