# UTS PBO: Sistem Pendataan dan Monitoring Satwa Dilindungi

Alif Anugrah Ramadhan | 2509116019 | Kelas A Sistem Informasi

---

## 1.Latar Belakang

Indonesia memiliki banyak satwa yang dilindungi, seperti Orangutan, Komodo, dan Harimau Sumatera. Keberadaan satwa-satwa ini terancam oleh perburuan, perdagangan ilegal, dan hilangnya habitat. Untuk menjaganya, data satwa perlu dicatat dan dipantau dengan baik, misalnya nama satwa, kelompok jenisnya, dan data khusus seperti habitat atau apakah satwa tersebut berbisa.

Jika pendataan dilakukan secara manual, data mudah salah, tertukar, atau tercatat ganda. Karena itu dibuat program konsol sederhana untuk membantu mencatat dan memantau satwa dilindungi.

Studi kasus ini dipilih karena satwa mudah dikelompokkan menjadi jenis yang berbeda (Mamalia dan Reptil). Semua satwa punya data umum yang sama (ID, nama, jenis), tetapi tiap kelompok punya data khusus sendiri.
### Class yang ada di program ini

**1. UTSPBOAlifAnugrahR.java**
Merupakan class utama atau entry point untuk menjalankan program. Class ini membuat objek Scanner dan objek SatwaCRUD, lalu memanggil menu utama.

**2. Satwa.java**
Merupakan superclass yang menyimpan data umum satwa, yaitu ID, nama, dan jenis. Class ini memiliki constructor, getter, setter, method tampilkanInfo(), dan method cetakStatus().

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

Alur program dimulai ketika program dijalankan melalui class UTSPBOAlifAnugrahR.java. Program membuat objek SatwaCRUD yang otomatis sudah berisi 2 data awal, lalu menampilkan menu utama yang terdiri dari lima pilihan, yaitu Tambah Satwa, Tampilkan Satwa, Update Satwa, Hapus Satwa, dan Keluar.

Pengguna memilih menu dengan memasukkan angka. Program menggunakan switch untuk menentukan proses yang dijalankan. Jika angka yang dimasukkan tidak ada di menu, program menampilkan pesan menu tidak tersedia.

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

<img width="553" height="282" alt="image" src="https://github.com/user-attachments/assets/1ae1e825-03fe-4b1f-b426-7fbe79aa543e" />


**2. Menampilkan Data Awal (Dummy Data)**

Pengguna memilih menu 2. Tampilkan Satwa. Program menampilkan 2 data awal, yaitu Orangutan (Mamalia, habitat Hutan) dan Komodo (Reptil, berbisa Tidak). Terlihat bahwa Mamalia menampilkan habitat dan Reptil menampilkan berbisa.

<img width="513" height="447" alt="image" src="https://github.com/user-attachments/assets/3993de33-23c3-4e79-93e3-384cbc1c8085" />


**3. Tambah Data Satwa**

Pengguna memilih menu 1. Tambah Satwa. Data yang dimasukkan pada pengujian ini:

- ID Satwa: 3
- Nama Satwa: Harimau Sumatera
- Jenis Satwa: Mamalia
- Habitat: Hutan

Setelah semua data dimasukkan, program menampilkan pesan "Mantap Boss, data satwa berhasil ditambahkan!". Hal ini menunjukkan data berhasil disimpan ke dalam ArrayList.

<img width="633" height="171" alt="image" src="https://github.com/user-attachments/assets/290a9c73-ebd0-4e0d-a32e-de39c32fb176" />


**4. Update Data Satwa**

Pengguna memilih menu 3. Update Satwa, lalu memasukkan ID 3 dan nama baru. Setelah berhasil, program menampilkan pesan "Mantap Boss, data satwa berhasil diupdate!".

<img width="597" height="128" alt="image" src="https://github.com/user-attachments/assets/e7e8e62b-9147-43e6-be2c-a2affcd7c932" />


**5. Pengujian Validasi ID Bukan Angka**

Pengguna memilih menu 4. Hapus Satwa, lalu memasukkan "abc" sebagai ID. Karena bukan angka, program menampilkan pesan "Maaf, ID harus berupa angka Boss!" dan meminta ID diulang. Program tidak berhenti.

<img width="476" height="110" alt="image" src="https://github.com/user-attachments/assets/b2a9c5ec-cc9b-4210-9811-da66b2cc1d40" />


**6. Pengujian Validasi Jenis Satwa dan ID Dobel**

Pada menu 1. Tambah Satwa, pengguna memasukkan ID 1 yang sudah dipakai. Program menampilkan pesan "maaf, ID itu sudah dipakai Boss, coba ID lain!". Selanjutnya pengguna memasukkan jenis "Burung". Program menampilkan pesan "Maaf, jenis harus Mamalia atau Reptil Boss!" dan meminta jenis diulang.

<img width="651" height="202" alt="image" src="https://github.com/user-attachments/assets/a56078de-5c31-4fe7-91d3-b906f419e1dc" />


**7. Hapus Data Satwa**

