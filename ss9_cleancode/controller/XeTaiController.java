package ss9_cleancode.controller;

import ss9_cleancode.entity.XeTai;
import ss9_cleancode.service.IXeTaiService;
import ss9_cleancode.service.XeTaiServiceImpl;
import java.util.List;

public class XeTaiController {
    private final IXeTaiService xeTaiService = new XeTaiServiceImpl();

    public void addXeTai(XeTai xeTai) {
        xeTaiService.add(xeTai);
    }

    public List<XeTai> findAllXeTai() {
        return xeTaiService.findAll();
    }

    public XeTai findByBienKiemSoat(String bienKiemSoat) {
        return xeTaiService.findByBienKiemSoat(bienKiemSoat);
    }

    public boolean deleteByBienKiemSoat(String bienKiemSoat) {
        return xeTaiService.deleteByBienKiemSoat(bienKiemSoat);
    }
}