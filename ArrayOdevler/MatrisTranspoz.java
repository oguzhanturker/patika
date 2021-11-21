package ArrayOdevler;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] dizi = {{2, 3, 4},
                {1, 5, 9}};
        int[][] transpoze = new int[dizi[0].length][dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                transpoze[j][i] = dizi[i][j];
            }
        }
        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[0].length; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }

    }
}
