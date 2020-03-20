package Default.Dutch.DutchFunction;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DutchFunction {

    public JsonReader jr;
    private String vraagSplitJa,vraagSplitNee,
            DescriptionSplitStep1, DescriptionSplitStep2, DescriptionSplitStep3;

    public DutchFunction() {
        //get data from Jsonfile
        jr = new JsonReader();
        jr.getTaalkeuze_weegsysteemData();

    }

    public void Ja_nee_combobox() {
        //Get object from ArrayList
        List<Object> test = new ArrayList<>();
        String ja_nee_vraag;

        //stream
        Stream<Weegsysteem_Taalkeuze> o =  jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("Nederlands"));
        //het resultaat toevoegen aan de listview
        o.forEach(v -> test.add(v.getJa_nee_vraag()));

        //split into each value
        ja_nee_vraag = test.get(0).toString();
        setVraagSplitJa (ja_nee_vraag.split(",")[0]);
        setVraagSplitNee (ja_nee_vraag.split(",")[1]);
        System.out.println(vraagSplitJa);
        System.out.println(vraagSplitNee);
    }

    public void descriptionDutchText(){
        //Get object from ArrayList
        List<Object> test = new ArrayList<>();
        String descriptionDutch;

        //stream
        Stream<Weegsysteem_Taalkeuze> o = jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("Nederlands") && v.getWeegsysteem().equals("xPico240"));
        o.forEach(v -> test.add(v.getBeschrijving()));

        //split into each value
        descriptionDutch = test.get(0).toString();
        setDescriptionSplitStep1(descriptionDutch.split(",")[0]);
        setDescriptionSplitStep2(descriptionDutch.split(",")[1]);
        setDescriptionSplitStep3(descriptionDutch.split(",")[2]);
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

    public String getDescriptionSplitStep1() {
        return DescriptionSplitStep1;
    }

    public void setDescriptionSplitStep1(String descriptionSplitStep1) {
        DescriptionSplitStep1 = descriptionSplitStep1;
    }

    public String getDescriptionSplitStep2() {
        return DescriptionSplitStep2;
    }

    public void setDescriptionSplitStep2(String descriptionSplitStep2) {
        DescriptionSplitStep2 = descriptionSplitStep2;
    }

    public String getDescriptionSplitStep3() {
        return DescriptionSplitStep3;
    }

    public void setDescriptionSplitStep3(String descriptionSplitStep3) {
        DescriptionSplitStep3 = descriptionSplitStep3;
    }

    public void setVraagSplitNee(String vraagSplitNee) {
        this.vraagSplitNee = vraagSplitNee;



    }
}
