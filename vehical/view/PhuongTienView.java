package vehical.view;

import vehical.controller.HangSanXuatController;
import vehical.controller.PhuongTienController;
import vehical.entity.*;

import java.util.List;
import java.util.Scanner;

public class PhuongTienView {
    private final Scanner sc = new Scanner(System.in);
    private final PhuongTienController phuongTienController = new PhuongTienController();
    private final HangSanXuatController hangSanXuatController = new HangSanXuatController();

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ---");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiển thị phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Thoát.");
            System.out.print("Your choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
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
                        System.out.println("Exit successfully!");
                        return;
                    default:
                        System.out.println("Please enter choice 1-4!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private void themMoiPhuongTien() {
        try {
            int loai = chonLoaiPhuongTien();
            System.out.print("Biển kiểm soát: ");
            String bks = sc.nextLine();
            String hsx = chonHangSanXuat();
            System.out.print("Năm sản xuất: ");
            int nsx = Integer.parseInt(sc.nextLine());
            System.out.print("Chủ sở hữu: ");
            String csh = sc.nextLine();

            switch (loai) {
                case 1:
                    System.out.print("Tải trọng: ");
                    int tt = Integer.parseInt(sc.nextLine());
                    phuongTienController.addPhuongTien(new XeTai(bks, hsx, nsx, csh, tt));
                    System.out.println("Successfully added Xe Tai!");
                    break;
                case 2:
                    System.out.print("Kiểu xe (Du lịch/Xe khách): ");
                    String kx = sc.nextLine();
                    System.out.print("Số chỗ ngồi: ");
                    int scn = Integer.parseInt(sc.nextLine());
                    phuongTienController.addPhuongTien(new Oto(bks, hsx, nsx, csh, scn, kx));
                    System.out.println("Successfully added Oto!");
                    break;
                case 3:
                    System.out.print("Công suất: ");
                    int cs = Integer.parseInt(sc.nextLine());
                    phuongTienController.addPhuongTien(new XeMay(bks, hsx, nsx, csh, cs));
                    System.out.println("Successfully added Xe May!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }

    private int chonLoaiPhuongTien() {
        System.out.println("1. Xe tải");
        System.out.println("2. Ôtô");
        System.out.println("3. Xe máy");
        System.out.print("Your choice: ");
        return Integer.parseInt(sc.nextLine());
    }

    private String chonHangSanXuat() {
        List<HangSanXuat> dsHang = hangSanXuatController.getDanhSachHang();
        System.out.println("--- Danh sách hãng sản xuất ---");
        for (int i = 0; i < dsHang.size(); i++) {
            System.out.println((i + 1) + ". " + dsHang.get(i).getTenHangSanXuat() + " (" + dsHang.get(i).getTenQuocGia() + ")");
        }
        System.out.print("Hãng sản xuất choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return dsHang.get(choice - 1).getTenHangSanXuat();
    }

    private void hienThiPhuongTien() {
        try {
            int loai = chonLoaiPhuongTien();
            List<?> ds = phuongTienController.getDanhSach(loai);

            System.out.println("--- DANH SÁCH PHƯƠNG TIỆN ---");
            if (ds != null && !ds.isEmpty()) {
                for (Object item : ds) {
                    System.out.println(item.toString());
                }
            } else {
                System.out.println("Danh sách rỗng!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice!");
        }
    }

    private void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bks = sc.nextLine();

        PhuongTienGiaoThong target = phuongTienController.findByBienKiemSoat(bks);

        if (target == null) {
            System.out.println("Không tìm thấy xe có biển kiểm soát bạn nhập!");
        } else {
            System.out.println("Thông tin xe tìm thấy:");
            System.out.println(target.toString());
            System.out.print("Xác nhận xóa (Yes/No): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Yes")) {
                phuongTienController.removePhuongTien(bks);
                System.out.println("Successfully deleted!");
            } else {
                System.out.println("Canceled!");
            }
        }
    }
}
