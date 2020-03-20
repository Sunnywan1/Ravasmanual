package Default.Dutch.Dutch_xPico240;

import Default.JsonReader;
import Default.Models.Weegsysteem_Taalkeuze;
import Default.Dutch.DutchFunction.DutchFunction;
import Default.Weegsysteem_TaalkeuzeView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class PasswordQuestionDutch240View extends GridPane {

    private Text txtTutorial, txtCheck;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;
    public DutchFunction dutchFunction;


    public PasswordQuestionDutch240View (FlowPane mainpane) {

        //call the function of the other class
        dutchFunction = new DutchFunction();
        dutchFunction.Ja_nee_combobox();
        dutchFunction.descriptionDutchText();

        txtTutorial = new Text(dutchFunction.getDescriptionSplitStep2());

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(dutchFunction.getVraagSplitJa(),dutchFunction.getVraagSplitNee());


        btnSave = new Button("Volgende");
        btnSave.setOnAction(eventSave -> {
                    if (boxYesNo.getValue().equals("Ja")) {
                        mainpane.getChildren().clear();
                        new PasswordQuestionDutch240View(mainpane);
                    }
                    //if (boxYesNo.getValue().equals("Nee")) {
                        //txtCheck = new Text("Failure");
                   // }

                });

        btnBack = new Button("Terug");
        btnBack.setOnAction(eventBack -> {
            mainpane.getChildren().clear();
            new SelectNetworkDutch240View(mainpane);
        });

        add(txtTutorial, 0, 0);
        add(boxYesNo, 1, 0);
        add(btnSave, 2, 2);
        add(btnBack, 0, 2);
        //add(txtCheck, 0,3);

        mainpane.getChildren().add(this);
    }

}
