# Array 1-6

---

# Soal 1

---

**Menampilkan Semua Elemen Array**
```java
// for (int i = 0; i < number.length; i++) {
//     System.out.print(number[i] + " ");     
// }
```
**Output:**  
```
1 2 3 4 5 
```

**Penjelasan:**  
- `for (int i = 0; i < number.length; i++)`: kode ini berfungsi melakukan perulangan dari indeks `0` hingga `4` (panjang array adalah `5`).
- `System.out.print(number[i] + " ")`: kode ini berfungsi Mencetak setiap elemen array `number` diikuti spasi.

---

**Menampilkan Elemen dengan Pemisah Koma**
```java
// for (int i = 0; i < number.length; i++) {
//     System.out.print(number[i]);
//     if (i < 4) {
//         System.out.print(",");
//     }     
// }
```
**Output:**  
```
1,2,3,4,5
```

**Penjelasan:**  
- output kode program ini mencetak setiap elemen array tanpa spasi.
- `if (i < 4)`: kode ini berfungsi menambahkan koma (`,`) jika indeks belum mencapai elemen terakhir (`4`).

---

**Menampilkan Elemen pada Indeks Genap**
```java
// for (int i = 0; i < number.length; i++) {
//     if (i % 2 == 0) {
//         System.out.print(number[i]);
//         if (i < 4) {
//             System.out.print(",");
//         } 
//     }     
// }
```
**Output:**  
```
1,3,5
```

**Penjelasan:**  
- `if (i % 2 == 0)`: kode ini Hanya mencetak elemen pada indeks **genap** (`0, 2, 4`).
- Elemen pada indeks genap adalah: `number[0] = 1`, `number[2] = 3`, `number[4] = 5`.

---

**Menampilkan Elemen pada Indeks Genap secara Terbalik**
```java
// for (int i = 4; i > -1; i--) {
//     if (i % 2 == 0) {
//         System.out.print(number[i]); 
//         if (i > 1) {
//             System.out.print(",");
//         }
//     } 
// }
```
**Output:**  
```
5,3,1
```

**Penjelasan:**  
- **Perulangan Mundur:** Dimulai dari indeks `4` hingga `0`.
- `if (i % 2 == 0)`: kode ini berfungsi mencetak elemen pada indeks **genap** dalam urutan terbalik.
- Menambahkan koma jika indeks lebih besar dari `1` untuk menjaga format tampilan.

---

**Menampilkan Elemen pada Indeks Ganjil**
```java
// for (int i = 0; i < number.length; i++) {
//     if (i % 2 == 1) {
//         System.out.print(number[i]);  
//         if (i < 2) {
//             System.out.print(",");
//         } 
//     }     
// }
```
**Output:**  
```
2,4
```

**Penjelasan:**  
- `if (i % 2 == 1)`: kode ini berfungsi mencetak elemen pada indeks **ganjil** (`1, 3`).
- Elemen pada indeks ganjil adalah: `number[1] = 2`, `number[3] = 4`.

---

**Soal 6: Menampilkan Elemen Sesuai Pola Indeks**
```java
// int[] pola = {0, 0, 2, 1, 4}; 
// for (int i = 0; i < pola.length; i++) {
//     System.out.print(number[pola[i]]);
//     if (i < pola.length - 1) {
//         System.out.print(",");
//     }
// }
```
**Output:**  
```
1,1,3,2,5
```

**Penjelasan:**  
- Array `pola` berisi indeks yang harus ditampilkan: `[0, 0, 2, 1, 4]`.
- `number[0] = 1`, `number[2] = 3`, `number[1] = 2`, `number[4] = 5`.
- Mengikuti pola, hasilnya adalah: `1,1,3,2,5`.

---

# Latihan 1

```java
public class LatihanArray1 {
```
Pada baris ini mendefinisikan sebuah kelas publik bernama `LatihanArray1`. Nama kelas harus sama dengan nama file (`LatihanArray1.java`).

```java
    public static void main(String[] args) {
```
Pada baris ini mendeklarasikan metode `main`, titik awal eksekusi program. 
- `public`: Metode yang dapat diakses dari mana saja.
- `static`: Metode yang dapat dijalankan tanpa membuat objek dari kelas.
- `void`: Metode yang tidak mengembalikan nilai.
- `String[] args`: Parameter untuk menerima argumen baris perintah dalam bentuk array string.

```java
        int[] bilanganGenap = new int[10];
```
pada baris ini membuat array `bilanganGenap` dengan tipe data `int` yang memiliki panjang 10. (Array ini akan menyimpan 10 bilangan bulat).

```java
        int jumlah = 0;
```
pada baris ini mendeklarasikan variabel `jumlah` dengan nilai awal 0. Variabel ini akan digunakan untuk menyimpan total semua elemen dalam array.

