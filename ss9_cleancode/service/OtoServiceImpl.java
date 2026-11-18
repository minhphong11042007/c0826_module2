package ss9_cleancode.service;

import ss9_cleancode.entity.Oto;
import ss9_cleancode.repository.OtoRepositoryImpl;

public class OtoServiceImpl extends PhuongTienServiceImpl<Oto> implements IOtoService {
    public OtoServiceImpl() {
        super(new OtoRepositoryImpl());
    }
}