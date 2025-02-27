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

### **Kesimpulan:**
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

### **Deklarasi dan Inisialisasi Variabel**
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

### **Proses Pencarian dalam Array**
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

### **Menampilkan Hasil Pencarian**
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

### **Output Program**
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

### **Deklarasi dan Inisialisasi Array**
```java
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
```
Kode diatas membuat array `nilai` bertipe `int` yang berisi nilai-nilai siswa: `75, 80, 65, 90, 85, 70, 95, 88`.

---

### **Inisialisasi Variabel Statistik**
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

### **Proses Menghitung Statistik**
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

### **Menghitung Rata-Rata**
```java
        double rataRata = (double) total / nilai.length;
```
- `(double) total`: berfungsi melakukan **type casting** dari `int` ke `double` untuk memastikan hasil pembagian dalam bentuk desimal.
- `total / nilai.length`: berfungsi menghitung rata-rata dengan membagi total nilai dengan jumlah elemen dalam array (`nilai.length` bernilai 8).

---

### **Menampilkan Hasil Statistik**
```java
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + rataRata);
```
Kode diatas menampilkan nilai tertinggi, terendah, dan rata-rata ke konsol.

---

### **Output Program**
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

### **Deklarasi Kelas dan Metode Utama**
```java
public class OperasiMatriks {
```
kode diatas berfungsi mendefinisikan kelas publik bernama `OperasiMatriks`. Nama kelas harus sama dengan nama file (`OperasiMatriks.java`).

```java
    public static void main(String[] args) {
```
kode diatas berfungsi mendeklarasikan metode `main`, yang merupakan titik awal eksekusi program.

---

### **Inisialisasi Matriks A dan B**
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
kode diatas berfungsi membuat dua **matriks 2D** bertipe `int`, yaitu `matriksA` dan `matriksB`, dengan ukuran **2x3**:  

**Matriks A:**  
\[
\begin{bmatrix}
1 & 2 & 3 \\
4 & 5 & 6
\end{bmatrix}
\]

**Matriks B:**  
\[
\begin{bmatrix}
7 & 8 & 9 \\
10 & 11 & 12
\end{bmatrix}
\]

---

### **Menyiapkan Matriks Hasil Penjumlahan**
```java
        int[][] hasil = new int[2][3];
```
kode diatas berfungsi mendeklarasikan matriks `hasil` dengan ukuran **2x3** untuk menyimpan hasil penjumlahan matriks `A` dan `B`.

---

### **Penjumlahan Matriks**
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

### **Menampilkan Hasil Penjumlahan Matriks**
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

### **Output Program**
```
Hasil penjumlahan matriks:
8 10 12 
14 16 18 
```

---
