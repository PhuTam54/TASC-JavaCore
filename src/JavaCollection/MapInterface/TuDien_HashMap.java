package JavaCollection.MapInterface;

import java.util.*;

public class TuDien_HashMap {  // key không sắp xếp - no recommend
    private Map<String, String> duLieu = new HashMap<>();
    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa) {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien_HashMap tuDien = new TuDien_HashMap();
        int luaChon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------MENU-------------");
            System.out.println("1. Thêm từ khóa (Key, Value)");
            System.out.println("2. Xóa một từ");
            System.out.println("3. Tra từ");
            System.out.println("4. In ra danh sách từ khóa");
            System.out.println("5. In ra số lượng từ");
            System.out.println("6. Xóa tất cả các từ khóa");
            System.out.println("0. Exit");
            System.out.println("Enter a number (0-6)");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập từ khóa: ");
                    String tuKhoa = sc.nextLine();
                    System.out.println("Nhập ý nghĩa: ");
                    String yNghia = sc.nextLine();
                    tuDien.themTu(tuKhoa, yNghia);
                    System.out.println("Done");
                    break;
                case 2:
                case 3:
                    System.out.println("Nhập từ khóa: ");
                    String tuKhoa2 = sc.nextLine();
                    if (luaChon == 2) {
                        tuDien.xoaTu(tuKhoa2);
                    } else {
                        System.out.println("Ý nghĩa của " + tuKhoa2 + " là: " + tuDien.traTu(tuKhoa2));
                    }
                    break;
                case 4:
                    tuDien.inTuKhoa();
                    break;
                case 5:
                    System.out.println(tuDien.laySoLuong());
                    break;
                case 6:
                    tuDien.xoaTatCa();
                    break;
            }

        } while(luaChon != 0);
    }




















}
