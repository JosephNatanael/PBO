package TugasPert3;

import java.io.*;

public class Utama {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tiket Data = new Tiket(null, 0, 0, null, 0, 0, null);

        String Username = "admin";
        String Password = "123";

        String namaHotel, namaPesawat, tujuan;
        int jmlkmr, jmlpenumpang;
        double hrgperkmr, hrgtiketpswt;

        boolean login = false;
        try {
            while (!login) {
                System.out.print("Masukkan Username: ");
                String username = br.readLine();
                System.out.print("Masukkan Password: ");
                String password = br.readLine();
                if (username.equals(Username) && password.equals(Password)) {
                    login = true;
                } else {
                    System.out.println("Login Gagal");
                }
            }
            while (true) {
                System.out.println("----MENU TIKET---");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Masukkan Pilihan (1-3): ");
                int pilihan = Integer.parseInt(br.readLine());
                switch (pilihan) {
                    case 1:
                        System.out.println("---Input Data Transaksi---");
                        System.out.print("Nama Hotel: ");
                        namaHotel = br.readLine();
                        System.out.print("Jumlah Kamar: ");
                        jmlkmr = Integer.parseInt(br.readLine());
                        System.out.print("Harga Per Kamar: ");
                        hrgperkmr = Double.parseDouble(br.readLine());
                        System.out.print("Nama Pesawat: ");
                        namaPesawat = br.readLine();
                        System.out.print("Jumlah Penumpang: ");
                        jmlpenumpang = Integer.parseInt(br.readLine());
                        System.out.print("Harga Tiket Pesawat: ");
                        hrgtiketpswt = Double.parseDouble(br.readLine());
                        System.out.print("Tujuan: ");
                        tujuan = br.readLine();

                        Data = new Tiket(namaHotel, jmlkmr, hrgperkmr, namaPesawat, jmlpenumpang, hrgtiketpswt, tujuan);
                        break;

                    case 2:
                        Data.lihatdatatiket();
                        break;

                    default:
                        System.exit(pilihan);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