```java
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }
```
pada baris ini mengisi array dengan bilangan genap:
- `for (int i = 0; i < bilanganGenap.length; i++)`: kode ini berfungsi sebagai perulangan dimulai dari `i = 0` hingga `i < 10` (karena panjang array adalah 10).
- `bilanganGenap[i] = (i + 1) * 2`: kode ini berfungsi mengisi setiap elemen array dengan bilangan genap. `(i + 1)` memberikan nilai mulai dari 1 hingga 10, kemudian dikali 2 untuk menghasilkan bilangan genap (2, 4, 6, ... 20).

```java
        System.out.println("Isi array:");
```
pada baris ini mencetak teks `"Isi array:"` ke konsol sebagai informasi sebelum menampilkan isi array.

```java
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }
```
pada baris ini menampilkan isi array dan menghitung jumlah elemen:
- `for (int bilangan : bilanganGenap)`: kode ini berfungsi menggunakan perulangan **for-each** untuk mengakses setiap elemen dalam array `bilanganGenap`.
- `System.out.print(bilangan + " ")`: kode ini berfungsi mencetak setiap elemen array diikuti dengan spasi, tetap dalam satu baris.
- `jumlah += bilangan`: kode ini berfungsi menambahkan setiap elemen array ke variabel `jumlah`.

```java
        System.out.println("\\nJumlah semua elemen: " + jumlah);
```
pada baris ini mencetak total semua elemen array. 

**Kesimpulan:**
program diatas akan menghasilkan output seperti berikut:
```
Isi array:
2 4 6 8 10 12 14 16 18 20 
Jumlah semua elemen: 110
```

---

# Latihan 2


```java
public class PencarianArray {
```
Kode diatas berfungsi mendefinisikan kelas publik bernama `PencarianArray`. Nama kelas harus sama dengan nama file (`PencarianArray.java`).

```java
    public static void main(String[] args) {
```
Kode diatas berfungsi mendeklarasikan metode `main`, yang merupakan titik awal eksekusi program.

---

**Deklarasi dan Inisialisasi Variabel**
```java
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
```
Kode diatas berfungsi membuat array `nilai` bertipe `int` yang berisi elemen-elemen bilangan bulat: `75, 80, 65, 90, 85, 70, 95, 88`.

```java
        int cari = 90;
```
Kode diatas berfungsi mendeklarasikan variabel `cari` dengan nilai `90`, yaitu nilai yang akan dicari dalam array.

```java
        boolean ketemu = false;
```
Kode diatas berfungsi mendeklarasikan variabel boolean `ketemu` dengan nilai awal `false`. Variabel ini akan berubah menjadi `true` jika nilai yang dicari ditemukan dalam array.

```java
        int indeks = -1;
```
Kode diatas berfungsi mendeklarasikan variabel `indeks` dengan nilai awal `-1`. Jika nilai yang dicari ditemukan, `indeks` akan diubah menjadi posisi (indeks) elemen tersebut dalam array.

---

**Proses Pencarian dalam Array**
```java
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
            }
        }
```
Kode diatas berfungsi melakukan pencarian nilai dalam array menggunakan perulangan:
- `for (int i = 0; i < nilai.length; i++)`: berfungsi sebagai melakukan iterasi dari `i = 0` hingga `i < panjang array` (`nilai.length` bernilai 8).
- `if (nilai[i] == cari)`: berfungsi sebagai mengecek apakah elemen array pada indeks `i` sama dengan nilai yang dicari (`90`).
- `ketemu = true;`: Jika nilai ditemukan, variabel `ketemu` diubah menjadi `true`.
- `indeks = i;`: Menyimpan indeks tempat nilai ditemukan.
- `break;`: berfungsi sebagai menghentikan perulangan setelah nilai ditemukan untuk meningkatkan efisiensi.

---

**Menampilkan Hasil Pencarian**
```java
        if (ketemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
```
Kode diatas menampilkan hasil berdasarkan kondisi:
- Jika `ketemu` bernilai `true`, maka akan mencetak:  
  ```
  Nilai 90 ditemukan pada indeks 3
  ```
- Jika `ketemu` tetap `false`, maka akan mencetak:  
  ```
  Nilai 90 tidak ditemukan
  ```

---

**Output Program**
Karena nilai `90` terdapat dalam array pada indeks `3`, output yang dihasilkan adalah:
```
Nilai 90 ditemukan pada indeks 3
```

---

# Latihan 3


```java
public class StatistikArray {
```
Kode diatas mendefinisikan kelas publik bernama `StatistikArray`. Nama kelas harus sama dengan nama file (`StatistikArray.java`).

```java
    public static void main(String[] args) {
```
Kode diatas mendeklarasikan metode `main`, yang merupakan titik awal eksekusi program.

