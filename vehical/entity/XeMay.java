package vehical.entity;

public class XeMay extends PhuongTienGiaoThong {
    private int congSuat;

    public XeMay() {}

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() { return congSuat; }
    public void setCongSuat(int congSuat) { this.congSuat = congSuat; }

    @Override
    public String toString() {
        return super.toString() + " - Công suất: " + congSuat;
    }
}
