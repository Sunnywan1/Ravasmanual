package Default.English.EnglishFunction;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EnglishFunction {

    public JsonReader jr;
    private String questionSplitYes,questionSplitNo;

    public void Yes_no_combobox() {
        //get data from Jsonfile
        jr = new JsonReader();
        jr.getTaalkeuze_weegsysteemData();
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

    public void beschrijvingText(){
        //    Stream<Weegsysteem_T
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
}