---

**Deklarasi dan Inisialisasi Array**
```java
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
```
Kode diatas membuat array `nilai` bertipe `int` yang berisi nilai-nilai siswa: `75, 80, 65, 90, 85, 70, 95, 88`.

---

**Inisialisasi Variabel Statistik**
```java
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = nilai[0];
```
Kode diatas berfungsi meng inisialisasi variabel:
- `tertinggi`: berfungsi menyimpan nilai tertinggi, diinisialisasi dengan elemen pertama array (`75`).
- `terendah`: berfungsi menyimpan nilai terendah, juga diinisialisasi dengan elemen pertama array (`75`).
- `total`: berfungsi menyimpan jumlah total semua nilai, dimulai dengan nilai elemen pertama (`75`).

---

**Proses Menghitung Statistik**
```java
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
            total += nilai[i];
        }
```
Kode diatas menggunakan perulangan untuk menghitung nilai tertinggi, terendah, dan total nilai:
- `for (int i = 1; i < nilai.length; i++)`: Melakukan iterasi dimulai dari indeks `1` hingga `nilai.length - 1` (7). Mulai dari indeks `1` karena elemen pertama (`indeks 0`) sudah digunakan untuk inisialisasi.
- `if (nilai[i] > tertinggi)`: berfungsi Jika nilai saat ini lebih besar dari `tertinggi`, perbarui `tertinggi` dengan nilai tersebut.
- `if (nilai[i] < terendah)`: berfungsi jika nilai saat ini lebih kecil dari `terendah`, perbarui `terendah` dengan nilai tersebut.
- `total += nilai[i]`: berfungsi menambahkan nilai saat ini ke `total`.

---

**Menghitung Rata-Rata**
```java
        double rataRata = (double) total / nilai.length;
```
- `(double) total`: berfungsi melakukan **type casting** dari `int` ke `double` untuk memastikan hasil pembagian dalam bentuk desimal.
- `total / nilai.length`: berfungsi menghitung rata-rata dengan membagi total nilai dengan jumlah elemen dalam array (`nilai.length` bernilai 8).

---

**Menampilkan Hasil Statistik**
```java
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + rataRata);
```
Kode diatas menampilkan nilai tertinggi, terendah, dan rata-rata ke konsol.

---

**Output Program**
Berdasarkan data dalam array:
- **Nilai Tertinggi:** 95
- **Nilai Terendah:** 65
- **Rata-Rata:** 
\[
\frac{75 + 80 + 65 + 90 + 85 + 70 + 95 + 88}{8} = 81.0
\]

Maka, output program adalah:
```
Nilai tertinggi: 95
Nilai terendah: 65
Rata-rata: 81.0
```

---


# Latihan 4


---

**Deklarasi Kelas dan Metode Utama**
```java
public class OperasiMatriks {
```
kode diatas berfungsi mendefinisikan kelas publik bernama `OperasiMatriks`. Nama kelas harus sama dengan nama file (`OperasiMatriks.java`).

```java
    public static void main(String[] args) {
```
kode diatas berfungsi mendeklarasikan metode `main`, yang merupakan titik awal eksekusi program.

---

**Inisialisasi Matriks A dan B**
```java
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
        };
```
kode diatas berfungsi membuat dua **matriks 2D** bertipe `int`, yaitu `matriksA` dan `matriksB`, 

---

**Menyiapkan Matriks Hasil Penjumlahan**
```java
        int[][] hasil = new int[2][3];
```
kode diatas berfungsi mendeklarasikan matriks `hasil` dengan ukuran **2x3** untuk menyimpan hasil penjumlahan matriks `A` dan `B`.

---

**Penjumlahan Matriks**
```java
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
```
kode diatas berfungsi melakukan penjumlahan elemen-elemen matriks:  
- **Perulangan Baris:**  
  `for (int i = 0; i < matriksA.length; i++)`  
  `matriksA.length` memberikan jumlah baris (2 baris).  

- **Perulangan Kolom:**  
  `for (int j = 0; j < matriksA[0].length; j++)`  
  `matriksA[0].length` memberikan jumlah kolom dalam baris pertama (3 kolom).  

- **Proses Penjumlahan:**  
  `hasil[i][j] = matriksA[i][j] + matriksB[i][j];`  
  Setiap elemen dari `matriksA` dijumlahkan dengan elemen pada posisi yang sama di `matriksB`, dan hasilnya disimpan di `hasil[i][j]`.  

**Contoh:**  
Elemen pada `(0,0)` adalah: `1 + 7 = 8`  
Elemen pada `(1,2)` adalah: `6 + 12 = 18`  

---

