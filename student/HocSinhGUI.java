package student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HocSinhGUI extends JFrame {
    private DanhSachHocSinh quanLy;

    // Các đường dẫn file mặc định
    private final String PATH_KHOI_A = "khoiA.txt";
    private final String PATH_KHOI_B = "khoiB.txt";

    // Components
    private JTable table;
    private DefaultTableModel tableModel;

    private JTextField txtMaHS, txtHoTen, txtNgaySinh, txtLop, txtToan, txtHoa, txtMonThu3;
    private JComboBox<String> cbGioiTinh, cbKhoi;
    private JLabel lblMonThu3;

    public HocSinhGUI() {
        quanLy = new DanhSachHocSinh();

        setTitle("Quản Lý Học Sinh Khối A & B");
        setSize(950, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 1. Panel Form Nhập Liệu (North & West)
        JPanel panelInput = new JPanel(new GridLayout(9, 2, 8, 8));
        panelInput.setBorder(BorderFactory.createTitledBorder("Thông tin học sinh"));

        panelInput.add(new JLabel("Khối:"));
        cbKhoi = new JComboBox<>(new String[]{"Khối A", "Khối B"});
        panelInput.add(cbKhoi);

        panelInput.add(new JLabel("Mã học sinh:"));
        txtMaHS = new JTextField();
        panelInput.add(txtMaHS);

        panelInput.add(new JLabel("Họ và tên:"));
        txtHoTen = new JTextField();
        panelInput.add(txtHoTen);

        panelInput.add(new JLabel("Ngày sinh (dd/mm/yyyy):"));
        txtNgaySinh = new JTextField();
        panelInput.add(txtNgaySinh);

        panelInput.add(new JLabel("Giới tính:"));
        cbGioiTinh = new JComboBox<>(new String[]{"Nam", "Nữ"});
        panelInput.add(cbGioiTinh);

        panelInput.add(new JLabel("Lớp:"));
        txtLop = new JTextField();
        panelInput.add(txtLop);

        panelInput.add(new JLabel("Điểm Toán:"));
        txtToan = new JTextField();
        panelInput.add(txtToan);

        panelInput.add(new JLabel("Điểm Hóa:"));
        txtHoa = new JTextField();
        panelInput.add(txtHoa);

        lblMonThu3 = new JLabel("Điểm Lý:");
        txtMonThu3 = new JTextField();
        panelInput.add(lblMonThu3);
        panelInput.add(txtMonThu3);

        // 2. Panel Chức năng / Chứa các Button (South)
        JPanel panelButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JButton btnDocFile = new JButton("Đọc File");
        JButton btnGhiFile = new JButton("Ghi File");
        JButton btnThem = new JButton("Thêm HS");
        JButton btnXoa = new JButton("Xóa theo Mã");
        JButton btnLamMoi = new JButton("Làm mới Form");

        panelButtons.add(btnDocFile);
        panelButtons.add(btnGhiFile);
        panelButtons.add(btnThem);
        panelButtons.add(btnXoa);
        panelButtons.add(btnLamMoi);

        // 3. JTable (Center)
        String[] columnNames = {"Mã HS", "Họ Tên", "Ngày Sinh", "Giới Tính", "Lớp", "Khối", "Toán", "Hóa", "Lý/Sinh", "ĐTB"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Đưa các Panel vào Frame
        add(panelInput, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

        // Sự kiện chuyển khối đổi nhãn môn thứ 3 (Lý -> Sinh)
        cbKhoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbKhoi.getSelectedItem().equals("Khối A")) {
                    lblMonThu3.setText("Điểm Lý:");
                } else {
                    lblMonThu3.setText("Điểm Sinh:");
                }
            }
        });

        // Xử lý sự kiện các nút bấm
        btnDocFile.addActionListener(e -> docFile());
        btnGhiFile.addActionListener(e -> ghiFile());
        btnThem.addActionListener(e -> themHocSinh());
        btnXoa.addActionListener(e -> xoaHocSinh());
        btnLamMoi.addActionListener(e -> xoaForm());
    }

    // Hiển thị danh sách lên JTable
    private void hienThiTable() {
        tableModel.setRowCount(0);
        List<HocSinh> list = quanLy.getDanhSach();
        for (HocSinh hs : list) {
            String khoi = (hs instanceof KhoiA) ? "A" : "B";
            double monThu3 = (hs instanceof KhoiA) ? ((KhoiA) hs).getMonLy() : ((KhoiB) hs).getMonSinh();

            Object[] row = {
                    hs.getMaHocSinh(),
                    hs.getHoTen(),
                    hs.getNgaySinh(),
                    hs.getGioiTinh(),
                    hs.getLop(),
                    khoi,
                    hs.getMonToan(),
                    hs.getMonHoa(),
                    monThu3,
                    String.format("%.2f", hs.getDiemTrungBinh())
            };
            tableModel.addRow(row);
        }
    }

    private void docFile() {
        quanLy.docTuFile(PATH_KHOI_A, PATH_KHOI_B);
        hienThiTable();
        JOptionPane.showMessageDialog(this, "Đọc dữ liệu từ file thành công!");
    }

    private void ghiFile() {
        quanLy.ghiRaFile(PATH_KHOI_A, PATH_KHOI_B);
        JOptionPane.showMessageDialog(this, "Ghi dữ liệu ra file thành công!");
    }

    private void themHocSinh() {
        try {
            String ma = txtMaHS.getText().trim();
            String ten = txtHoTen.getText().trim();
            String ns = txtNgaySinh.getText().trim();
            String gt = cbGioiTinh.getSelectedItem().toString();
            String lop = txtLop.getText().trim();

            if (ma.isEmpty() || ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin bắt buộc!");
                return;
            }

            double toan = Double.parseDouble(txtToan.getText().trim());
            double hoa = Double.parseDouble(txtHoa.getText().trim());
            double monThu3 = Double.parseDouble(txtMonThu3.getText().trim());

            HocSinh hs;
            if (cbKhoi.getSelectedItem().equals("Khối A")) {
                hs = new KhoiA(ma, ten, ns, gt, lop, toan, hoa, monThu3);
            } else {
                hs = new KhoiB(ma, ten, ns, gt, lop, toan, hoa, monThu3);
            }

            if (quanLy.themHocSinh(hs)) {
                hienThiTable();
                xoaForm();
                JOptionPane.showMessageDialog(this, "Thêm học sinh thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Mã học sinh đã tồn tại!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số hợp lệ!");
        }
    }

    private void xoaHocSinh() {
        String ma = txtMaHS.getText().trim();
        int selectedRow = table.getSelectedRow();

        if (ma.isEmpty() && selectedRow != -1) {
            ma = tableModel.getValueAt(selectedRow, 0).toString();
        }

        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mã HS hoặc chọn 1 dòng trên bảng để xóa!");
            return;
        }

        if (quanLy.xoaHocSinhTheoMa(ma)) {
            hienThiTable();
            xoaForm();
            JOptionPane.showMessageDialog(this, "Xóa học sinh thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã học sinh: " + ma);
        }
    }

    private void xoaForm() {
        txtMaHS.setText("");
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtLop.setText("");
        txtToan.setText("");
        txtHoa.setText("");
        txtMonThu3.setText("");
        txtMaHS.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HocSinhGUI().setVisible(true);
        });
    }
}