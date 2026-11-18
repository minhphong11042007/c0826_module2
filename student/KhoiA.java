package student;

public class KhoiA extends HocSinh{
    double monLy;

    public KhoiA() {}

    public KhoiA(String maHocSinh, String hoTen, String ngaySinh, String gioiTinh, String lop, double monToan, double monHoa, double monLy) {
        super(maHocSinh, hoTen, ngaySinh, gioiTinh, lop, monToan, monHoa);
        this.monLy = monLy;
    }

    public double getMonLy() {
        return monLy;
    }

    public void setMonLy(double monLy) {
        this.monLy = monLy;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "Môn Lý: " + this.monLy;
    }

    @Override
    public double getDiemTrungBinh() {
        return (super.getMonToan() * 2 + super.getMonHoa() + this.getMonLy())/4;
    }
}