**Menampilkan Hasil Penjumlahan Matriks**
```java
        System.out.println("Hasil penjumlahan matriks:");
```
kode diatas berfungsi mencetak judul untuk hasil penjumlahan matriks.

```java
        for (int[] baris : hasil) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
```
kode diatas berfungsi menampilkan isi matriks `hasil` dalam bentuk baris dan kolom:  

- **For-each Loop (Baris):**  
  `for (int[] baris : hasil)`  
kode diatas berfungsi mengambil setiap baris dalam matriks `hasil`.  

- **For-each Loop (Nilai dalam Baris):**  
  `for (int nilai : baris)`  
kode diatas berfungsi mengambil setiap nilai dalam baris tersebut dan mencetaknya di satu baris yang sama.  

- **Baris Baru:**  
  `System.out.println()`  
kode diatas berfungsi membuat baris baru setelah mencetak seluruh nilai dalam satu baris matriks.

---

**Output Program**
```
Hasil penjumlahan matriks:
8 10 12 
14 16 18 
```

---

# Studi Kasus 1

---

**Deklarasi Kelas dan Metode Utama**
```java
public class studikasus1 {
    public static void main(String[] args) {
```
- **`public class studikasus1`**: Mendefinisikan kelas utama dengan nama **`studikasus1`**.
- **`public static void main(String[] args)`**: Metode utama untuk menjalankan program.

---

**Deklarasi dan Inisialisasi Data**

**Data Nama Siswa**
```java
String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
```
- Membuat **array** bertipe **String** untuk menyimpan **5 nama siswa**.

**Data Nilai Siswa**
```java
int[][] nilai = {
    {80, 85, 90}, // Nilai Ani
    {75, 70, 85}, // Nilai Budi
    {85, 80, 88}, // Nilai Cici
    {90, 85, 95}, // Nilai Dodi
    {70, 75, 80}  // Nilai Edi
};
```
- Membuat **array 2D** untuk menyimpan **nilai siswa** dalam **3 mata pelajaran**.
- **Baris** mewakili siswa dan **kolom** mewakili mata pelajaran.

**Data Nama Mata Pelajaran**
```java
String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
```
- Membuat **array** untuk menyimpan **nama mata pelajaran**.

---

**Menghitung Rata-Rata Nilai per Siswa**

```java
System.out.println("Rata-rata nilai per siswa:");
for (int i = 0; i < nilai.length; i++) {
    double total = 0;
    for (int n : nilai[i]) {
        total += n;
    }
    double rataSiswa = total / nilai[i].length;
    System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa);
}
```

**Penjelasan:**
**Mencetak Judul:**
   ```java
   System.out.println("Rata-rata nilai per siswa:");
   ```
   Menampilkan teks **"Rata-rata nilai per siswa:"** di konsol.

**Perulangan untuk Setiap Siswa:**
   ```java
   for (int i = 0; i < nilai.length; i++) {
   ```
   - **`i`** mewakili **indeks siswa**.
   - **`nilai.length`** memberikan jumlah total siswa (**5 siswa**).

**Menghitung Total Nilai Siswa:**
   ```java
   double total = 0;
   for (int n : nilai[i]) {
       total += n;
   }
   ```
   - Menggunakan **for-each** untuk menjumlahkan nilai **setiap mata pelajaran** pada baris **`i`**.

**Menghitung Rata-Rata Nilai Siswa:**
   ```java
   double rataSiswa = total / nilai[i].length;
   ```
   - **Rumus:** Total nilai dibagi jumlah mata pelajaran (**3 mata pelajaran**).

**Menampilkan Rata-Rata per Siswa:**
   ```java
   System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa);
   ```
   - **`%s`** untuk **nama siswa**.
   - **`%.2f`** untuk **menampilkan rata-rata** dengan **2 digit desimal**.

---

**Menghitung Rata-Rata Nilai per Mata Pelajaran**

```java
System.out.println("\nRata-rata nilai per mata pelajaran:");
for (int j = 0; j < nilai[0].length; j++) {
    double total = 0;
    for (int i = 0; i < nilai.length; i++) {
        total += nilai[i][j];
    }
    double rataMapel = total / nilai.length;
    System.out.printf("%s: %.2f\n", mapel[j], rataMapel);
}
```

**Penjelasan:**

**Mencetak Judul:**
   ```java
   System.out.println("\nRata-rata nilai per mata pelajaran:");
   ```
   Menampilkan teks **"Rata-rata nilai per mata pelajaran:"**.

**Perulangan untuk Setiap Mata Pelajaran:**
   ```java
   for (int j = 0; j < nilai[0].length; j++) {
   ```
   - **`j`** mewakili **indeks mata pelajaran**.
   - **`nilai[0].length`** memberikan jumlah mata pelajaran (**3 pelajaran**).

