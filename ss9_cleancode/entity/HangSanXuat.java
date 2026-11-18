package ss9_cleancode.entity;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat() {}

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() { return maHangSanXuat; }
    public void setMaHangSanXuat(String maHangSanXuat) { this.maHangSanXuat = maHangSanXuat; }

    public String getTenHangSanXuat() { return tenHangSanXuat; }
    public void setTenHangSanXuat(String tenHangSanXuat) { this.tenHangSanXuat = tenHangSanXuat; }

    public String getTenQuocGia() { return tenQuocGia; }
    public void setTenQuocGia(String tenQuocGia) { this.tenQuocGia = tenQuocGia; }

    @Override
    public String toString() {
        return "Mã hãng: " + maHangSanXuat + " - Tên hãng: " + tenHangSanXuat + " - Quốc gia: " + tenQuocGia;
    }
}