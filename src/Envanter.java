package MaceraOyunu;

import java.util.Scanner;

public class Envanter {
    private boolean su,yiyecek,odun;
    private String isim,kisim;
    private int hasar,zırh;

    Envanter(){
    this.su = false;
    this.yiyecek = false;
    this.hasar = 0;
    this.zırh = 0;
    this.sIsim = null;
    this.zIsim = null;
    }
    public boolean isSu(){
        return su;
    }
    public void setSu(boolean su){
        this.su = su;
    }
    public boolean isYiyecek(){
        return yiyecek;
    }
    public void setYiyecek(boolean yiyecek){
        this.yiyecek = yiyecek;
    }
    public boolean isOdun{
        return odun;
    }
    public void setOdun(boolean odun){
        this.odun = odun;
    }
    public String getIsim(){
        return sIsim;

    }
    public void setIsim(String sIsim){
        this.sIsim = sIsim;
    }
}