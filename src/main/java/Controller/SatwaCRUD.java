package Controller;

import model.mamalia;
import model.reptil;
import model.satwa;
import java.util.ArrayList;
import java.util.Scanner;

public class SatwaCRUD {

    private ArrayList<satwa> daftarSatwa;

    public SatwaCRUD() {
        daftarSatwa = new ArrayList<>();

        daftarSatwa.add(new mamalia(
                1,
                "Orangutan",
                "Mamalia",
                "Hutan"
        ));

        daftarSatwa.add(new reptil(
                2,
                "Komodo",
                "Reptil",
                false
        ));
    }

    private boolean idSudahAda(int id) {
        for (satwa satwa : daftarSatwa) {
            if (satwa.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void tambahSatwa(Scanner input) {

        int id = SatwaCek.cekId(input);

        while (idSudahAda(id)) {
            System.out.println(">> Maaf, ID itu sudah dipakai Boss, coba ID lain! <<");
            id = SatwaCek.cekId(input);
        }

        String nama = SatwaCek.cekString(
                input,
                "Masukkan nama satwa Boss: "
        );

        String jenis = SatwaCek.cekString(
                input,
                "Masukkan jenis satwa Boss (Mamalia/Reptil): "
        );

        while (!jenis.equalsIgnoreCase("Mamalia") && !jenis.equalsIgnoreCase("Reptil")) {
            System.out.println(">> Maaf, jenis harus Mamalia atau Reptil Boss! <<");
            jenis = SatwaCek.cekString(
                    input,
                    "Masukkan jenis satwa Boss (Mamalia/Reptil): "
            );
        }

        if (jenis.equalsIgnoreCase("Mamalia")) {

            String habitat = SatwaCek.cekString(
                    input,
                    "Masukkan habitat Boss: "
            );

            daftarSatwa.add(
                    new mamalia(id, nama, "Mamalia", habitat)
            );

        } else {

            System.out.print(" Apakah berbisa Boss? (ya/tidak): ");
            boolean berbisa = SatwaCek.cekBoolean(input);

            daftarSatwa.add(
                    new reptil(id, nama, "Reptil", berbisa)
            );
        }

        System.out.println(">> Mantap Boss, data satwa berhasil ditambahkan!<<");
    }

    public void tampilkanSatwa() {

        if (daftarSatwa.isEmpty()) {
            System.out.println(">> Maaf, data satwa masih kosong Boss! <<");
            return;
        }

        System.out.println("\n>> ===== INI DAFTAR SATWA BOSS <<=====");

        for (satwa satwa : daftarSatwa) {
            satwa.tampilkanInfo();
            System.out.println("-------------------------");
        }
    }

    public void updateSatwa(Scanner input) {

        int id = SatwaCek.cekId(input);

        for (satwa satwa : daftarSatwa) {

            if (satwa.getId() == id) {

                String nama = SatwaCek.cekString(
                        input,
                        "Masukkan nama baru Boss: "
                );

                satwa.setNama(nama);

                System.out.println(">> Mantap Boss, data satwa berhasil diupdate! <<");
                return;
            }
        }

        System.out.println(">> Maaf, ID satwa tidak ditemukan Boss <<");
    }

    public void hapusSatwa(Scanner input) {

        int id = SatwaCek.cekId(input);

        for (int i = 0; i < daftarSatwa.size(); i++) {

            if (daftarSatwa.get(i).getId() == id) {

                daftarSatwa.remove(i);

                System.out.println(">> Siap Boss, data satwa berhasil dihapus! <<");
                return;
            }
        }

        System.out.println(">> maaf, ID satwa tidak ditemukan Boss! <<");
    }
}