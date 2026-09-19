package Controller;

import java.util.Scanner;

public class SatwaCek {

    public static int cekId(Scanner input) {
        while (true) {
            try {
                System.out.print(" Masukkan ID Boss: ");
                int id = Integer.parseInt(input.nextLine());

                if (id > 0) {
                    return id;
                }

                System.out.println(">> Maaf, ID harus lebih dari 0 Boss! <<");
            } catch (NumberFormatException e) {
                System.out.println(">> Maaf, ID harus berupa angka Boss! <<");
            }
        }
    }

    public static String cekString(Scanner input, String pesan) {
        while (true) {
            System.out.print("> " + pesan);
            String data = input.nextLine().trim();

            if (!data.isEmpty()) {
                return data;
            }

            System.out.println(">> Maaf, input tidak boleh kosong Boss! <<");
        }
    }

    public static boolean cekBoolean(Scanner input) {
        while (true) {
            String data = input.nextLine();

            if (data.equalsIgnoreCase("ya")) {
                return true;
            }
            if (data.equalsIgnoreCase("tidak")) {
                return false;
            }

            System.out.println(">> Maaf, jawab 'ya' atau 'tidak' saja Boss! <<");
            System.out.print(" Masukkan pilihan Boss: ");
        }
    }
}