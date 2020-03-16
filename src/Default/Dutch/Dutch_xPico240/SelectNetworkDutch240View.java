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

public class SelectNetworkDutch240View extends GridPane {

    private Text txtTutorial;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;
    public DutchFunction dutchFunction;


    public SelectNetworkDutch240View (FlowPane mainpane) {

        //call the function of the other class
        dutchFunction = new DutchFunction();
        dutchFunction.Ja_nee_combobox();

        txtTutorial = new Text("This is Dutch xPico240");

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(dutchFunction.getVraagSplitJa(),dutchFunction.getVraagSplitNee());


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
