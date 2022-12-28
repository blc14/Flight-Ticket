import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        int mesafe , yas , tur ;
        double tutar;

        Scanner input =new Scanner(System.in);

        System.out.println("Mesafe Giriniz:  ");
        mesafe = input.nextInt();
        if(mesafe<0){
            System.out.println("Hatalı Veri Girdiniz.");
        }
        System.out.println("Yaş Giriniz:  ");
        yas= input.nextInt();

        System.out.println("Yolculuk Tipi: \n Tek yön için 1 , Gidiş dönüş için 2 giriniz.");
        tur=input.nextInt();
        if(tur!=1 && tur!=2){
            System.out.println("Hatalı bilgi girdiniz.");
        }

        tutar=0.1*mesafe;
   ;

        if(yas<12){
            tutar=tutar/2;

        }
        else if (yas>=12 && yas<=24){
            tutar=tutar*0.9;

        }

        else if (yas>65) {
            tutar=tutar*0.7;

        }

        if (tur==2) {
            tutar=tutar*2*0.8;

        }

        System.out.println("Toplam tuar:" +tutar);

    }



}
