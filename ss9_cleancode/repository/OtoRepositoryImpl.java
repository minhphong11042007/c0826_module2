package ss9_cleancode.repository;

import ss9_cleancode.entity.Oto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OtoRepositoryImpl implements IPhuongTienRepository<Oto> {
    private static final String FILE_PATH = "ss9_cleancode/data/oto.txt";

    @Override
    public List<Oto> findAll() {
        List<Oto> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 6) {
                    list.add(new Oto(
                            data[0].trim(), data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim(),
                            Integer.parseInt(data[4].trim()),
                            data[5].trim()
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file ô tô: " + e.getMessage());
        }
        return list;
    }

    @Override
    public void saveAll(List<Oto> list) {
        File file = new File(FILE_PATH);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Oto oto : list) {
                bw.write(oto.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file ô tô: " + e.getMessage());
        }
    }
}