**Menghitung Total Nilai untuk Setiap Mata Pelajaran:**
   ```java
   double total = 0;
   for (int i = 0; i < nilai.length; i++) {
       total += nilai[i][j];
   }
   ```
   - Menggunakan **perulangan bersarang** untuk menjumlahkan nilai **semua siswa** pada kolom **`j`**.

**Menghitung Rata-Rata Mata Pelajaran:**
   ```java
   double rataMapel = total / nilai.length;
   ```
   - **Rumus:** Total nilai dibagi jumlah siswa (**5 siswa**).

**Menampilkan Rata-Rata per Mata Pelajaran:**
   ```java
   System.out.printf("%s: %.2f\n", mapel[j], rataMapel);
   ```

---

**Output Program**

```text
Rata-rata nilai per siswa:
Ani: 85.00
Budi: 76.67
Cici: 84.33
Dodi: 90.00
Edi: 75.00

Rata-rata nilai per mata pelajaran:
Matematika: 80.00
Bahasa Inggris: 79.00
IPA: 87.60
```

---

# Studi Kasus 2

---

---

**Deklarasi Kelas dan Metode Utama**
```java
public class TicTacToe {
    public static void main(String[] args) {
```
- **`public class TicTacToe`**: Membuat kelas utama dengan nama **`TicTacToe`**.
- **`public static void main(String[] args)`**: Metode utama yang dieksekusi saat program dijalankan.

---

**Membuat Papan TicTacToe**

```java
char[][] papan = new char[3][3];
```
- **`char[][] papan`**: Membuat **array 2 dimensi** dengan **3 baris** dan **3 kolom** bertipe **`char`** untuk merepresentasikan **papan permainan**.
- **Ukuran `[3][3]`** menunjukkan bahwa papan berbentuk **3x3**, sesuai dengan aturan permainan **TicTacToe**.

---

