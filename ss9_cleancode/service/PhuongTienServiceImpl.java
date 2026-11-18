package ss9_cleancode.service;

import ss9_cleancode.entity.PhuongTienGiaoThong;
import ss9_cleancode.repository.IPhuongTienRepository;
import java.util.List;

public abstract class PhuongTienServiceImpl<T extends PhuongTienGiaoThong> implements IPhuongTienService<T> {
    protected final IPhuongTienRepository<T> repository;

    public PhuongTienServiceImpl(IPhuongTienRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public void add(T item) {
        List<T> list = repository.findAll();
        list.add(item);
        repository.saveAll(list);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findByBienKiemSoat(String bienKiemSoat) {
        List<T> list = repository.findAll();
        for (T item : list) {
            if (item.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean deleteByBienKiemSoat(String bienKiemSoat) {
        List<T> list = repository.findAll();
        for (T item : list) {
            if (item.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                list.remove(item);
                repository.saveAll(list);
                return true;
            }
        }
        return false;
    }
}