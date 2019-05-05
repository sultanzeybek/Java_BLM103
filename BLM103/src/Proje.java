/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alara
 */
import java.util.Scanner;

public class Proje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;

        while (a) {
            System.out.println("Yapılması istenen işlem için işlemin numarasını giriniz:\n"
                    + "1. boolean asalBuL(int a)\n"
                    + "2. int ebob(int a, int b, int c) \n"
                    + "3. int karekokBul(int a)\n"
                    + "4. boolean aralarındaAsal(int a, int b) \n"
                    + "5. int adetAsalBul(int a, int b) \n"
                    + "6. void palindramikMi(int a) \n"
                    + "7. int maxBinary(int a) \n"
                    + "-1. Çıkış");

            Scanner menu = new Scanner(System.in); //Klavyeden sayı girmemizi sağlar
            int menuDeger = menu.nextInt();

            switch (menuDeger) {
                case 1:
                    //AsalBulma
                    System.out.println("Bir Sayı Giriniz");

                    int sayıDeger = menu.nextInt();

                    System.out.print("Sayınız :");

                    System.out.println(asalBuL(sayıDeger));
                    break;

                case 2:
                    //ebob bulma
                    System.out.println("Ilk Sayıyı Giriniz:");

                    int sayı1Deger = menu.nextInt();

                    System.out.println("İkinci Sayı Giriniz:");

                    int sayı2Deger = menu.nextInt();

                    System.out.println("Üçüncü Sayı Giriniz:");

                    int sayı3Deger = menu.nextInt();

                    System.out.println(ebob(sayı1Deger, sayı2Deger, sayı3Deger));
                    break;

                case 3:
                    //karekokBulma

                    System.out.println("Karekökü istenilen sayıyı giriniz.:");

                    int sayıKarekok = menu.nextInt();

                    System.out.print("Girdiğiniz sayının karekökü:");

                    System.out.println(karekokBul(sayıKarekok));

                    break;
                case 4:
                    //aralarında asal bulma
                    System.out.println("İki sayı giriniz...:");

                    if (aralarındaAsal(menu.nextInt(), menu.nextInt())) {
                        System.out.println("Aralarında asaldır");
                    } else {
                        System.out.println("Aralarında asal değildir");
                    }
                    System.out.println();
                    break;
                case 5:

                    //asal adedi bulma
                    System.out.println("İki Sayı giriniz...:");

                    System.out.println(adetAsalbul(menu.nextInt(),
                            menu.nextInt()) + " adet asal sayı vardır");

                    break;
                case 6:
                    //palindramikMi
                    System.out.println("İşlem yapılacak sayıyı giriniz...:");
                    palindromikMi(menu.nextInt());
                    break;
                case 7:
                    //MaxBinary
                    System.out.println("İşlem yapılacak sayıyı giriniz...:");
                    maxBinary(menu.nextInt());
                    break;
                case -1:
                    System.out.println("çıkış yapıldı işlem sonlandırmıştır.");
                    a = false;
                    break;
                default:
                    System.out.println(" “hatalı giriş yapıldı lütfen menü "
                            + "numaralarından birini giriniz”");
                    break;
            }
        }

    }

    static boolean asalBuL(int a) {
        //en küçük asal sayı 2 dir 1 ve kendinden başka sayılara bölünmeyen sayılara asal sayı denir.
        //her sayı kendine bölündüğü için koşul kontrolüne gerek duyulamaz

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {

                return false;
            }
        }
        return true;
    }

    static int ebob(int a, int b, int c) {

        int sinir = a < b ? a : b;
        sinir = sinir < c ? sinir : c;

        for (int n = sinir; n >= 2; n--) {
            if ((a % n == 0) && (b % n == 0) && (c % n == 0)) {
                return n;
            }
        }

        return 1;
    }

    static int karekokBul(int a) {
        int root = 0;
        int square = root;
        while (square < a) {
            root++;
            square = root * root;
        }
        return root;
    }

    static boolean aralarındaAsal(int a, int b) {
        boolean aralarındaasal = false;
        if (ebob(a, b, b) == 1) {

            aralarındaasal = true;
        }
        return aralarındaasal;
    }

    static int adetAsalbul(int a, int b) {
        int adet = 0;
        int sayaç = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sayaç++;
                    }
                }
                if (sayaç == 1) {
                    adet++;
                }
                sayaç = 0;
            }
        }
        if (b > a) {
            for (int i = a; i <= b; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sayaç++;
                    }
                }
                if (sayaç == 1) {
                    adet++;
                }
                sayaç = 0;
            }
        } else {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    sayaç++;
                }
            }
            if (sayaç == 1) {
                adet++;
            }
        }
        return adet;
    }

    static boolean palindromikMi(int a) {
        boolean ret;
        int palindrom = a;
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan, deger = 0;
        for (int i = 0; i < length; i++) {

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom / 10;
        }

        if (deger == ilkdeger) {
            ret = true;
            System.out.println(ilkdeger + " Palindrom Sayidir.");
        } else {
            ret = false;
            System.out.println(ilkdeger + " Palindrom Sayi Degildir.");
        }
        return ret;
    }

    static int maxBinary(int a) {
        int k;
        int sayac = 0;
        int temp = 0;
        String q = "";
        Scanner scan = new Scanner(System.in);

        while (a > 0) {
            k = a % 2;
            q = k + q;
            a = a / 2;
        }

        for (int i = 0; i < q.length(); i++) {
            if (Integer.parseInt(q.charAt(i) + "") == 1) {
                sayac++;
            } else {
                temp = sayac;
                sayac = 0;
            }
        }
        System.out.println(q);
        System.out.println(temp);
        return temp;
    }

}
