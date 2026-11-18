package ss9_cleancode.service;

import ss9_cleancode.entity.XeMay;
import ss9_cleancode.repository.XeMayRepositoryImpl;

public class XeMayServiceImpl extends PhuongTienServiceImpl<XeMay> implements IXeMayService {
    public XeMayServiceImpl() {
        super(new XeMayRepositoryImpl());
    }
}