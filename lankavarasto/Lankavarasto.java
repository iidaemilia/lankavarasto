public class Lankavarasto{
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
}