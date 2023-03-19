import java.util.Scanner;

public class Main {

    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int cikartma(int a , int b){
        int result = a - b;
        System.out.println("Cikartma : " + result);
        return result;
    }
    static int carpma(int a , int b){
        int result = a*b;
        System.out.println(" Carpma  : " + result);
        return result;
    }
    static int bolme(int a , int b) {
        if (b == 0) {
            System.out.println("ikinci sayi sifirdan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println(" Bolme  : " + result);
        return result;
    }
    static int usluSayi(int a, int b){
        int result=1;
        for (int i =1 ; i<=b ; i++){
            result *= a;
        }
    return result;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static void dikdortgen(int a, int b){
        System.out.println("Dikdortgenin cevresi : " + 2*(a+b));
        System.out.println("Dikdortgenin alani : " + (a * b));
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu sayi hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdortgen alan ve cevre hesabi\n"
                + "0- Cikis yap\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("ilk Sayiyi giriniz : ");
            int a = scan.nextInt();
            System.out.print("ikinci Sayiyi giriniz : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikartma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    System.out.println("Us hesabi : "+usluSayi(a,b));
                    break;
                case 6:
                    System.out.println("Mod islemi : "+mod(a,b));
                    break;
                case 7:
                    dikdortgen(a,b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz!");


            }


        }
        System.out.println(" Gule Gule !");
    }
}
