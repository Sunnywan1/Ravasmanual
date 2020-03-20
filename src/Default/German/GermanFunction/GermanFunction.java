package Default.German.GermanFunction;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GermanFunction {

    public JsonReader jr;
    private String questionSplitJa,questionSplitNein;

    public GermanFunction(){
        //get data from Jsonfile
        jr = new JsonReader();
        jr.getTaalkeuze_weegsysteemData();

    }

    public void Ja_nein_combobox() {

        //Get object from ArrayList
        List<Object> test = new ArrayList<>();
        String ja_nein_question;

        //stream
        Stream<Weegsysteem_Taalkeuze> o =  jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("Deutsche"));
        //het resultaat toevoegen aan de listview
        o.forEach(v -> test.add(v.getJa_nee_vraag()));

        //split into each value
        ja_nein_question = test.get(0).toString();
        setQuestionSplitJa (ja_nein_question.split(",")[0]);
        setQuestionSplitNein (ja_nein_question.split(",")[1]);
        System.out.println(questionSplitJa);
        System.out.println(questionSplitNein);
    }

    public void beschrijvingText(){
        //    Stream<Weegsysteem_T
    }

    public String getQuestionSplitJa() {
        return questionSplitJa;
    }

    public void setQuestionSplitJa(String questionSplitJa) {
        this.questionSplitJa = questionSplitJa;
    }

    public String getQuestionSplitNein() {
        return questionSplitNein;
    }

    public void setQuestionSplitNein(String questionSplitNein) {
        this.questionSplitNein = questionSplitNein;
    }
}
