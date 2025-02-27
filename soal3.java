import java.util.Scanner;

public class soal3 {
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

        // Menampilkan Diagonal Utama
        System.out.println("\nDiagonal Utama Matriks:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriks[i][i] + " ");
        }
        System.out.println();

        // Menampilkan Diagonal Samping
        System.out.println("\nDiagonal Samping Matriks:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriks[i][n - 1 - i] + " ");
        }
        System.out.println();

        input.close();
    }
}
