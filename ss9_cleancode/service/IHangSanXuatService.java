package ss9_cleancode.service;

import ss9_cleancode.entity.HangSanXuat;
import java.util.List;

public interface IHangSanXuatService {
    List<HangSanXuat> findAll();
}