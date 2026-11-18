package ss9_cleancode.controller;

import ss9_cleancode.entity.Oto;
import ss9_cleancode.service.IOtoService;
import ss9_cleancode.service.OtoServiceImpl;
import java.util.List;

public class OtoController {
    private final IOtoService otoService = new OtoServiceImpl();

    public void addOto(Oto oto) {
        otoService.add(oto);
    }

    public List<Oto> findAllOto() {
        return otoService.findAll();
    }

    public Oto findByBienKiemSoat(String bienKiemSoat) {
        return otoService.findByBienKiemSoat(bienKiemSoat);
    }

    public boolean deleteByBienKiemSoat(String bienKiemSoat) {
        return otoService.deleteByBienKiemSoat(bienKiemSoat);
    }
}