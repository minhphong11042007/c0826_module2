package student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    // Đọc danh sách học sinh Khối A từ file txt
    public static List<KhoiA> findAllKhoiA(String filePath) {
        List<KhoiA> list = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 8) {
                    list.add(new KhoiA(
                            data[0].trim(), // mã học sinh
                            data[1].trim(), // họ tên
                            data[2].trim(), // ngày sinh
                            data[3].trim(), // giới tính
                            data[4].trim(), // lớp
                            Double.parseDouble(data[5].trim()), // môn Toán
                            Double.parseDouble(data[6].trim()), // môn Hóa
                            Double.parseDouble(data[7].trim())  // môn Lý
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file Khối A: " + e.getMessage());
        }
        return list;
    }

    // Ghi danh sách học sinh Khối A ra file txt
    public static void saveAllKhoiA(String filePath, List<KhoiA> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (KhoiA st : list) {
                String line = st.getMaHocSinh() + "," + st.getHoTen() + "," +
                        st.getNgaySinh() + "," + st.getGioiTinh() + "," + st.getLop() +
                        "," + st.getMonToan() + "," + st.getMonHoa() + "," + st.getMonLy();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file Khối A: " + e.getMessage());
        }
    }

    // Đọc danh sách học sinh Khối B từ file txt
    public static List<KhoiB> findAllKhoiB(String filePath) {
        List<KhoiB> list = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 8) {
                    list.add(new KhoiB(
                            data[0].trim(), // mã học sinh
                            data[1].trim(), // họ tên
                            data[2].trim(), // ngày sinh
                            data[3].trim(), // giới tính
                            data[4].trim(), // lớp
                            Double.parseDouble(data[5].trim()), // môn Toán
                            Double.parseDouble(data[6].trim()), // môn Hóa
                            Double.parseDouble(data[7].trim())  // môn Sinh
                    ));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi đọc file Khối B: " + e.getMessage());
        }
        return list;
    }

    // Ghi danh sách học sinh Khối B ra file txt
    public static void saveAllKhoiB(String filePath, List<KhoiB> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (KhoiB st : list) {
                String line = st.getMaHocSinh() + "," + st.getHoTen() + "," +
                        st.getNgaySinh() + "," + st.getGioiTinh() + "," + st.getLop() +
                        "," + st.getMonToan() + "," + st.getMonHoa() + "," + st.getMonSinh();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file Khối B: " + e.getMessage());
        }
    }
}