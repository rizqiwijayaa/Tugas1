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

#Latihan 3
