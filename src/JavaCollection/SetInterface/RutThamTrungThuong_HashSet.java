package JavaCollection.SetInterface;

import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieu = new HashSet<>();

    public RutThamTrungThuong_HashSet() {
    }

    public void themPhieu(String giaTri) {
        this.thungPhieu.add(giaTri);
    }
    public void xoaPhieu(String giaTri) {
        this.thungPhieu.remove(giaTri);
    }
    public boolean kiemTraTonTai(String giaTri) {
        return this.thungPhieu.contains(giaTri);
    }
    public void xoaTatCaPhieu() {
        this.thungPhieu.clear();
    }
    public int laySoLuong() {
        return this.thungPhieu.size();
    }
    public String rutMotPhieu() {
        String ketQua;
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieu.size());
        ketQua = (String) this.thungPhieu.toArray()[viTri];
        return ketQua;
    }
    public void inTatCaPhieu() {
        System.out.println(Arrays.toString(this.thungPhieu.toArray()));
    }
    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        do {
            System.out.println("------------MENU-------------");
            System.out.println("1. Them ma so phieu");
            System.out.println("2. Xoa mot ma so phieu");
            System.out.println("3. Kiem tra ton tai ma so phieu");
            System.out.println("4. Xoa tat ca ma so phieu");
            System.out.println("5. So luong ma so phieu");
            System.out.println("6. Rut tham trung thuong");
            System.out.println("7. In tat ca phieu");
            System.out.println("0. Exit");
            System.out.println("Enter a number (0-6)");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Nhap ma so phieu: ");
                    String giaTri = sc.nextLine();
                    if (luaChon == 1) {
                        rt.themPhieu(giaTri);
                    } else if (luaChon == 2) {
                        rt.xoaPhieu(giaTri);
                    } else {
                        System.out.println(rt.kiemTraTonTai(giaTri));
                    }
                    break;
                case 4:
                    rt.xoaTatCaPhieu();
                    break;
                case 5:
                    System.out.println(rt.laySoLuong());
                    break;
                case 6:
                    System.out.println(rt.rutMotPhieu());
                    break;
                case 7:
                    rt.inTatCaPhieu();
                    break;
            }

        } while(luaChon != 0);
    }
}
