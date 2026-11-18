package ss9_cleancode.service;

import ss9_cleancode.entity.XeTai;
import ss9_cleancode.repository.XeTaiRepositoryImpl;

public class XeTaiServiceImpl extends PhuongTienServiceImpl<XeTai> implements IXeTaiService {
    public XeTaiServiceImpl() {
        super(new XeTaiRepositoryImpl());
    }
}