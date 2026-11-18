package ss9_cleancode.controller;

import ss9_cleancode.entity.XeMay;
import ss9_cleancode.service.IXeMayService;
import ss9_cleancode.service.XeMayServiceImpl;
import java.util.List;

public class XeMayController {
    private final IXeMayService xeMayService = new XeMayServiceImpl();

    public void addXeMay(XeMay xeMay) {
        xeMayService.add(xeMay);
    }

    public List<XeMay> findAllXeMay() {
        return xeMayService.findAll();
    }

    public XeMay findByBienKiemSoat(String bienKiemSoat) {
        return xeMayService.findByBienKiemSoat(bienKiemSoat);
    }

    public boolean deleteByBienKiemSoat(String bienKiemSoat) {
        return xeMayService.deleteByBienKiemSoat(bienKiemSoat);
    }
}