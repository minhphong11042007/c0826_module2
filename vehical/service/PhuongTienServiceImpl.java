package vehical.service;

import vehical.entity.Oto;
import vehical.entity.PhuongTienGiaoThong;
import vehical.entity.XeMay;
import vehical.entity.XeTai;
import vehical.repository.IPhuongTienRepository;
import vehical.repository.OtoRepositoryImpl;
import vehical.repository.XeMayRepositoryImpl;
import vehical.repository.XeTaiRepositoryImpl;

import java.util.List;

public class PhuongTienServiceImpl implements IPhuongTienService {
    private final IPhuongTienRepository<XeTai> xeTaiRepo = new XeTaiRepositoryImpl();
    private final IPhuongTienRepository<Oto> otoRepo = new OtoRepositoryImpl();
    private final IPhuongTienRepository<XeMay> xeMayRepo = new XeMayRepositoryImpl();

    @Override
    public void add(PhuongTienGiaoThong pt) {
        if (pt instanceof XeTai) {
            List<XeTai> list = xeTaiRepo.findAll();
            list.add((XeTai) pt);
            xeTaiRepo.saveAll(list);
        } else if (pt instanceof Oto) {
            List<Oto> list = otoRepo.findAll();
            list.add((Oto) pt);
            otoRepo.saveAll(list);
        } else if (pt instanceof XeMay) {
            List<XeMay> list = xeMayRepo.findAll();
            list.add((XeMay) pt);
            xeMayRepo.saveAll(list);
        }
    }

    @Override
    public List<?> findAllByLoai(int loai) {
        switch (loai) {
            case 1: return xeTaiRepo.findAll();
            case 2: return otoRepo.findAll();
            case 3: return xeMayRepo.findAll();
            default: return null;
        }
    }

    @Override
    public PhuongTienGiaoThong findByBienKiemSoat(String bks) {
        for (XeTai xt : xeTaiRepo.findAll()) {
            if (xt.getBienKiemSoat().equalsIgnoreCase(bks)) return xt;
        }
        for (Oto oto : otoRepo.findAll()) {
            if (oto.getBienKiemSoat().equalsIgnoreCase(bks)) return oto;
        }
        for (XeMay xm : xeMayRepo.findAll()) {
            if (xm.getBienKiemSoat().equalsIgnoreCase(bks)) return xm;
        }
        return null;
    }

    @Override
    public boolean deleteByBienKiemSoat(String bks) {
        List<XeTai> xeTaiList = xeTaiRepo.findAll();
        for (XeTai xt : xeTaiList) {
            if (xt.getBienKiemSoat().equalsIgnoreCase(bks)) {
                xeTaiList.remove(xt);
                xeTaiRepo.saveAll(xeTaiList);
                return true;
            }
        }

        List<Oto> otoList = otoRepo.findAll();
        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().equalsIgnoreCase(bks)) {
                otoList.remove(oto);
                otoRepo.saveAll(otoList);
                return true;
            }
        }

        List<XeMay> xeMayList = xeMayRepo.findAll();
        for (XeMay xm : xeMayList) {
            if (xm.getBienKiemSoat().equalsIgnoreCase(bks)) {
                xeMayList.remove(xm);
                xeMayRepo.saveAll(xeMayList);
                return true;
            }
        }
        return false;
    }
}
