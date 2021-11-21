package ArrayOdevler;

import java.util.Arrays;

public class ArrayCiftTekrarlar {

    public static int showTekrarliCiftler (int arr[], int n){
        if (n == 0 || n == 1) {
            System.out.println("Tekrar eden sayı yok");
            return n;
        }
        int[] temp = new int[n];
        int i = 0,j = 0;

        for (i = 0; i < n - 2; i++) {
            if ((arr[i] == arr[i + 1])& (arr[i+1]!=arr[i+2])) {
                if (arr[i]%2==0)
                    temp[j++] = arr[i];
            }
        }
        if (arr[i]==arr[i+1])
            temp[j]=arr[i];
        int tekrarlilar[] = new int[j+1];
        for (i = 0; i < j+1; i++) {
            tekrarlilar[i] = temp[i];
        }
        System.out.println(Arrays.toString(tekrarlilar));
        return j;
    }
    public static void main(String[] args) {
        int[] list = {0, 0, 5, 0, 2, 3, 12, 71, 72, 72, 72};
        Arrays.sort(list);
        int length = list.length;
        length = showTekrarliCiftler(list, length);

    }
}