**Inisialisasi Papan dengan Karakter Kosong ('-')**

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        papan[i][j] = '-';
    }
}
```

### **Penjelasan:**

**Looping Baris:**
   ```java
   for (int i = 0; i < 3; i++)
   ```
   - **`i`** digunakan untuk **mengakses baris** dalam array.
   - **`< 3`** karena **array** memiliki **3 baris** (**indeks 0, 1, 2**).

**Looping Kolom:**
   ```java
   for (int j = 0; j < 3; j++)
   ```
   - **`j`** digunakan untuk **mengakses kolom** dalam setiap baris.
   - **`< 3`** karena **array** memiliki **3 kolom** (**indeks 0, 1, 2**).

**Inisialisasi Elemen Papan:**
   ```java
   papan[i][j] = '-';
   ```
   - Setiap elemen pada **papan** diisi dengan **karakter '-'** sebagai penanda **kotak kosong**.

---

**simulasi Beberapa Langkah Permainan**

```java
papan[0][0] = 'X';
papan[1][1] = 'O';
papan[2][2] = 'X';
```

**Penjelasan:**

- **`papan[0][0] = 'X'`**: Menempatkan **'X'** pada **baris 0, kolom 0**.
- **`papan[1][1] = 'O'`**: Menempatkan **'O'** pada **baris 1, kolom 1**.
- **`papan[2][2] = 'X'`**: Menempatkan **'X'** pada **baris 2, kolom 2**.

---

**Menampilkan Status Papan**

```java
System.out.println("Status Papan:");
tampilkanPapan(papan);
```

**Penjelasan:**
- **`System.out.println`** menampilkan teks **"Status Papan:"**.
- Memanggil metode **`tampilkanPapan`** untuk **menampilkan kondisi papan** di konsol.

---

**Metode tampilkanPapan()**

```java
public static void tampilkanPapan(char[][] papan) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(papan[i][j] + " ");
        }
        System.out.println();
    }
}
```

**Penjelasan:**
**Deklarasi Metode:**
   ```java
   public static void tampilkanPapan(char[][] papan)
   ```
   - Membuat metode **`tampilkanPapan`** yang menerima **array 2D** (**papan permainan**) sebagai **parameter**.

**Looping Baris dan Kolom:**
   ```java
   for (int i = 0; i < 3; i++) {
       for (int j = 0; j < 3; j++) {
   ```
   - **Dua perulangan** untuk **mengakses semua elemen array**.

**Menampilkan Elemen Papan:**
   ```java
   System.out.print(papan[i][j] + " ");
   ```
   - Menampilkan **setiap elemen papan** dengan **spasi** sebagai **pemisah** antar **kolom**.

**Ganti Baris Setelah Setiap Baris Papan Ditampilkan:**
   ```java
   System.out.println();
   ```
   - Mengganti **baris di konsol** setelah setiap **baris papan selesai ditampilkan**.

---

## **7. Output Program**

```text
Status Papan:
X - - 
- O - 
- - X 
```

---

# Tugas 3

# Soal 1

---

**Import Library Scanner**
```java
import java.util.Scanner;
```
- **`import java.util.Scanner`**: Mengimpor **kelas Scanner** untuk **membaca input** dari **pengguna** melalui **konsol**.

---

**Deklarasi Kelas dan Metode Utama**
```java
public class PerkalianMatriks {
    public static void main(String[] args) {
```
- **`public class PerkalianMatriks`**: Membuat **kelas utama** dengan nama **`PerkalianMatriks`**.
- **`public static void main(String[] args)`**: **Metode utama** yang akan **dieksekusi** saat **program dijalankan**.

---

**Membuat Objek Scanner**
```java
Scanner input = new Scanner(System.in);
```
- Membuat objek **`input`** dari **kelas Scanner** untuk **menerima input** dari **konsol**.

---

**Input Ukuran Matriks**
```java
System.out.print("Masukkan ukuran matriks (n x n): ");
int n = input.nextInt();
```
- **`System.out.print`**: Menampilkan teks untuk **meminta input ukuran matriks** (**n x n**).
- **`int n = input.nextInt()`**: Membaca **input bilangan bulat** (**ukuran matriks**) dan menyimpannya ke **variabel `n`**.

---

**Deklarasi Matriks A dan B**
```java
int[][] matriksA = new int[n][n];
int[][] matriksB = new int[n][n];
```
- Membuat **dua array 2D** (**matriks A** dan **matriks B**) dengan **ukuran `n x n`**.
- **`int[n][n]`** menunjukkan **matriks persegi** dengan **n baris** dan **n kolom**.

---

**Input Elemen Matriks A**
```java
System.out.println("Masukkan elemen matriks A:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matriksA[i][j] = input.nextInt();
    }
}
```

**Penjelasan:**

- **`System.out.println`**: Menampilkan teks **"Masukkan elemen matriks A:"**.
- **Dua perulangan bersarang (nested loop)** digunakan untuk **mengisi elemen matriks A**:
    - **Baris (`i`)**: Diulang **mulai 0 hingga n-1**.
    - **Kolom (`j`)**: Diulang **mulai 0 hingga n-1**.
    - **`matriksA[i][j] = input.nextInt()`**: Membaca **input elemen** dari **pengguna** dan **menyimpannya** pada **posisi (i,j)** di **matriks A**.

---

**Input Elemen Matriks B**
```java
System.out.println("Masukkan elemen matriks B:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matriksB[i][j] = input.nextInt();
    }
}
```
- Prosesnya **sama** dengan **input matriks A**, tetapi ini untuk **matriks B**.

---

**Perkalian Matriks**
```java
int[][] hasilKali = new int[n][n];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
        }
    }
}
```

**Penjelasan:**

1. **Deklarasi Matriks Hasil:**
```java
int[][] hasilKali = new int[n][n];
```
- Membuat **array 2D** untuk **menyimpan hasil perkalian matriks**.

**Proses Perkalian Matriks:**
```java
for (int i = 0; i < n; i++) {          // Looping baris matriksA
    for (int j = 0; j < n; j++) {      // Looping kolom matriksB
        for (int k = 0; k < n; k++) {  // Looping elemen untuk perkalian
            hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
        }
    }
}
```

- **Tiga perulangan bersarang (nested loop)** untuk **menghitung elemen matriks hasil**:
    - **`i`**: Baris **matriks A**.
    - **`j`**: Kolom **matriks B**.
    - **`k`**: Indeks untuk **mengalikan elemen** pada **baris matriks A** dan **kolom matriks B**.

- **Operasi Perkalian Matriks:**
```java
hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
```
- Mengalikan **elemen baris `i` pada matriks A** dengan **elemen kolom `j` pada matriks B**, kemudian **menjumlahkannya** ke **elemen (i,j) pada matriks hasil**.

---

**Menampilkan Hasil Perkalian Matriks**
```java
System.out.println("\nHasil Perkalian Matriks A * B:");
for (int[] baris : hasilKali) {
    for (int elemen : baris) {
        System.out.print(elemen + "\t");
    }
    System.out.println();
}
```

**Penjelasan:**

**Menampilkan Judul:**
```java
System.out.println("\nHasil Perkalian Matriks A * B:");
```
- Memberikan **judul output** untuk **hasil perkalian matriks**.

**Menampilkan Matriks Hasil:**
```java
for (int[] baris : hasilKali) {
    for (int elemen : baris) {
        System.out.print(elemen + "\t");
    }
    System.out.println();
}
```
- Menggunakan **for-each loop** untuk **menampilkan setiap elemen matriks**.
- **`\t`** digunakan untuk memberikan **jarak/tab** antar **elemen dalam baris**.
- **`System.out.println()`** digunakan untuk **ganti baris** setelah **menampilkan satu baris matriks**.

---

**Menutup Scanner**
```java
input.close();
```
- Menutup **objek Scanner** untuk **menghindari kebocoran memori**.

---

**Contoh Input dan Output:**

**Input:**
```text
Masukkan ukuran matriks (n x n): 2
Masukkan elemen matriks A:
1 2
3 4
Masukkan elemen matriks B:
5 6
7 8
```

**Output:**
```text
Hasil Perkalian Matriks A * B:
19	22	
43	50
```

---

# Soal 2

Berikut ini penjelasan kode program **Transpose Matriks** dalam bahasa **Java** tanpa animasi:

---

**Mengimpor Library Scanner**
```java
import java.util.Scanner;
```
- **`import java.util.Scanner`**: Mengimpor **kelas Scanner** untuk **membaca input** dari **pengguna** melalui **konsol**.

---

**Deklarasi Kelas dan Metode Utama**
```java
public class TransposeMatriks {
    public static void main(String[] args) {
```
- **`public class TransposeMatriks`**: Membuat **kelas utama** dengan nama **`TransposeMatriks`**.
- **`public static void main(String[] args)`**: **Metode utama** yang akan **dieksekusi** saat **program dijalankan**.

---

**Membuat Objek Scanner**

```java
Scanner input = new Scanner(System.in);
```
- Membuat objek **`input`** dari **kelas Scanner** untuk **menerima input** dari **konsol**.

---

**Input Ukuran Matriks**
```java
System.out.print("Masukkan ukuran matriks (n x n): ");
int n = input.nextInt();
```
- **`System.out.print`**: Menampilkan teks untuk **meminta input ukuran matriks** (**n x n**).
- **`int n = input.nextInt()`**: Membaca **input bilangan bulat** (**ukuran matriks**) dan menyimpannya ke **variabel `n`**.

---

**Deklarasi Matriks**
```java
int[][] matriks = new int[n][n];
```
- Membuat **array 2D** (**matriks**) dengan **ukuran `n x n`**.
- **`int[n][n]`** menunjukkan **matriks persegi** dengan **n baris** dan **n kolom**.

---

**Input Elemen Matriks**
```java
System.out.println("Masukkan elemen matriks:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matriks[i][j] = input.nextInt();
    }
}
```

**Penjelasan:**
- **`System.out.println`**: Menampilkan teks **"Masukkan elemen matriks:"**.
- **Dua perulangan bersarang (nested loop)** digunakan untuk **mengisi elemen matriks**:
    - **Baris (`i`)**: Diulang **mulai 0 hingga n-1**.
    - **Kolom (`j`)**: Diulang **mulai 0 hingga n-1**.
    - **`matriks[i][j] = input.nextInt()`**: Membaca **input elemen** dari **pengguna** dan **menyimpannya** pada **posisi (i,j)** di **matriks**.

---

**Transpose Matriks**
```java
int[][] hasilTranspose = new int[n][n];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        hasilTranspose[j][i] = matriks[i][j];
    }
}
```

**Penjelasan:**
1. **Deklarasi Matriks Hasil Transpose:**
```java
int[][] hasilTranspose = new int[n][n];
```
- Membuat **array 2D** untuk **menyimpan hasil transpose matriks**.

**Proses Transpose Matriks:**
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        hasilTranspose[j][i] = matriks[i][j];
    }
}
```
- **Dua perulangan bersarang** untuk **membalik baris menjadi kolom dan sebaliknya**:
    - **Baris (`i`)** dan **Kolom (`j`)** di **matriks asli** ditukar posisinya di **matriks hasil**.
    - **`hasilTranspose[j][i] = matriks[i][j]`** artinya **elemen baris ke-i dan kolom ke-j** pada **matriks asli** akan **berada pada baris ke-j dan kolom ke-i** di **matriks hasil**.

