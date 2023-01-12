package MaceraOyunu;

public class GuvenliEv extends MaceraOyunu.NormalKonum{

    GuvenliEv(Oyuncu, oyuncu){super(oyuncu,"Guvenli Ev");

    }

    public boolean getKonum(){
        oyuncu.setSaglik(oyuncu.getDegSaglik());
        System.out.println("iyileştiniz");
        System.out.println("güvenli evdesiniz");
        return true;
    }
}
