import java.util.Date;

public class HotelRoomBooking {

    private Customer customer;
    private RoomType roomType;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private String kodeVoucher;
    private boolean sudahDibayar;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private boolean statusAktif;

    public HotelRoomBooking(Customer customer, RoomType roomType, int jumlahTamu, int jumlahMalam,
                             double hargaPerMalam, Date tanggalCheckin, Date tanggalCheckout,
                             boolean statusAktif, String kodeVoucher, boolean sudahDibayar) {
        this.customer = customer;
        this.roomType = roomType;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.statusAktif = statusAktif;
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println("Nama Pemesan : " + customer.getNama());
        System.out.println("Jenis Kelamin: " + customer.getGender());
        System.out.println("No. KTP      : " + customer.getNomorKTP());
        System.out.println("Telepon      : " + customer.getNomorTelepon());
        System.out.println("Email        : " + customer.getEmail());
        System.out.println("Jenis Kamar  : " + roomType);
        System.out.println("Jumlah Tamu  : " + jumlahTamu);
        System.out.println("Jumlah Malam : " + jumlahMalam);
        System.out.println("Harga/Malam  : Rp " + hargaPerMalam);
        System.out.println("Check-in     : " + tanggalCheckin);
        System.out.println("Check-out    : " + tanggalCheckout);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Voucher      : " + (kodeVoucher != null ? kodeVoucher : "-"));
        System.out.println("Sudah Dibayar: " + sudahDibayar);
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
        System.out.println("===================================");
    }

    public double hitungTotalBiaya() {
        if (!statusAktif) return 0;
        double total = hargaPerMalam * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * 100000;
        }
        total -= hitungDiskon();
        return total;
    }

    private double hitungDiskon() {
        if (kodeVoucher != null && kodeVoucher.length() > 3) {
            return 50000;
        }
        return 0;
    }

    public String klasifikasiTamu() {
        switch (jumlahTamu) {
            case 1: return "Individu";
            case 2: return "Pasangan";
            default: return "Keluarga";
        }
    }
}
