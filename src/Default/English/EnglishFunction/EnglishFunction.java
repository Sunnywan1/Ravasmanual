package Default.English.EnglishFunction;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EnglishFunction {

    public JsonReader jr;
    private String questionSplitYes,questionSplitNo,
            descriptionSplitStep1, descriptionSplitStep2, descriptionSplitStep3;

    public EnglishFunction(){
        //get data from Jsonfile
        jr = new JsonReader();
        jr.getTaalkeuze_weegsysteemData();

    }

    public void Yes_no_combobox() {
        //Get object from ArrayList
        List<Object> test = new ArrayList<>();
        String yes_no_question;

        //stream
        Stream<Weegsysteem_Taalkeuze> o =  jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("English"));
        //het resultaat toevoegen aan de listview
        o.forEach(v -> test.add(v.getJa_nee_vraag()));

        yes_no_question = test.get(0).toString();
        setQuestionSplitYes (yes_no_question.split(",")[0]);
        setQuestionSplitNo (yes_no_question.split(",")[1]);
        System.out.println(questionSplitYes);
        System.out.println(questionSplitNo);
    }

    public void descriptionEnglishText(){
        //Get object from ArrayList
        List<Object> test = new ArrayList<>();
        String descriptionEnglish;

        //stream
        Stream<Weegsysteem_Taalkeuze> o = jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList.stream().filter(v -> v.getTaalkeuze().equals("English") && v.getWeegsysteem().equals("xPico240"));
        o.forEach(v -> test.add(v.getBeschrijving()));

        //split into each value
        descriptionEnglish = test.get(0).toString();
        setDescriptionSplitStep1(descriptionEnglish.split(",")[0]);
        setDescriptionSplitStep2(descriptionEnglish.split(",")[1]);
        setDescriptionSplitStep3(descriptionEnglish.split(",")[2]);
    }

    public String getQuestionSplitYes() {
        return questionSplitYes;
    }

    public void setQuestionSplitYes(String questionSplitYes) {
        this.questionSplitYes = questionSplitYes;
    }

    public String getQuestionSplitNo() {
        return questionSplitNo;
    }

    public void setQuestionSplitNo(String questionSplitNo) {
        this.questionSplitNo = questionSplitNo;
    }

    public String getDescriptionSplitStep1() {
        return descriptionSplitStep1;
    }

    public void setDescriptionSplitStep1(String descriptionSplitStep1) {
        this.descriptionSplitStep1 = descriptionSplitStep1;
    }

    public String getDescriptionSplitStep2() {
        return descriptionSplitStep2;
    }

    public void setDescriptionSplitStep2(String descriptionSplitStep2) {
        this.descriptionSplitStep2 = descriptionSplitStep2;
    }

    public String getDescriptionSplitStep3() {
        return descriptionSplitStep3;
    }

    public void setDescriptionSplitStep3(String descriptionSplitStep3) {
        this.descriptionSplitStep3 = descriptionSplitStep3;
    }
}
