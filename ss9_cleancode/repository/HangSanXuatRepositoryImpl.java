package ss9_cleancode.repository;

import ss9_cleancode.entity.HangSanXuat;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HangSanXuatRepositoryImpl implements IHangSanXuatRepository {
    private static final String FILE_PATH = "src/ss9_cleancode/data/hangsanxuat.csv";

    @Override
    public List<HangSanXuat> findAll() {
        List<HangSanXuat> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            list.add(new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"));
            list.add(new HangSanXuat("HSX-002", "Honda", "Nhật Bản"));
            list.add(new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"));
            list.add(new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"));
            list.add(new HangSanXuat("HSX-005", "Ford", "Mỹ"));
            list.add(new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"));
            list.add(new HangSanXuat("HSX-007", "Hino", "Nhật Bản"));
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 3) {
                    list.add(new HangSanXuat(data[0].trim(), data[1].trim(), data[2].trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file hãng sản xuất: " + e.getMessage());
        }
        return list;
    }
}