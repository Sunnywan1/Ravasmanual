package Default;

import Default.Dutch.Dutch_xPico240.SelectNetworkDutch240View;
import Default.Dutch.Dutch_xPicoWifi.SelectNetworkDutchWifiView;
import Default.English.English_xPico240.SelectNetworkEnglish240View;
import Default.English.English_xPicoWifi.SelectNetworkEnglishWifiView;
import Default.German.German_xPico240.SelectNetworkGerman240View;
import Default.German.German_xPicoWifi.SelectNetworkGermanWifiView;
import Default.Models.Weegsysteem_Taalkeuze;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Weegsysteem_TaalkeuzeView extends GridPane {

    private Text txtTaalkeuze, txtWeegsysteem;
    private ComboBox boxTaalkeuze, boxWeegsysteem;
    private Button btnSave;
    JsonReader jr;

    public Weegsysteem_TaalkeuzeView(FlowPane p) {

        txtTaalkeuze = new Text("Taalkeuze : ");
        txtWeegsysteem = new Text("Weegsysteem : ");

        boxTaalkeuze = new ComboBox();
        boxTaalkeuze.getItems().add("");
        boxWeegsysteem = new ComboBox();
        boxWeegsysteem.getItems().add("");

        //get data from JsonFile
            jr = new JsonReader();
            //fills combobox for taalkeuze
            jr.getTaalkeuze_weegsysteemData();
            //System.out.println(weegsysteem_taalkeuzeList);
            for(Weegsysteem_Taalkeuze w : jr.weegsysteem_taalkeuze.weegsysteem_taalkeuzeList) {
                if (!boxTaalkeuze.getItems().contains(w.getTaalkeuze())){
                    //insert this methode
                    boxTaalkeuze.getItems().add(w.getTaalkeuze());
                }
            if (!boxWeegsysteem.getItems().contains(w.getWeegsysteem())){
                    //insert this methode
                    boxWeegsysteem.getItems().add(w.getWeegsysteem());
            }
      }

        //Button based on selected value for taalkeuze and weegsysteem
        btnSave = new Button("Next");
        btnSave.setOnAction(event -> {
            if (boxWeegsysteem.getValue().equals("xPico240") && boxTaalkeuze.getValue().equals("Nederlands")) {
                p.getChildren().clear();
                new SelectNetworkDutch240View(p);
            }
            if (boxWeegsysteem.getValue().equals("xPico240") && boxTaalkeuze.getValue().equals("English")) {
                p.getChildren().clear();
                new SelectNetworkEnglish240View(p);
            }
            if (boxWeegsysteem.getValue().equals("xPico240") && boxTaalkeuze.getValue().equals("Deutsche")) {
                p.getChildren().clear();
                new SelectNetworkGerman240View(p);
            }
            if (boxWeegsysteem.getValue().equals("xPicoWifi") && boxTaalkeuze.getValue().equals("Nederlands")) {
                p.getChildren().clear();
                new SelectNetworkDutchWifiView(p);
            }
            if (boxWeegsysteem.getValue().equals("xPicoWifi") && boxTaalkeuze.getValue().equals("English")) {
                p.getChildren().clear();
                new SelectNetworkEnglishWifiView(p);
            }
            if (boxWeegsysteem.getValue().equals("xPicoWifi") && boxTaalkeuze.getValue().equals("Deutsche")) {
                p.getChildren().clear();
                new SelectNetworkGermanWifiView(p);
            }
        });

        add(txtTaalkeuze, 0, 0);
        add(boxTaalkeuze, 1, 0);
        add(txtWeegsysteem, 0, 1);
        add(boxWeegsysteem, 1, 1);
        add(btnSave, 0, 2);

        p.getChildren().add(this);
    }
}
