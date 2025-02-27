import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = input.nextInt();

        int[][] matriks = new int[n][n];

        // Input elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        // Transpose Matriks
        int[][] hasilTranspose = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasilTranspose[j][i] = matriks[i][j];
            }
        }

        // Cetak Hasil Transpose Matriks
        System.out.println("\nHasil Transpose Matriks:");
        for (int[] baris : hasilTranspose) {
            for (int elemen : baris) {
                System.out.print(elemen + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
