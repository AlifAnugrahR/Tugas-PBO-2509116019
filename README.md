# UTS PBO: Sistem Pendataan dan Monitoring Satwa Dilindungi

Alif Anugrah Ramadhan | 2509116019

---

## 1. Deskripsi Program

Program ini merupakan aplikasi sederhana berbasis Java yang dibuat menggunakan NetBeans untuk melakukan pendataan dan monitoring satwa dilindungi. Program digunakan untuk mengelola data satwa yang meliputi proses menambahkan data, menampilkan data, memperbarui data, dan menghapus data.

Program ini dibuat sebagai tugas UTS mata kuliah Pemrograman Berorientasi Objek (PBO) dan dikembangkan dari Mini Project 2, sesuai ketentuan UTS yang memperbolehkan menggunakan program yang sama. Program menerapkan konsep PBO, yaitu input validation, access modifier, encapsulation, inheritance, polymorphism, ArrayList, dan MVC sederhana.

### Class yang ada di program ini

**1. UTSPBOAlifAnugrahR.java**
Merupakan class utama atau entry point untuk menjalankan program. Class ini membuat objek Scanner dan objek SatwaCRUD, lalu memanggil menu utama.

**2. Satwa.java**
Merupakan superclass yang menyimpan data umum satwa, yaitu ID, nama, dan jenis. Class ini memiliki constructor, getter, setter, method `tampilkanInfo()`, dan method `cetakStatus()`.

**3. Mamalia.java**
Merupakan subclass dari Satwa dengan tambahan data habitat.

**4. Reptil.java**
Merupakan subclass dari Satwa dengan tambahan data berbisa atau tidak.

**5. Menu.java**
Merupakan class view yang menampilkan menu utama dan membaca pilihan pengguna.

**6. SatwaCRUD.java**
Merupakan class controller yang menangani proses tambah, tampil, update, dan hapus data. Class ini memakai ArrayList untuk menyimpan data satwa dan sudah berisi 2 data awal (dummy data), yaitu Orangutan (Mamalia) dan Komodo (Reptil).

**7. SatwaCek.java**
Merupakan class controller yang melakukan validasi input, yaitu memastikan ID berupa angka dan lebih dari 0, memastikan input tidak kosong, dan memastikan jawaban ya atau tidak.

---

## 2. Alur Program

Alur program dimulai ketika program dijalankan melalui class `UTSPBOAlifAnugrahR.java`. Program membuat objek `SatwaCRUD` yang otomatis sudah berisi 2 data awal, lalu menampilkan menu utama yang terdiri dari lima pilihan, yaitu Tambah Satwa, Tampilkan Satwa, Update Satwa, Hapus Satwa, dan Keluar.

Pengguna memilih menu dengan memasukkan angka. Program menggunakan `switch` untuk menentukan proses yang dijalankan. Jika angka yang dimasukkan tidak ada di menu, program menampilkan pesan menu tidak tersedia.

Pada menu **Tambah Satwa**, pengguna memasukkan ID, nama, dan jenis satwa. Jenis hanya boleh Mamalia atau Reptil. Jika Mamalia, pengguna mengisi habitat. Jika Reptil, pengguna menjawab ya atau tidak untuk berbisa. Data lalu disimpan ke dalam ArrayList.

Pada menu **Tampilkan Satwa**, program menampilkan seluruh data satwa yang tersimpan. Tampilan tiap satwa menyesuaikan jenisnya (Mamalia menampilkan habitat, Reptil menampilkan berbisa).

Pada menu **Update Satwa**, pengguna memasukkan ID satwa yang ingin diubah, lalu memasukkan nama baru. Yang diubah hanya nama, karena jenis menentukan class objeknya.

Pada menu **Hapus Satwa**, pengguna memasukkan ID satwa yang ingin dihapus. Program mengecek terlebih dahulu apakah ID tersebut tersedia.

Program memiliki validasi input, yaitu:
- ID harus berupa angka dan lebih dari 0.
- ID tidak boleh sama dengan ID yang sudah ada saat tambah data.
- Nama dan habitat tidak boleh kosong.
- Jenis harus Mamalia atau Reptil.
- Jawaban berbisa harus "ya" atau "tidak".

