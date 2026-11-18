package ss9_cleancode.service;

import ss9_cleancode.entity.PhuongTienGiaoThong;
import java.util.List;

public interface IPhuongTienService<T extends PhuongTienGiaoThong> {
    void add(T item);
    List<T> findAll();
    T findByBienKiemSoat(String bienKiemSoat);
    boolean deleteByBienKiemSoat(String bienKiemSoat);
}