---

**Menampilkan Hasil Transpose Matriks**
```java
System.out.println("\nHasil Transpose Matriks:");
for (int[] baris : hasilTranspose) {
    for (int elemen : baris) {
        System.out.print(elemen + "\t");
    }
    System.out.println();
}
```

**Penjelasan:**

**Menampilkan Judul:**
```java
System.out.println("\nHasil Transpose Matriks:");
```
- Memberikan **judul output** untuk **hasil transpose matriks**.

**Menampilkan Matriks Hasil:**
```java
for (int[] baris : hasilTranspose) {
    for (int elemen : baris) {
        System.out.print(elemen + "\t");
    }
    System.out.println();
}
```
- Menggunakan **for-each loop** untuk **menampilkan setiap elemen matriks**.
- **`\t`** digunakan untuk memberikan **jarak/tab** antar **elemen dalam baris**.
- **`System.out.println()`** digunakan untuk **ganti baris** setelah **menampilkan satu baris matriks**.

---

**Menutup Scanner**
```java
input.close();
```
- Menutup **objek Scanner** untuk **menghindari kebocoran memori**.

---

**Contoh Input dan Output:**

**Input:**
```text
Masukkan ukuran matriks (n x n): 3
Masukkan elemen matriks:
1 2 3
4 5 6
7 8 9
```

