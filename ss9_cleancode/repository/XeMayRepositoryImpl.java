package ss9_cleancode.repository;

import ss9_cleancode.entity.XeMay;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XeMayRepositoryImpl implements IPhuongTienRepository<XeMay> {
    private static final String FILE_PATH = "ss9_cleancode/data/xe_may.txt";

    @Override
    public List<XeMay> findAll() {
        List<XeMay> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 5) {
                    list.add(new XeMay(
                            data[0].trim(), data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim(),
                            Integer.parseInt(data[4].trim())
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file xe máy: " + e.getMessage());
        }
        return list;
    }

    @Override
    public void saveAll(List<XeMay> list) {
        File file = new File(FILE_PATH);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (XeMay xeMay : list) {
                bw.write(xeMay.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file xe máy: " + e.getMessage());
        }
    }
}