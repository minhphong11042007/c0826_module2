package vehical.entity;

public class XeTai extends PhuongTienGiaoThong {
    private int taiTrong;

    public XeTai() {}

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() { return taiTrong; }
    public void setTaiTrong(int taiTrong) { this.taiTrong = taiTrong; }

    @Override
    public String toString() {
        return super.toString() + " - Trọng tải: " + taiTrong;
    }
}
