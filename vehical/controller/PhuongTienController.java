package vehical.controller;

import vehical.entity.PhuongTienGiaoThong;
import vehical.service.IPhuongTienService;
import vehical.service.PhuongTienServiceImpl;
import java.util.List;

public class PhuongTienController {
    private final IPhuongTienService phuongTienService = new PhuongTienServiceImpl();

    public void addPhuongTien(PhuongTienGiaoThong pt) {
        phuongTienService.add(pt);
    }

    public List<?> getDanhSach(int loai) {
        return phuongTienService.findAllByLoai(loai);
    }

    public PhuongTienGiaoThong findByBienKiemSoat(String bks) {
        return phuongTienService.findByBienKiemSoat(bks);
    }

    public boolean removePhuongTien(String bks) {
        return phuongTienService.deleteByBienKiemSoat(bks);
    }
}
