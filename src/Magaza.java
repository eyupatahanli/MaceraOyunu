package MaceraOyunu;

public class Magaza extends MaceraOyunu.NormalKonum {

    Magaza(oyuncu oyuncu){
        super(oyuncu,"Mağaza");

    }

    public boolean getKonum(){
        System.out.println("para: " + oyuncu.getPara());
        System.out.println("1 silah");
        System.out.println("1 silah");
        System.out.println("1 silah");
        System.out.println("seçiniz");
        int secMagaza = scan.nextInt();
        int secOgeID;
        switch (secMagaza) {
            case 1:
                secOgeID = silahMenu();
                satSilah(secOgeID);
                break;
            case 2:
                secOgeID = zırhMenu();
                satZırh(secOgeID);
                break;
            default:

                break;
        }
        return true;
        }
        public int silahMenu(){
        System.out.println("1 tabanca para hasar");
        System.out.println("1 tabanca para hasar");
        System.out.println("1 tabanca para hasar");
        System.out.println("4 çıkış");
        System.out.println("silah seçin");
        int secSilahID = scan.nextInt();
        return secSilahID
    }
    public int zırhMenu(){
        System.out.println("1 zırh para hasar");
        System.out.println("1 tanca para hasar");
        System.out.println("1 tanca para hasar");
        System.out.println("4 çıkış");
        System.out.println("szırh seçin");
        int secZırhID = scan.nextInt();
        return secZırhID;
    }
    public void satSilah(int ogeID){
        int hasar = 0, Fiyat = 0 ;
        String sIsim = null;
        switch (ogeID){
            case 1:
                hasar = 2;
                sIsim = "Tabanca";
                Fiyat = 5;
                break;
            case 2:
                hasar = 3;
                sIsim = "kılı.";
                Fiyat = 35;
                break;
            case 3:
                hasar = 7;
                sIsim = "tüf";
                Fiyat = 45;
                break;
            case 4:
                System.out.println("Çıkış yapılıyor");
                break;
            default:
                System.out.println("Geçeriz işlem");

        }
        if(Fiyat>0){
            if(oyuncu.getPara()>Fiyat){
                oyuncu.getEnv().setHasar(hasar);
                oyuncu.getEnv().setsIsim(sIsim);
                oyuncu.setPara(oyuncu.getPara()-Fiyat);
                System.out.println("satın aldınız");
            else{
                System.out.println("bakiye yeersiz");
            }
        }
    }
}