Jika input salah, program menampilkan pesan kesalahan dan meminta pengguna mengulang, tanpa menghentikan program. Program terus berjalan sampai pengguna memilih menu Keluar.

### Dokumentasi Alur Program

**1. Tampilan Menu Utama**

Pada saat program dijalankan, program menampilkan menu utama yang terdiri dari lima pilihan.

![Tampilan menu utama](images/1-menu.png)

**2. Menampilkan Data Awal (Dummy Data)**

Pengguna memilih menu 2. Tampilkan Satwa. Program menampilkan 2 data awal, yaitu Orangutan (Mamalia, habitat Hutan) dan Komodo (Reptil, berbisa Tidak). Terlihat bahwa Mamalia menampilkan habitat dan Reptil menampilkan berbisa.

![Tampilan data awal](images/2-tampil-awal.png)

**3. Tambah Data Satwa**

Pengguna memilih menu 1. Tambah Satwa. Data yang dimasukkan pada pengujian ini:

- ID Satwa: 3
- Nama Satwa: Harimau Sumatera
- Jenis Satwa: Mamalia
- Habitat: Hutan

Setelah semua data dimasukkan, program menampilkan pesan "Mantap Boss, data satwa berhasil ditambahkan!". Hal ini menunjukkan data berhasil disimpan ke dalam ArrayList.

![Tampilan tambah satwa](images/3-tambah.png)

**4. Update Data Satwa**

Pengguna memilih menu 3. Update Satwa, lalu memasukkan ID 3 dan nama baru. Setelah berhasil, program menampilkan pesan "Mantap Boss, data satwa berhasil diupdate!".

![Tampilan update satwa](images/4-update.png)

**5. Pengujian Validasi ID Bukan Angka**

Pengguna memilih menu 4. Hapus Satwa, lalu memasukkan "abc" sebagai ID. Karena bukan angka, program menampilkan pesan "Woopss, ID harus berupa angka Bosku!" dan meminta ID diulang. Program tidak berhenti.

![Validasi ID bukan angka](images/5-validasi-id.png)

**6. Pengujian Validasi Jenis Satwa dan ID Dobel**

Pada menu 1. Tambah Satwa, pengguna memasukkan ID 1 yang sudah dipakai. Program menampilkan pesan "Woopss, ID itu sudah dipakai Bosku, coba ID lain!". Selanjutnya pengguna memasukkan jenis "Burung". Program menampilkan pesan "Woopss, jenis harus Mamalia atau Reptil Bosku!" dan meminta jenis diulang.

![Validasi ID dobel dan jenis](images/6-validasi-jenis.png)

**7. Hapus Data Satwa**

Pengguna memilih menu 4. Hapus Satwa, lalu memasukkan ID 3. Jika ID ditemukan, data dihapus dari ArrayList dan program menampilkan pesan "Siap Boss, data satwa berhasil dihapus!". Jika ID tidak ada, program menampilkan pesan "Woopss, ID satwa tidak ditemukan Bosku!".

![Tampilan hapus satwa](images/7-hapus.png)

**8. Keluar dari Program**

Pengguna memilih menu 5. Keluar. Program menampilkan pesan "Siap Boss, program selesai. Sampai jumpa Bosku!" dan berhenti.

![Tampilan keluar](images/8-keluar.png)

---

## 3. Encapsulation

Encapsulation adalah cara menyembunyikan data (atribut) di dalam class, sehingga data tidak bisa diubah langsung dari luar. Data hanya diakses lewat method getter (mengambil nilai) dan setter (mengubah nilai).

Penerapan di program ini:

