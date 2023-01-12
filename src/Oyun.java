package MaceraOyunu;

import java.util.Scanner;

public class Oyun {
    Oyuncu oyuncu;
    Konum konum;
    Scanner scan = new Scanner(System.in);

    public void giris() {
        Scanner scan = new Scanner(System.in);
        System.out.printtn("Macera Oyununa Hosgeldiniz !");
        System.out.print("Oyuna baslamadan Gnce isminizi giriniz :");
        String oyuncuIsmi = scan.nextLine();
        oyuncu = new Oyuncu(oyuncuIsmi);
        oyuncu.selectCha();
        basla();
    }

    public void basla() {
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
        System.out.println("Liitfen konumunuzu seciniz: ");
        System.out.println("1. Giivenli Ev ---> Size ait giivenli bir bélge, diisman yok! ");
        System.out.println("2. Magara ---> Karsiniza zombi cikabilir! ");
        System.out.println("3. Orman ---> Karsiniza vampir cikabilir! ");
        System.out.println("4. Nehir ---> Karsiniza ay1 cikabilir! ");
        System.out.println("5. Magaza ---> Silah veya zirh alabilirsiniz! ");
        System.out.println("gitmek istediğiniz yer:");
        int secKonum = scan.nextInt();
        while (secKonum<0 || secKonum>5){
            System.out.print("Geçerli bi yer giriniz");
            secKonum=scan.nextInt();
        }
        switch (secKonum) {
            case 1:
                konum= new MaceraOyunu.GuvenliEv(oyuncu);
            case 5:
                konum = new MaceraOyunu.Magaza(oyuncu);
                break;

            default:
                konum= new MaceraOyunu.GuvenliEv(oyuncu);
        }
        if(konum.getKonum()){
            System.out.println("Oyun bitti");
            break;
        }
    }


    }
