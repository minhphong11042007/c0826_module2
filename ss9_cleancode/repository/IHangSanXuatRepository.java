package ss9_cleancode.repository;

import ss9_cleancode.entity.HangSanXuat;
import java.util.List;

public interface IHangSanXuatRepository {
    List<HangSanXuat> findAll();
}