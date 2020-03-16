package Default.English.English_xPicoWifi;

import Default.Weegsysteem_TaalkeuzeView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SelectNetworkEnglishWifiView extends GridPane {

    private Text txtTutorial;
    private ComboBox boxYesNo;
    private Button btnSave, btnBack;


    public SelectNetworkEnglishWifiView (FlowPane mainpane) {

        txtTutorial = new Text("This is English xPicoWifi");

        boxYesNo = new ComboBox();
        boxYesNo.getItems().addAll(
                "Yes",
                "No"
        );

        btnSave = new Button("Next");
        btnBack = new Button("Back");
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
