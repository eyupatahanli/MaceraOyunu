package MaceraOyunu;

import java.util.TreeMap;

public abstract class NormalKonum extends MaceraOyunu.Konum{

    NormalKonum(Oyuncu oyuncu, String isim){
        super(oyuncu);
        this.isim=isim;
    }

    public boolean getKonum(){
        return true;
    }
}