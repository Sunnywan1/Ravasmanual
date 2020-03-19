package Default.Dutch.DutchFunction;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DutchFunction {

    public JsonReader jr;
    private String vraagSplitJa,vraagSplitNee;

    public void Ja_nee_combobox() {
        //get data from Jsonfile
        jr = new JsonReader();
        jr.getTaalkeuze_weegsysteemData();
        List<Object> test = new ArrayList<>();
        String ja_nee_vraag;

        //stream
        Stream<Weegsysteem_Taalkeuze> o =  jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("Nederlands"));
        //het resultaat toevoegen aan de listview
        o.forEach(v -> test.add(v.getJa_nee_vraag()));

        ja_nee_vraag = test.get(0).toString();
        setVraagSplitJa (ja_nee_vraag.split(",")[0]);
        setVraagSplitNee (ja_nee_vraag.split(",")[1]);
        System.out.println(vraagSplitJa);
        System.out.println(vraagSplitNee);
    }

    public void beschrijvingText(){
    //    Stream<Weegsysteem_T
    }

    public String getVraagSplitJa() {
        return vraagSplitJa;
    }

    public void setVraagSplitJa(String vraagSplitJa) {
        this.vraagSplitJa = vraagSplitJa;
    }

    public String getVraagSplitNee() {
        return vraagSplitNee;
    }

    public void setVraagSplitNee(String vraagSplitNee) {
        this.vraagSplitNee = vraagSplitNee;
    }
}
