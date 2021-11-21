package ArrayOdevler;
import java.util.Arrays;

public class ArrayFrekans {
    public static void main(String[] args) {
        int dizi[] = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(dizi);
        int sayac = 1;
        for (int i = 0; i < dizi.length - 1; i++) {
            if ((dizi[i] == dizi[i + 1])) { //Diziyi sıraladıktan sonra eğer bir sonraki elemana eşitse sayacı 1 artırıyoruz.
                sayac++;
                if (i == dizi.length - 2) { //Sondan bir önceki elemana gelince döngü bitip else'e giremediği için bu if bloğunu koydum.
                    System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
                }
            } else {
                System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
                sayac = 1;
                if (i == dizi.length - 2) { //son eleman bir öncekiyle farklıysa diye bu bloğu koydum.
                    System.out.println(dizi[i + 1] + " sayısı 1 kere tekrar edildi.");
                }

            }

        }

    }
}

