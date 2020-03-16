package Default.Models;

import java.util.ArrayList;
import java.util.List;

public class Taalkeuze {

    private String taalkeuze, landcode;
    private ArrayList<Taalkeuze> taalkeuzes;

    public List<Taalkeuze> taalkeuzeList;

    public Taalkeuze(){
        taalkeuzeList = new ArrayList<>();
        }


    public String getTaalkeuze() {
        return taalkeuze;
    }

    public void setTaalkeuze(String taalkeuze) {
        this.taalkeuze = taalkeuze;
    }

    public String getLandcode() {
        return landcode;
    }

    public void setLandcode(String landcode) {
        this.landcode = landcode;
    }

    public ArrayList<Taalkeuze> getTaalkeuzes() {
        return taalkeuzes;
    }

    public void setTaalkeuzes(ArrayList<Taalkeuze> taalkeuzes) {
        this.taalkeuzes = taalkeuzes;
    }

}
