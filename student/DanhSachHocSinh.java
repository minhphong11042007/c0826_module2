package student;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHocSinh {
    private List<HocSinh> danhSach;

    public DanhSachHocSinh() {
        this.danhSach = new ArrayList<>();
    }

    public List<HocSinh> getDanhSach() {
        return danhSach;
    }

    // 4a. Đọc dữ liệu từ 2 file text
    public void docTuFile(String pathKhoiA, String pathKhoiB) {
        danhSach.clear();
        List<KhoiA> listA = FileHelper.findAllKhoiA(pathKhoiA);
        List<KhoiB> listB = FileHelper.findAllKhoiB(pathKhoiB);

        danhSach.addAll(listA);
        danhSach.addAll(listB);
    }

    // 4b. Ghi thông tin học sinh ra file text theo từng khối
    public void ghiRaFile(String pathKhoiA, String pathKhoiB) {
        List<KhoiA> listA = new ArrayList<>();
        List<KhoiB> listB = new ArrayList<>();

        for (HocSinh hs : danhSach) {
            if (hs instanceof KhoiA) {
                listA.add((KhoiA) hs);
            } else if (hs instanceof KhoiB) {
                listB.add((KhoiB) hs);
            }
        }

        FileHelper.saveAllKhoiA(pathKhoiA, listA);
        FileHelper.saveAllKhoiB(pathKhoiB, listB);
    }

    // 4c. Thêm 1 học sinh (Kiểm tra trùng mã trước khi thêm)
    public boolean themHocSinh(HocSinh hs) {
        if (timKiemTheoMa(hs.getMaHocSinh()) != null) {
            System.out.println("Lỗi: Mã học sinh đã tồn tại!");
            return false;
        }
        danhSach.add(hs);
        return true;
    }

    // 4d. Xóa 1 học sinh theo mã
    public boolean xoaHocSinhTheoMa(String maHocSinh) {
        HocSinh hs = timKiemTheoMa(maHocSinh);
        if (hs != null) {
            danhSach.remove(hs);
            return true;
        }
        return false;
    }

    // Phương thức phụ trợ tìm kiếm theo mã học sinh
    public HocSinh timKiemTheoMa(String maHocSinh) {
        for (HocSinh hs : danhSach) {
            if (hs.getMaHocSinh().equalsIgnoreCase(maHocSinh)) {
                return hs;
            }
        }
        return null;
    }
}