package ss9_cleancode.repository;

import ss9_cleancode.entity.PhuongTienGiaoThong;
import java.util.List;

public interface IPhuongTienRepository<T extends PhuongTienGiaoThong> {
    List<T> findAll();
    void saveAll(List<T> list);
}