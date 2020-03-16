package Default;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

import Default.Models.Taalkeuze;
import Default.Models.Weegsysteem;
import Default.Models.Weegsysteem_Taalkeuze;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonReader {

    public Weegsysteem_Taalkeuze weegsysteem_taalkeuze;
    public Taalkeuze taalkeuze;
    public Weegsysteem weegsysteem;
    private String beschrijvingString, vraagString;
    public JsonReader(){
    }

    public void getTaalkeuze_weegsysteemData(){
        String result = "";
        weegsysteem_taalkeuze = new Weegsysteem_Taalkeuze();
        JSONObject jo = readJson();
        JSONArray weegsysteem_taalkeuzeArray = (JSONArray) jo.get("weegsysteem_Taalkeuze");

        for(Object o : weegsysteem_taalkeuzeArray) {
            JSONObject weegsysteem_taalkeuzeobject = (JSONObject) o;
            JSONArray weegsystemen = (JSONArray) weegsysteem_taalkeuzeobject.get("weegsystemen");

            for (Object ws : weegsystemen) {
                String weegsysteemString = ((JSONObject) ws).get("weegsysteem").toString();
                String taalkeuzeString = ((JSONObject) ws).get("taalkeuze").toString();
                JSONArray beschrijvingArray = (JSONArray) ((JSONObject) ws).get("beschrijving");
                for ( Object bes : beschrijvingArray ) {
                    beschrijvingString = ((JSONObject) bes).get("Stap 1").toString() + ",";
                    beschrijvingString = beschrijvingString + ((JSONObject) bes).get("Stap 2").toString() + ",";
                    beschrijvingString = beschrijvingString + ((JSONObject) bes).get("Stap 3").toString();
                    //System.out.println(beschrijvingString);
                }
                JSONArray ja_nee_vraagArray = (JSONArray) ((JSONObject)ws).get("ja_nee_vraag");
                for ( Object vraag : ja_nee_vraagArray) {
                     vraagString = ((JSONObject) vraag).get("Ja").toString() + ",";
                     vraagString = vraagString + ((JSONObject) vraag).get("Nee").toString();
                     //System.out.println(vraagString);
                }
                weegsysteem_taalkeuze.createWeegsysteem_Taalkeuze(new Weegsysteem_Taalkeuze(beschrijvingString, vraagString, weegsysteemString, taalkeuzeString));
            }
        }
    }

    public void getTaalkeuzeData(){
        taalkeuze = new Taalkeuze();
        JSONObject jo = readJson();
        JSONArray taalkeuze = (JSONArray) jo.get("taalkeuzes");

        for(Object o : taalkeuze){
            JSONObject taalkeuzeobject = (JSONObject)o;
            Taalkeuze w = new Taalkeuze();
            w.setTaalkeuze(taalkeuzeobject.get("taalkeuze").toString());
            w.setLandcode(taalkeuzeobject.get("landcode").toString());

        }


    }

    public void getWeegsysteemData(){
        weegsysteem = new Weegsysteem();
        JSONObject jo = readJson();
        JSONArray weegsysteem = (JSONArray) jo.get("weegsystemen");

        for(Object o : weegsysteem){
            JSONObject weegsysteemobject = (JSONObject)o;
            Weegsysteem w = new Weegsysteem();
            w.setWeegsysteem(weegsysteemobject.get("weegsysteem").toString());
            w.setAdresbalk(weegsysteemobject.get("adresbalk").toString());
            w.setWeegsysteem_netwerk(weegsysteemobject.get("weegsysteem_netwerk").toString());
            w.setIp_address(weegsysteemobject.get("ip_address").toString());
        }

    }

    public JSONObject readJson(){
        JSONObject jo = null;
        try{
            URL path = JsonReader.class.getResource("JsonRavas.json");
            File f = new File(path.getFile());
            BufferedReader reader = new BufferedReader(new FileReader(f));
            //String data = new String();
            StringBuffer stringbuffer = new StringBuffer();
            String line = reader.readLine();
            while(line != null){
                //data += line;
                stringbuffer.append(line);
                line = reader.readLine();
            }
            jo = (JSONObject)JSONValue.parseWithException(stringbuffer.toString());
            //JSONObject jo = (JSONObject)JSONValue.parseWithException(data);
            reader.close();
            System.out.println(jo.toString());
        } catch(Exception e){
            System.out.println(e.getMessage());

        }
        return jo;
    }

    public void StringSplitter(){

    }
}
