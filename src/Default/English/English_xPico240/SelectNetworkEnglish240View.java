package Default.English.English_xPico240;

import Default.Dutch.DutchFunction.DutchFunction;
import Default.English.EnglishFunction.EnglishFunction;
import Default.Weegsysteem_TaalkeuzeView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SelectNetworkEnglish240View extends GridPane {

    private Text txtTutorial;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;
    private EnglishFunction englishFunction;


    public SelectNetworkEnglish240View (FlowPane mainpane) {

        //call the function of the other class
        englishFunction = new EnglishFunction();
        englishFunction.Yes_no_combobox();
        englishFunction.descriptionEnglishText();

        txtTutorial = new Text(englishFunction.getDescriptionSplitStep1());

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(englishFunction.getQuestionSplitYes(),englishFunction.getQuestionSplitNo());


        btnSave = new Button("Volgende");
        btnBack = new Button("Terug");
        btnBack.setOnAction(event -> {
            mainpane.getChildren().clear();
            new Weegsysteem_TaalkeuzeView(mainpane);
        });


        add(txtTutorial, 0, 0);
        add(boxYesNo, 1, 0);
        add(btnSave, 2, 2);
        add(btnBack, 0, 2);

        mainpane.getChildren().add(this);
    }
}
