package Default.German.German_xPico240;

import Default.German.GermanFunction.GermanFunction;
import Default.Weegsysteem_TaalkeuzeView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SelectNetworkGerman240View extends GridPane {

    private Text txtTutorial;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;
    private GermanFunction germanFunction;


    public SelectNetworkGerman240View (FlowPane mainpane) {

        //call the function of the other class
        germanFunction = new GermanFunction();
        germanFunction.Ja_nein_combobox();

        txtTutorial = new Text("This is Dutch xPico240");

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(germanFunction.getQuestionSplitJa(),germanFunction.getQuestionSplitNein());


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
