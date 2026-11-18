package ss9_cleancode.repository;

import ss9_cleancode.entity.XeTai;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XeTaiRepositoryImpl implements IPhuongTienRepository<XeTai> {
    private static final String FILE_PATH = "ss9_cleancode/data/xe_tai.txt";

    @Override
    public List<XeTai> findAll() {
        List<XeTai> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 5) {
                    list.add(new XeTai(
                            data[0].trim(), data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim(),
                            Integer.parseInt(data[4].trim())
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file xe tải: " + e.getMessage());
        }
        return list;
    }

    @Override
    public void saveAll(List<XeTai> list) {
        File file = new File(FILE_PATH);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (XeTai xeTai : list) {
                bw.write(xeTai.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file xe tải: " + e.getMessage());
        }
    }
}