package student;

public class KhoiB extends HocSinh{
    double monSinh;

    public KhoiB() {}

    public KhoiB(String maHocSinh, String hoTen, String ngaySinh, String gioiTinh, String lop, double monToan, double monHoa, double monSinh) {
        super(maHocSinh, hoTen, ngaySinh, gioiTinh, lop, monToan, monHoa);
        this.monSinh = monSinh;
    }

    public double getMonSinh() {
        return monSinh;
    }

    public void setMonSinh(double monSinh) {
        this.monSinh = monSinh;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "Môn Sinh: " + this.monSinh;
    }

    @Override
    public double getDiemTrungBinh() {
        return (super.getMonToan() + super.getMonHoa() + this.getMonSinh() * 2)/4;
    }
}
