package ss8_collection.arraylist;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private String filePath = "ss8_collection/arraylist/product.txt";

    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length == 3) {
                    list.add(new Product(Integer.parseInt(data[0].trim()),
                            data[1].trim(),
                            Double.parseDouble(data[2].trim())));
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void saveAll(List<Product> products) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Product product : products) {
                String line = product.getId() + "," + product.getName() + "," + product.getPrice();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

