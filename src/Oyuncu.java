import MaceraOyunu.Envanter;

import java.util.Scanner;
public class Oyuncu {
    private int hasar, saglik,para,degSaglik;
    protected String isim, kisim;
    private Envanter env;

    Scanner scan =new Scanner(System.in);

    public Oyuncu(String isim) {
        this.isim = isim;
        this.env = new Envanter();
    }

    public void selectCha() {
        switch (chaMenu()) {
            //samuray
            case 1:
                kOyuncu("Samuray", 5, 21, 15);
                break;
            case 2:
                kOyuncu("okcu", 7, 18, 20);
                break;
            case 3:
                kOyuncu("Şovalye", 8, 24, 5);
                break;
            default:
                kOyuncu("Samuray", 5, 21, 15);
                break;
        }
        System.out.println("Karakter: "+ getKisim()+ "\t Hasar: "+getHasar()+"\t Saglik: "+getSaglik()+"\t Para: "+getPara());
    }
    public int chaMenu() {
        System.out.println("Litfen bir karakter seciniz: ");
        System. out.println("1- Samuray\t Hasar: 5\t Sagluk : 21\t Para:15");
        System.out.println("2- Okcu  \t Hasar: 7\t Saglik : 18\t Para:20");
        System. out. println("3- Sovalye\t Hasar: 8\t Saglik : 24\t Para:5");
        System.out.println("Karakter Seciminiz: ");
        int chaID=scan.nextInt();

        while(chaID<1 || chaID>3) {
            System.out.println("Lütfen geecerli bir karakter giriniz!");
            chaID = scan.nextInt();
        }
        return chaID;
        }
        public int getToplamHasar(){
        return this.getHasar() + this.getEnv().getHasar();
        }

        public void kOyuncu(String kisim,int hsr, int sglk, int para){
            setKisim(kisim);
            setHasar(hsr);
            setSaglik(sglk);
            setPara(para);
            setDegSaglik(sglk);
        }
        public int getHasar(){
            return hasar;
        }
        public void setHasar(int hasar) {
            this.hasar = hasar;
        }
        public int getSaglik() {
            return saglik;
        }
        public void setSaglik(int saglik){
        this.saglik = saglik;
        }
        public int getPara(){
            return para;
        }
        public void setPara(int para){
            this.para = para;
        }
        public String getIsim() {
            return isim;
        }
        public void setIsim (String isim){
            this.isim = isim;
        }
        public String getKisim(){
            return kisim;
        }
        public void setKisim(String kisim){
            this.kisim = kisim;
        }

}