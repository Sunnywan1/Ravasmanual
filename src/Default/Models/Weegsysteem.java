package Default.Models;

import java.util.ArrayList;
import java.util.List;

public class Weegsysteem{

    private String weegsysteem, adresbalk, weegsysteem_netwerk, ip_address;
    private ArrayList<Weegsysteem> weegsystemen;

    public List<Weegsysteem> weegsysteemList;

    public String getWeegsysteem() {
        return weegsysteem;
    }

    public void setWeegsysteem(String weegsysteem) {
        this.weegsysteem = weegsysteem;
    }

    public String getAdresbalk() {
        return adresbalk;
    }

    public void setAdresbalk(String adresbalk) {
        this.adresbalk = adresbalk;
    }

    public String getWeegsysteem_netwerk() {
        return weegsysteem_netwerk;
    }

    public void setWeegsysteem_netwerk(String weegsysteem_netwerk) {
        this.weegsysteem_netwerk = weegsysteem_netwerk;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public ArrayList<Weegsysteem> getWeegsystemen() {
        return weegsystemen;
    }

    public void setWeegsystemen(ArrayList<Weegsysteem> weegsystemen) {
        this.weegsystemen = weegsystemen;
    }



}
