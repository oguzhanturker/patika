package ArrayOdevler;

import java.util.*;

public class ArraySiralama {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int boyut = k.nextInt();
        int dizi[] = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = k.nextInt();
            System.out.println(i + 1 + ". Elemanı : " + dizi[i]);
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama : " + Arrays.toString(dizi));
    }
}
