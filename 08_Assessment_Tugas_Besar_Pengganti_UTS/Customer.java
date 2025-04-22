public class Customer {
    private String nama;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private Gender gender;

    public Customer(String nama, String nomorKTP, String nomorTelepon, String email, Gender gender) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.gender = gender;
    }

    public String getNama() { return nama; }
    public String getNomorKTP() { return nomorKTP; }
    public String getNomorTelepon() { return nomorTelepon; }
    public String getEmail() { return email; }
    public Gender getGender() { return gender; }
}
