package vehical.repository;

import vehical.entity.PhuongTienGiaoThong;
import java.util.List;

public interface IPhuongTienRepository<T extends PhuongTienGiaoThong> {
    List<T> findAll();
    void saveAll(List<T> list);
}
