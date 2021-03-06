package Default.Dutch.Dutch_xPicoWifi;

import Default.Weegsysteem_TaalkeuzeView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SelectNetworkDutchWifiView extends GridPane {

    private Text txtTutorial;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;


    public SelectNetworkDutchWifiView (FlowPane mainpane) {

        txtTutorial = new Text("This is Dutch xPicoWifi");

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(
                "Yes",
                "No"
        );

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
