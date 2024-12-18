/*
 * Nama: Orang Sigma
 * Nim: Fanum Tax
 * Nomor Absen: Pen tau aja
 */

import java.util.Scanner;

public class FreakyUAS {
    static String[] namaKelompok = new String[3];
    static int[] totalSkor = new int[3];
    static int[][] skorOverallKelompok = new int[3][2];
    static int juara = 0;

    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = sigmaSkibidi.nextInt();
            sigmaSkibidi.nextLine();

            switch (choice) {
                case 1:
                    inputData(sigmaSkibidi);
                    break;
                case 2:
                    if (namaKelompok[0] == null) {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                    } else {
                        tampilkanSkor();
                    }
                    break;
                case 3:
                    tentukanJuara();
                    break;
                case 4:
                    System.out.println("Sedang mengeluarkan program.....");
                    return;

                default:
                    System.out.println("Input tidak valid. Pastikan input yang di ketik telah benar.");
                    break;
            }
        }
    }

    public static void inputData(Scanner sigmaSkibidi) {
        for (int i = 0; i < namaKelompok.length; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            namaKelompok[i] = sigmaSkibidi.nextLine();
            for (int j = 0; j < skorOverallKelompok[i].length; j++) {
                System.out.print("Masukkan skor " + namaKelompok[i] + " untuk Level " + (j + 1) + ": ");
                skorOverallKelompok[i][j] = sigmaSkibidi.nextInt();
                sigmaSkibidi.nextLine();

                if (skorOverallKelompok[i][j] <= 0) {
                    System.out.println("Input tidak valid. Pastikan input yang anda masukkan benar.");
                    return;
                } else {
                    totalSkor[i] += skorOverallKelompok[i][j];
                    System.out.println();
                }
                
            }
        }
    }

    public static void tampilkanSkor() {
        System.out.println("\n=== Tabel Skor Turnamen ===");
        System.out.println("Nama Tim \t   Level 1 \t   Level 2 \tTotal Skor");
        for (int i = 0; i < namaKelompok.length; i++) {
            int j = 0;
            System.out.printf("%7s \t\t%2d \t\t%2d \t\t%3d%n", namaKelompok[i], skorOverallKelompok[i][j],
                    skorOverallKelompok[i][(j + 1)], totalSkor[i]);

        }
    }

    public static void tentukanJuara() {
        int juaraIndex = 0;
        for (int i = 0; i < skorOverallKelompok.length; i++) {
            if (totalSkor[i] > juara) {
                juara = totalSkor[i];
                juaraIndex = i;
            }
        }
        System.out.println("Selamat kepada tim " + namaKelompok[juaraIndex]
                + " yang telah memenangkan kompetisi dengan total skor " + juara + "!");
    }
}