# Tugas1

#Latihan 1

```java
public class LatihanArray1 {
```
Mendefinisikan sebuah kelas publik bernama `LatihanArray1`. Nama kelas harus sama dengan nama file (`LatihanArray1.java`).

```java
    public static void main(String[] args) {
```
Mendeklarasikan metode `main`, titik awal eksekusi program. 
- `public`: Metode dapat diakses dari mana saja.
- `static`: Metode dapat dijalankan tanpa membuat objek dari kelas.
- `void`: Metode tidak mengembalikan nilai.
- `String[] args`: Parameter untuk menerima argumen baris perintah dalam bentuk array string.

```java
        int[] bilanganGenap = new int[10];
```
Membuat array `bilanganGenap` dengan tipe data `int` yang memiliki panjang 10. Array ini akan menyimpan 10 bilangan bulat.

```java
        int jumlah = 0;
```
Mendeklarasikan variabel `jumlah` dengan nilai awal 0. Variabel ini akan digunakan untuk menyimpan total semua elemen dalam array.

```java
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }
```
Mengisi array dengan bilangan genap:
- `for (int i = 0; i < bilanganGenap.length; i++)`: Perulangan dimulai dari `i = 0` hingga `i < 10` (karena panjang array adalah 10).
- `bilanganGenap[i] = (i + 1) * 2`: Mengisi setiap elemen array dengan bilangan genap. `(i + 1)` memberikan nilai mulai dari 1 hingga 10, kemudian dikali 2 untuk menghasilkan bilangan genap (2, 4, 6, ... 20).

```java
        System.out.println("Isi array:");
```
Mencetak teks `"Isi array:"` ke konsol sebagai informasi sebelum menampilkan isi array.

```java
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }
```
Menampilkan isi array dan menghitung jumlah elemen:
- `for (int bilangan : bilanganGenap)`: Menggunakan perulangan **for-each** untuk mengakses setiap elemen dalam array `bilanganGenap`.
- `System.out.print(bilangan + " ")`: Mencetak setiap elemen array diikuti dengan spasi, tetap dalam satu baris.
- `jumlah += bilangan`: Menambahkan setiap elemen array ke variabel `jumlah`.

```java
        System.out.println("\\nJumlah semua elemen: " + jumlah);
```
Mencetak total semua elemen array. 
**Catatan:** Ada kesalahan pada kode ini, yaitu penggunaan `\\n`. Seharusnya hanya menggunakan `\n` (satu backslash) untuk membuat baris baru. Seharusnya menjadi:
```java
        System.out.println("\nJumlah semua elemen: " + jumlah);
```

### **Kesimpulan:**
Kode ini akan menghasilkan output seperti berikut:
```
Isi array:
2 4 6 8 10 12 14 16 18 20 
Jumlah semua elemen: 110
```

Jika ada yang ingin ditambahkan atau diperjelas, beri tahu ya! 😊