**Output:**
```text
Hasil Transpose Matriks:
1	4	7	
2	5	8	
3	6	9
```

**Proses Transpose Manual:**
```text
Sebelum Transpose:              Setelah Transpose:
[1 2 3]                         [1 4 7]
[4 5 6]    Transpose --->       [2 5 8]
[7 8 9]                         [3 6 9]
```

---

# Soal 3

---

**Mengimpor Library Scanner**
```java
import java.util.Scanner;
```
- **`import java.util.Scanner`**: Mengimpor **kelas Scanner** untuk **membaca input** dari **pengguna** melalui **konsol**.

---

 **Deklarasi Kelas dan Metode Utama**
```java
public class DiagonalMatriks {
    public static void main(String[] args) {
```
- **`public class DiagonalMatriks`**: Membuat **kelas utama** dengan nama **`DiagonalMatriks`**.
- **`public static void main(String[] args)`**: **Metode utama** yang akan **dieksekusi** saat **program dijalankan**.

---

**Membuat Objek Scanner**
```java
Scanner input = new Scanner(System.in);
```
- Membuat objek **`input`** dari **kelas Scanner** untuk **menerima input** dari **konsol**.

---

**Input Ukuran Matriks**
```java
System.out.print("Masukkan ukuran matriks (n x n): ");
int n = input.nextInt();
```
- **`System.out.print`**: Menampilkan teks untuk **meminta input ukuran matriks** (**n x n**).
- **`int n = input.nextInt()`**: Membaca **input bilangan bulat** (**ukuran matriks**) dan menyimpannya ke **variabel `n`**.

---

**Deklarasi Matriks**
```java
int[][] matriks = new int[n][n];
```
- Membuat **array 2D** (**matriks**) dengan **ukuran `n x n`**.
- **`int[n][n]`** menunjukkan **matriks persegi** dengan **n baris** dan **n kolom**.

---

**Input Elemen Matriks**
```java
System.out.println("Masukkan elemen matriks:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        matriks[i][j] = input.nextInt();
    }
}
```

**Penjelasan:**
- **`System.out.println`**: Menampilkan teks **"Masukkan elemen matriks:"**.
- **Dua perulangan bersarang (nested loop)** digunakan untuk **mengisi elemen matriks**:
    - **Baris (`i`)**: Diulang **mulai 0 hingga n-1**.
    - **Kolom (`j`)**: Diulang **mulai 0 hingga n-1**.
    - **`matriks[i][j] = input.nextInt()`**: Membaca **input elemen** dari **pengguna** dan **menyimpannya** pada **posisi (i,j)** di **matriks**.

---

**Menampilkan Diagonal Utama Matriks**
```java
System.out.println("\nDiagonal Utama Matriks:");
for (int i = 0; i < n; i++) {
    System.out.print(matriks[i][i] + " ");
}
System.out.println();
```

**Penjelasan:**
- **Diagonal Utama** terdiri dari **elemen** yang **baris dan kolomnya sama** (**i = j**).
- Menggunakan **loop tunggal** untuk **menampilkan elemen** dari **matriks[i][i]**:
    - **Indeks (0,0), (1,1), (2,2), ... (n-1,n-1)**.
    - **Contoh**: Untuk matriks **3x3**, elemen diagonal utama adalah **matriks[0][0], matriks[1][1], matriks[2][2]**.

---

**Menampilkan Diagonal Samping Matriks**
```java
System.out.println("\nDiagonal Samping Matriks:");
for (int i = 0; i < n; i++) {
    System.out.print(matriks[i][n - 1 - i] + " ");
}
System.out.println();
```

**Penjelasan:**
- **Diagonal Samping** terdiri dari **elemen** yang **barisnya `i`** dan **kolomnya `(n-1-i)`**:
    - **Indeks (0,n-1), (1,n-2), (2,n-3), ... (n-1,0)**.
    - **Contoh**: Untuk matriks **3x3**, elemen diagonal samping adalah **matriks[0][2], matriks[1][1], matriks[2][0]**.

---

**Menutup Scanner**
```java
input.close();
```
- Menutup **objek Scanner** untuk **menghindari kebocoran memori**.

---

**Output:**
```text
Diagonal Utama Matriks:
1 5 9 

Diagonal Samping Matriks:
3 5 7
```
---
