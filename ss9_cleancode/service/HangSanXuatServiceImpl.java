package ss9_cleancode.service;

import ss9_cleancode.entity.HangSanXuat;
import ss9_cleancode.repository.HangSanXuatRepositoryImpl;
import ss9_cleancode.repository.IHangSanXuatRepository;
import java.util.List;

public class HangSanXuatServiceImpl implements IHangSanXuatService {
    private final IHangSanXuatRepository repository = new HangSanXuatRepositoryImpl();

    @Override
    public List<HangSanXuat> findAll() {
        return repository.findAll();
    }
}