package TugasPert3;

public class Tiket {
    // input data
    private String namaHotel, namaPesawat, tujuan;
    private int jumlahKamar, jumlahPenumpang;
    private double hargaperKamar, hargaTiketPesawat;
    private int diskon;

    public Tiket(String namaHotel, int jumlahKamar, double hargaperKamar, String namaPesawat, int jumlahPenumpang,
            double hargaTiketPesawat, String tujuan) {
        this.namaHotel = namaHotel;
        this.jumlahKamar = jumlahKamar;
        this.hargaperKamar = hargaperKamar;
        this.namaPesawat = namaPesawat;
        this.jumlahPenumpang = jumlahPenumpang;
        this.hargaTiketPesawat = hargaTiketPesawat;
        this.tujuan = tujuan;
    }

    public String getNamaHotel() {
        return this.namaHotel;
    }

    public int getJumlahKamar() {
        return this.jumlahKamar;
    }

    public double getHargaperKamar() {
        return this.hargaperKamar;
    }

    public String getNamaPesawat() {
        return this.namaPesawat;
    }

    public int getJumlahPenumpang() {
        return this.jumlahPenumpang;
    }

    public double getHargaTiketPesawat() {
        return this.hargaTiketPesawat;
    }

    public String getTujuan() {
        return this.tujuan;
    }

    // method tambahan

    public double getHargaTiket() {
        return getHargaTiketPesawat() * getJumlahPenumpang();
    }

    public double getTotalTiketPesawat() {
        return getHargaTiket() + (getJumlahPenumpang() * 29000);
    }

    public double getDiskonKmr() {
        return 0.45 * getHargaperKamar();
    }

    public double getTotalKamar() {
        return (getHargaperKamar() - getDiskonKmr()) * getJumlahKamar();
    }

    public void lihatdatatiket() {
        System.out.println("---Transaksi Tiket Pesawat dan Hotel---");
        System.out.println("Tujuan" + getTujuan());
        System.out.println("Nama Hotel: " + getNamaHotel() + " - Jumlah Kamar: " + getJumlahKamar()
                + " - Harga per Kamar: " + getHargaperKamar());
        System.out.println("Total Biaya Kamar Hotel dengan diskon 45%: " + getTotalKamar());
        System.out.println("Nama Pesawat: " + getNamaHotel() + " - Jumlah Penumpang: " + getJumlahPenumpang()
                + " - Harga Tiket Pesawat: " + getHargaTiketPesawat());
        System.out.println(
                "Total Harga Tiket Pesawat: " + getTotalTiketPesawat() + "  dengan biaya asuransi 29.000/penumpang");
    }
}