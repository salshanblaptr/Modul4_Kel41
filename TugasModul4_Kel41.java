package com.Tugas;

import java.util.Scanner;

public class TugasModul4_Kel41 {
    public static void jadwal(){
        System.out.println("            KINO CXCIV          ");
        System.out.println("    WAKTU TAYANG HARI INI :         ");
        System.out.println("    1. A LETTER FROM NORMAN          ");
        System.out.println("       Rp. 40000        (12:00) (13:45) (15:35)");
        System.out.println("    2. DREAMS COME TRUE          ");
        System.out.println("       Rp. 35000        (12:10) (13:30) (19:15)");
        System.out.println("    3. RECORDS OF COMRADES          ");
        System.out.println("       Rp. 30000        (12:10) (15:30) (17:15)");
        System.out.println("    4. SEEKING THE SKY OF FREEDOM          ");
        System.out.println("       Rp. 30000        (11:10) (13:30) (19:15)");
        System.out.println("                  ");

        namamu();
    }
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String[] Jam1 = {"1. 12.00", "2. 13.45", "3. 15.35"};
    static int jam1;
    public static void kosong() {
        System.out.println("");
    }
    public static void namamu() {
        System.out.println("Silakan Masukkan Nama Anda ");
        name = scan.next();
        System.out.println("Halo " + name);
        umurmu();
    }
        public static void umurmu(){
            System.out.println("Silakan Masukkan Umur Anda");
            String umur = scan.next();
            System.out.println("Umur " + umur);
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int pilih;
        String[][] anggota = {{"Kelompok 41", "Shift 2"}, {"Naura Sharfina Azarine", "21120120140159", "Daniel Ritz", "21120120120021", "Kakung Bangkit Pakarti", "21120120140130", "Salsha Nabila Putri", "21120120140168"}};
        System.out.println(anggota [0][0]);
        System.out.println(anggota [0][1]);
        System.out.println(anggota [1][0] +"\t\t"+anggota[1][1]);
        System.out.println(anggota [1][2] +"\t\t\t\t\t"+anggota[1][3]);
        System.out.println(anggota [1][4] +"\t\t"+anggota[1][5]);
        System.out.println(anggota [1][6] +"\t\t\t"+anggota[1][7]);
        System.out.println("===============================================\n\n");
        while (true){
            jadwal();
            System.out.print("Masukkan Pilihan Tontonan : ");
            pilih = Integer.parseInt(input.next());
            switch(pilih){
                case 1 :
                    System.out.print("A LETTER FROM NORMAN\n");
                    System.out.print("Tayang Pukul: \n");
                    for(int i=0;i<Jam1.length;i++) {
                        System.out.println(Jam1[i]);
                    }
                    System.out.println("Silakan Pilih Jam Yang Anda Inginkan ");
                    jam1=scan.nextInt();
                    System.out.println("Kamu Memilih Menonton Jam "+Jam1[jam1-1].substring(3,Jam1[jam1-1].length()));
                    System.out.println("Harga Tiket : Rp. 40.000\n");
                    System.out.println("Terima Kasih Atas Pembelian Anda, \nKamu Memilih Menonton Film A LETTER FROM NORMAN Pukul "+Jam1[jam1-1].substring(3,Jam1[jam1-1].length()));
                    System.out.println("Jangan Sampai Terlambat! ");
                    System.exit(0);
                case 2 :

                case 3 :

                case 4 :

                default:
                    System.out.println("Silakan Masukkan Pilihan Tontonan ");
                    break;
            }
        }
    }
}
