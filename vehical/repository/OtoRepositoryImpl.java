package vehical.repository;

import vehical.entity.Oto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OtoRepositoryImpl implements IPhuongTienRepository<Oto> {
    private final String FILE_PATH = "oto.csv";

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
                    list.add(new Oto(data[0].trim(), data[1].trim(),
                            Integer.parseInt(data[2].trim()),
                            data[3].trim(),
                            Integer.parseInt(data[4].trim()),
                            data[5].trim()));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file ô tô: " + e.getMessage());
        }
        return list;
    }

    @Override
    public void saveAll(List<Oto> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Oto oto : list) {
                String line = oto.getBienKiemSoat() + "," + oto.getHangSanXuat() + "," +
                        oto.getNamSanXuat() + "," + oto.getChuSoHuu() + "," +
                        oto.getSoChoNgoi() + "," + oto.getKieuXe();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file ô tô: " + e.getMessage());
        }
    }
}
