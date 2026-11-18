package student;

public abstract class HocSinh {
    String maHocSinh;
    String hoTen;
    String ngaySinh;
    String gioiTinh;
    String lop;
    double monToan;
    double monHoa;

    public HocSinh() {}

    public HocSinh(String maHocSinh, String hoTen, String ngaySinh, String gioiTinh, String lop, double monToan, double monHoa) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
        this.monToan = monToan;
        this.monHoa = monHoa;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getMonToan() {
        return monToan;
    }

    public void setMonToan(double monToan) {
        this.monToan = monToan;
    }

    public double getMonHoa() {
        return monHoa;
    }

    public void setMonHoa(double monHoa) {
        this.monHoa = monHoa;
    }

    @Override
    public String toString() {
        return "Mã học sinh: " + maHocSinh + " - " +
                "Họ tên: " + hoTen + " - " +
                "Ngày sinh: " + ngaySinh + " - " +
                "Giới tính: " + gioiTinh + " - " +
                "Lớp: " + lop + " - " +
                "Môn Toán: " + monToan + " - " +
                "Môn Hóa: " + monHoa;
    }

    public abstract double getDiemTrungBinh();
}
