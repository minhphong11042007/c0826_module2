package ss9_cleancode.controller;

import ss9_cleancode.entity.HangSanXuat;
import ss9_cleancode.service.HangSanXuatServiceImpl;
import ss9_cleancode.service.IHangSanXuatService;
import java.util.List;

public class HangSanXuatController {
    private final IHangSanXuatService hangSanXuatService = new HangSanXuatServiceImpl();

    public List<HangSanXuat> findAllHangSanXuat() {
        return hangSanXuatService.findAll();
    }
}