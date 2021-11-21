package ArrayOdevler;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = k.nextInt();
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int kucuk = list[0]; //Girilen sayıdan küçük, en büyük sayı için ilk değer
        int buyuk = list[0]; //Girilen sayıdan büyük, en küçük sayı için ilk değer

        for (int i : list) {
            if (i < sayi & (sayi-i)<kucuk) {
                kucuk = i;
            }
            if (i > sayi & (i-sayi)<buyuk) {
                buyuk = i;
            }
        }
        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.println("Girilen sayı : "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyuk);

    }
}

