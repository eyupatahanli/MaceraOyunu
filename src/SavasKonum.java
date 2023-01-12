package MaceraOyunu;

public abstract class SavasKonum extends MaceraOyunu.Konum{
    Canavar canavar;
    SavasKonum(Oyuncu oyuncu, String isim, Canavar canavar){
        super(oyuncu);
        this.isim= isim;
        this.canavar = canavar;
    }

    public boolean getKonum(){
        return true;
    }
}