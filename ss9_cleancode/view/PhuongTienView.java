package ss9_cleancode.view;

import ss9_cleancode.controller.HangSanXuatController;
import ss9_cleancode.controller.OtoController;
import ss9_cleancode.controller.XeMayController;
import ss9_cleancode.controller.XeTaiController;
import ss9_cleancode.entity.HangSanXuat;
import ss9_cleancode.entity.Oto;
import ss9_cleancode.entity.XeMay;
import ss9_cleancode.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class PhuongTienView {
    private final OtoController otoController = new OtoController();
    private final XeMayController xeMayController = new XeMayController();
    private final XeTaiController xeTaiController = new XeTaiController();
    private final HangSanXuatController hangSanXuatController = new HangSanXuatController();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ---");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                switch (choice) {
                    case 1:
                        themMoiPhuongTien();
                        break;
                    case 2:
                        hienThiPhuongTien();
                        break;
                    case 3:
                        xoaPhuongTien();
                        break;
                    case 4:
                        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        }
    }

    private int chonLoaiPhuongTien() {
        System.out.println("\nChọn loại phương tiện:");
        System.out.println("1. Xe tải");
        System.out.println("2. Ổ tô");
        System.out.println("3. Xe máy");
        System.out.println("4. Quay lại Menu chính");
        System.out.print("Lựa chọn của bạn: ");

        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return 4;
        }
    }

    private String chonHangSanXuat() {
        List<HangSanXuat> list = hangSanXuatController.findAllHangSanXuat();
        System.out.println("\nDanh sách Hãng sản xuất:");
        for (int i = 0; i < list.size(); i++) {
            HangSanXuat hsx = list.get(i);
            System.out.println((i + 1) + ". " + hsx.getTenHangSanXuat() + " - " + hsx.getTenQuocGia());
        }

        while (true) {
            System.out.print("Chọn hãng (1-" + list.size() + "): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= list.size()) {
                    return list.get(choice - 1).getTenHangSanXuat();
                }
            } catch (NumberFormatException ignored) {}
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
        }
    }

    public void themMoiPhuongTien() {
        int choice = chonLoaiPhuongTien();
        if (choice < 1 || choice > 3) return;

        System.out.print("Nhập Biển kiểm soát: ");
        String bks = scanner.nextLine().trim();
        String hsx = chonHangSanXuat();
        System.out.print("Nhập Năm sản xuất: ");
        int nsx = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Nhập Chủ sở hữu: ");
        String csh = scanner.nextLine().trim();

        switch (choice) {
            case 1:
                System.out.print("Nhập Trọng tải: ");
                int tt = Integer.parseInt(scanner.nextLine().trim());
                xeTaiController.addXeTai(new XeTai(bks, hsx, nsx, csh, tt));
                System.out.println("Đã thêm mới Xe tải thành công!");
                break;
            case 2:
                System.out.print("Nhập Số chỗ ngồi: ");
                int scn = Integer.parseInt(scanner.nextLine().trim());
                System.out.print("Nhập Kiểu xe (Du lịch / Xe khách): ");
                String kx = scanner.nextLine().trim();
                otoController.addOto(new Oto(bks, hsx, nsx, csh, scn, kx));
                System.out.println("Đã thêm mới Ô tô thành công!");
                break;
            case 3:
                System.out.print("Nhập Công suất: ");
                int cs = Integer.parseInt(scanner.nextLine().trim());
                xeMayController.addXeMay(new XeMay(bks, hsx, nsx, csh, cs));
                System.out.println("Đã thêm mới Xe máy thành công!");
                break;
        }
    }

    public void hienThiPhuongTien() {
        int choice = chonLoaiPhuongTien();
        if (choice < 1 || choice > 3) return;

        switch (choice) {
            case 1:
                System.out.println("\n--- DANH SÁCH XE TẢI ---");
                List<XeTai> dsXeTai = xeTaiController.findAllXeTai();
                if (dsXeTai.isEmpty()) System.out.println("Danh sách trống.");
                else for (XeTai xeTai : dsXeTai) System.out.println(xeTai);
                break;
            case 2:
                System.out.println("\n--- DANH SÁCH Ô TÔ ---");
                List<Oto> dsOto = otoController.findAllOto();
                if (dsOto.isEmpty()) System.out.println("Danh sách trống.");
                else for (Oto oto : dsOto) System.out.println(oto);

                break;
            case 3:
                System.out.println("\n--- DANH SÁCH XE MÁY ---");
                List<XeMay> dsXeMay = xeMayController.findAllXeMay();
                if (dsXeMay.isEmpty()) System.out.println("Danh sách trống.");
                else for (XeMay xeMay : dsXeMay) System.out.println(xeMay);
                break;
        }
    }

    private boolean xacNhanXoa() {
        System.out.print("Bạn có thực sự muốn xóa phương tiện này? (Yes/No): ");
        String confirm = scanner.nextLine().trim();
        return confirm.equalsIgnoreCase("Yes");
    }

    public void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = scanner.nextLine().trim();

        XeTai xeTai = xeTaiController.findByBienKiemSoat(bienKiemSoat);
        if (xeTai != null) {
            System.out.println("Tìm thấy Xe Tải: " + xeTai);
            if (xacNhanXoa()) {
                xeTaiController.deleteByBienKiemSoat(bienKiemSoat);
                System.out.println("Đã xóa thành công!");
            }
            return;
        }

        // 2. Kiểm tra trong Ô tô
        Oto oto = otoController.findByBienKiemSoat(bienKiemSoat);
        if (oto != null) {
            System.out.println("Tìm thấy Ô tô: " + oto);
            if (xacNhanXoa()) {
                otoController.deleteByBienKiemSoat(bienKiemSoat);
                System.out.println("Đã xóa thành công!");
            }
            return;
        }

        // 3. Kiểm tra trong Xe Máy
        XeMay xeMay = xeMayController.findByBienKiemSoat(bienKiemSoat);
        if (xeMay != null) {
            System.out.println("Tìm thấy Xe Máy: " + xeMay);
            if (xacNhanXoa()) {
                xeMayController.deleteByBienKiemSoat(bienKiemSoat);
                System.out.println("Đã xóa thành công!");
            }
            return;
        }

        System.out.println("Biển kiểm soát không tồn tại trong hệ thống!");
    }
}