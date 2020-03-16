package Default.Models;

import Default.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Weegsysteem_Taalkeuze {

    private String beschrijving, ja_nee_vraag, weegsysteem, taalkeuze;
    private ArrayList<Weegsysteem_Taalkeuze> weegsysteem_taalkeuzes;
    public List<Weegsysteem_Taalkeuze> weegsysteem_taalkeuzeList;
    private JsonReader jr;

    public Weegsysteem_Taalkeuze(String beschrijving, String ja_nee_vraag, String weegsysteem, String taalkeuze){
        jr = new JsonReader();
        weegsysteem_taalkeuzeList = new ArrayList<>();

        this.beschrijving = beschrijving;
        this.ja_nee_vraag = ja_nee_vraag;
        this.weegsysteem = weegsysteem;
        this.taalkeuze = taalkeuze;
    }

    public Weegsysteem_Taalkeuze(){
        jr = new JsonReader();
        weegsysteem_taalkeuzeList = new ArrayList<>();
    }

    //getter and setters
    public String getWeegsysteem() {
        return weegsysteem;
    }

    public void setWeegsysteem(String weegsysteem) {
        this.weegsysteem = weegsysteem;
    }

    public String getTaalkeuze() { return taalkeuze; }

    public void setTaalkeuze(String taalkeuze) {
        this.taalkeuze = taalkeuze;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getJa_nee_vraag() {
        return ja_nee_vraag;
    }

    public void setJa_nee_vraag(String ja_nee_vraag) {
        this.ja_nee_vraag = ja_nee_vraag;
    }

    public ArrayList<Weegsysteem_Taalkeuze> getWeegsysteem_taalkeuzes() {
        return weegsysteem_taalkeuzes;
    }

    public void setWeegsysteem_taalkeuzes(ArrayList<Weegsysteem_Taalkeuze> weegsysteem_taalkeuzes) {
        this.weegsysteem_taalkeuzes = weegsysteem_taalkeuzes;
    }

    //Create list for weegsysteem_taalkeuze
    public void createWeegsysteem_Taalkeuze(Weegsysteem_Taalkeuze newweegsyteem_taalkeuze){
        weegsysteem_taalkeuzeList.add(newweegsyteem_taalkeuze);
    }

    public String printWeegsysteem_Taalkeuze(){
        String weegsysteem_taalkeuzeList = " Beschrijving : " + beschrijving + " | ja_nee_vraag : " + ja_nee_vraag + " | weegsysteem : " + weegsysteem + " | taalkeuze : " + taalkeuze;
        return weegsysteem_taalkeuzeList;
    }
}
