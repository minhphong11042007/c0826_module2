package vehical.service;

import vehical.entity.PhuongTienGiaoThong;
import java.util.List;

public interface IPhuongTienService {
    void add(PhuongTienGiaoThong phuongTien);
    List<?> findAllByLoai(int loai); // 1: XeTai, 2: Oto, 3: XeMay
    PhuongTienGiaoThong findByBienKiemSoat(String bienKiemSoat);
    boolean deleteByBienKiemSoat(String bienKiemSoat);
}
