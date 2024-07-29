import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mesafe_ucreti = 0.10;

        // Kullanıcıdan mesafe bilgisini alma
        System.out.println("Lütfen mesafeyi (km cinsinden) giriniz:");
        int mesafe = scanner.nextInt();

        // Kullanıcıdan yaş bilgisini alma
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();

        // Kullanıcıdan yolculuk tipi bilgisini alma
        System.out.println("Lütfen yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş-Dönüş):");
        int yolculukTipi = scanner.nextInt();
        double bilet_fiyati;
        if (yas < 12) {
            if (yolculukTipi == 2) {
                bilet_fiyati = (mesafe_ucreti * mesafe) / 2;
                bilet_fiyati = (bilet_fiyati * 8) / 10;
            } else {
                bilet_fiyati = (mesafe_ucreti * mesafe) / 2;
            }
            System.out.println("toplam tutar :" + bilet_fiyati);

        }
        else if(yas >=12 && yas <24)
        {
            if (yolculukTipi == 2) {
                bilet_fiyati = ((mesafe_ucreti * mesafe) * 9) / 10;
                bilet_fiyati = (bilet_fiyati * 8) / 10;
            } else {
                bilet_fiyati = ((mesafe_ucreti * mesafe) * 9) / 10;
            }
            System.out.println("toplam tutar :" + bilet_fiyati);
        }
        else if(yas > 65)
        {
            if (yolculukTipi == 2) {
                bilet_fiyati = ((mesafe_ucreti * mesafe) * 7) / 10;
                bilet_fiyati = (bilet_fiyati * 8) / 10;
            } else {
                bilet_fiyati = ((mesafe_ucreti * mesafe) * 7) / 10;
            }
            System.out.println("toplam tutar :" + bilet_fiyati);
        }
        else
        {
            if (yolculukTipi == 2) {
                bilet_fiyati = mesafe_ucreti * mesafe;

                bilet_fiyati = (bilet_fiyati * 8) / 10;
            } else {
                bilet_fiyati = mesafe_ucreti * mesafe;
            }
            System.out.println("toplam tutar :" + bilet_fiyati);
        }
    }
}