package vehical.service;

import vehical.entity.HangSanXuat;
import vehical.repository.IHangSanXuatRepository;
import vehical.repository.HangSanXuatRepositoryImpl;
import java.util.List;

public class HangSanXuatServiceImpl implements IHangSanXuatService {
    private final IHangSanXuatRepository hangSanXuatRepo = new HangSanXuatRepositoryImpl();

    @Override
    public List<HangSanXuat> findAll() {
        return hangSanXuatRepo.findAll();
    }
}
