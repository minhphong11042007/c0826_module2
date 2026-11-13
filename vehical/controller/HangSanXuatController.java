package vehical.controller;

import vehical.entity.HangSanXuat;
import vehical.service.IHangSanXuatService;
import vehical.service.HangSanXuatServiceImpl;
import java.util.List;

public class HangSanXuatController {
    private final IHangSanXuatService hangSanXuatService = new HangSanXuatServiceImpl();

    public List<HangSanXuat> getDanhSachHang() {
        return hangSanXuatService.findAll();
    }
}
