package ss9_cleancode.entity;

public abstract class PhuongTienGiaoThong {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTienGiaoThong() {}

    public PhuongTienGiaoThong(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() { return bienKiemSoat; }
    public void setBienKiemSoat(String bienKiemSoat) { this.bienKiemSoat = bienKiemSoat; }

    public String getHangSanXuat() { return hangSanXuat; }
    public void setHangSanXuat(String hangSanXuat) { this.hangSanXuat = hangSanXuat; }

    public int getNamSanXuat() { return namSanXuat; }
    public void setNamSanXuat(int namSanXuat) { this.namSanXuat = namSanXuat; }

    public String getChuSoHuu() { return chuSoHuu; }
    public void setChuSoHuu(String chuSoHuu) { this.chuSoHuu = chuSoHuu; }

    // Phương thức trừu tượng ép buộc các lớp con triển khai cách chuyển dữ liệu thành dòng CSV
    public abstract String toCSV();

    @Override
    public String toString() {
        return "Biển kiểm soát: " + bienKiemSoat +
                " - Hãng sản xuất: " + hangSanXuat +
                " - Năm sản xuất: " + namSanXuat +
                " - Chủ sở hữu: " + chuSoHuu;
    }
}