Pengguna memilih menu 4. Hapus Satwa, lalu memasukkan ID 3. Jika ID ditemukan, data dihapus dari ArrayList dan program menampilkan pesan "Siap Boss, data satwa berhasil dihapus!". Jika ID tidak ada, program menampilkan pesan "Maaf, ID satwa tidak ditemukan Boss!".

<img width="582" height="102" alt="image" src="https://github.com/user-attachments/assets/12d8c350-6fa8-43a4-9ea1-51d3b1de6936" />


**8. Keluar dari Program**

Pengguna memilih menu 5. Keluar. Program menampilkan pesan "Siap Boss, program selesai. Sampai jumpa Boss!" dan berhenti.

<img width="592" height="208" alt="image" src="https://github.com/user-attachments/assets/912280a6-ad08-48e3-a4f6-9d9fd111ef26" />


---

## 3. Encapsulation

Encapsulation adalah cara menyembunyikan data (atribut) di dalam class, sehingga data tidak bisa diubah langsung dari luar. Data hanya diakses lewat method getter (mengambil nilai) dan setter (mengubah nilai).

Penerapan di program ini:

- Di class Satwa, atribut id dibuat private final dan hanya punya getter, karena ID tidak boleh berubah setelah data dibuat. Atribut nama dan jenis dibuat protected dan diakses lewat getter dan setter.
- Di class Mamalia, atribut habitat dibuat private dengan getHabitat() dan setHabitat().
- Di class Reptil, atribut berbisa dibuat private dengan isBerbisa() dan setBerbisa().
- Di class SatwaCRUD, ArrayList daftarSatwa dan method idSudahAda() dibuat private karena hanya dipakai di dalam class itu.
- Method yang dipanggil dari class lain, seperti constructor, getter, setter, dan tampilkanInfo(), dibuat public.

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

Saat update nama, SatwaCRUD memakai satwa.setNama(nama), bukan mengubah atribut langsung.

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

- Satwa sebagai superclass menyimpan data umum: ID, nama, dan jenis.
- Mamalia dan Reptil sebagai subclass mewarisi data tersebut dan menambahkan data khusus (habitat atau berbisa).
- Kata kunci super(id, nama, jenis) di constructor subclass dipakai untuk memanggil constructor Satwa.
- Peran Satwa sebagai superclass, yaitu data umum yang dimiliki semua satwa.
- Peran Mamalia dan Reptil sebagai subclass, lengkap dengan apa yang diwarisi dan atribut khusus yang ditambahkan.
- Hubungan "is-a": Mamalia adalah Satwa, Reptil adalah Satwa, sehingga keduanya bisa disimpan dalam satu ArrayList<Satwa>.
- Method tampilkanInfo() yang di-override dan method cetakStatus() yang final.
- Alasan memakai hierarki ini, yaitu data umum cukup ditulis sekali dan mudah menambah kelompok satwa baru.
- Hubungan class lain (SatwaCRUD, Menu, SatwaCek) dalam satu paragraf singkat.
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

**Polymorphism (method overriding).** Method tampilkanInfo() ada di Satwa, lalu di-override di Mamalia dan Reptil memakai @Override. Di SatwaCRUD, ArrayList bertipe Satwa bisa berisi Mamalia dan Reptil sekaligus. Saat for-each memanggil satwa.tampilkanInfo(), Java otomatis memakai versi method milik class yang sebenarnya. Jadi satu perintah menghasilkan tampilan berbeda untuk tiap jenis satwa.

**Method final.** Method cetakStatus() di Satwa dibuat final sehingga tidak bisa di-override. Status "Satwa Dilindungi" berlaku sama untuk semua satwa.

---

## 5. Value-Add

Value-add pada UTS ini adalah penerapan **MVC (Model, View, Controller)** versi sederhana. MVC memisahkan program menjadi tiga bagian sesuai tugasnya, sehingga kode lebih rapi dan mudah diperbaiki.

- **Model** (package model): Satwa, Mamalia, Reptil. Menyimpan data satwa.
- **View** (package view): Menu. Menampilkan menu dan menerima pilihan pengguna.
- **Controller** (package Controller): SatwaCRUD dan SatwaCek. Mengatur proses tambah, tampil, update, hapus, dan memeriksa input.

Class UTSPBOAlifAnugrahR hanya sebagai pintu masuk (main) untuk menjalankan program.

Contohnya, jika ingin mengubah tampilan menu, cukup ubah Menu. Jika ingin mengubah aturan validasi, cukup ubah SatwaCek. Ini adalah MVC versi sederhana karena SatwaCRUD masih memakai Scanner dan System.out.println, mengikuti pola Service yang dipelajari di perkuliahan.

---

## Penutup

Program Sistem Pendataan dan Monitoring Satwa Dilindungi telah berhasil dibuat dan dijalankan menggunakan bahasa pemrograman Java. Program dapat mengelola data satwa melalui fitur menambah, menampilkan, mengubah, dan menghapus data.

Program juga menerapkan konsep PBO seperti class, object, constructor, method, encapsulation, inheritance, polymorphism, ArrayList, percabangan, perulangan, validasi input, dan MVC sederhana. Berdasarkan hasil pengujian, setiap fitur berjalan sesuai rancangan dan program dapat menangani kesalahan input dari pengguna.