- Di class `Satwa`, atribut `id` dibuat `private final` dan hanya punya getter, karena ID tidak boleh berubah setelah data dibuat. Atribut `nama` dan `jenis` dibuat `protected` dan diakses lewat getter dan setter.
- Di class `Mamalia`, atribut `habitat` dibuat `private` dengan `getHabitat()` dan `setHabitat()`.
- Di class `Reptil`, atribut `berbisa` dibuat `private` dengan `isBerbisa()` dan `setBerbisa()`.
- Di class `SatwaCRUD`, ArrayList `daftarSatwa` dan method `idSudahAda()` dibuat `private` karena hanya dipakai di dalam class itu.
- Method yang dipanggil dari class lain, seperti constructor, getter, setter, dan `tampilkanInfo()`, dibuat `public`.

Contoh kode:

```java
public class Satwa {

    private final int id;
    protected String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
```

Saat update nama, `SatwaCRUD` memakai `satwa.setNama(nama)`, bukan mengubah atribut langsung.

---

## 4. Inheritance

Inheritance adalah konsep di mana sebuah class (subclass) mewarisi atribut dan method dari class lain (superclass) memakai kata kunci `extends`.

```
        Satwa   (superclass)
          |
    +-----+-----+
    |           |
 Mamalia      Reptil   (subclass)
```

- `Satwa` sebagai superclass menyimpan data umum: ID, nama, dan jenis.
- `Mamalia` dan `Reptil` sebagai subclass mewarisi data tersebut dan menambahkan data khusus (habitat atau berbisa).
- Kata kunci `super(id, nama, jenis)` di constructor subclass dipakai untuk memanggil constructor `Satwa`.

Contoh kode:

```java
public class Mamalia extends Satwa {

    private String habitat;

    public Mamalia(int id, String nama, String jenis, String habitat) {
        super(id, nama, jenis);
        this.habitat = habitat;
    }
}
```

**Polymorphism (method overriding).** Method `tampilkanInfo()` ada di `Satwa`, lalu di-override di `Mamalia` dan `Reptil` memakai `@Override`. Di `SatwaCRUD`, ArrayList bertipe `Satwa` bisa berisi Mamalia dan Reptil sekaligus. Saat `for-each` memanggil `satwa.tampilkanInfo()`, Java otomatis memakai versi method milik class yang sebenarnya. Jadi satu perintah menghasilkan tampilan berbeda untuk tiap jenis satwa.

**Method final.** Method `cetakStatus()` di `Satwa` dibuat `final` sehingga tidak bisa di-override. Status "Satwa Dilindungi" berlaku sama untuk semua satwa.

---

## 5. Value-Add

Value-add pada UTS ini adalah penerapan **MVC (Model, View, Controller)** versi sederhana. MVC memisahkan program menjadi tiga bagian sesuai tugasnya, sehingga kode lebih rapi dan mudah diperbaiki.

- **Model** (package `model`): `Satwa`, `Mamalia`, `Reptil`. Menyimpan data satwa.
- **View** (package `view`): `Menu`. Menampilkan menu dan menerima pilihan pengguna.
- **Controller** (package `Controller`): `SatwaCRUD` dan `SatwaCek`. Mengatur proses tambah, tampil, update, hapus, dan memeriksa input.

Class `UTSPBOAlifAnugrahR` hanya sebagai pintu masuk (`main`) untuk menjalankan program.

Contohnya, jika ingin mengubah tampilan menu, cukup ubah `Menu`. Jika ingin mengubah aturan validasi, cukup ubah `SatwaCek`. Ini adalah MVC versi sederhana karena `SatwaCRUD` masih memakai Scanner dan `System.out.println`, mengikuti pola Service yang dipelajari di perkuliahan.

---

## Penutup

Program Sistem Pendataan dan Monitoring Satwa Dilindungi telah berhasil dibuat dan dijalankan menggunakan bahasa pemrograman Java. Program dapat mengelola data satwa melalui fitur menambah, menampilkan, mengubah, dan menghapus data.

Program juga menerapkan konsep PBO seperti class, object, constructor, method, encapsulation, inheritance, polymorphism, ArrayList, percabangan, perulangan, validasi input, dan MVC sederhana. Berdasarkan hasil pengujian, setiap fitur berjalan sesuai rancangan dan program dapat menangani kesalahan input dari pengguna.
