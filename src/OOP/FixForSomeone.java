//package OOP;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class FixForSomeone {
//
//    public class Sinhvien{
//        private String HoTen;
//        private String Diachi;
//        private String Mssv;
//        private double DTB;
//        private int Ttc;
//
//        public Sinhvien(String HoTen, String Diachi,String Mssv,double DTB,int Ttc){
//            this.HoTen=HoTen;
//            this.Diachi=Diachi;
//            this.Mssv=Mssv;
//            this.DTB=DTB;
//            this.Ttc=Ttc;
//
//        }
//        public String gethoten(){
//            return HoTen;
//        }
//        public String getMssv(){
//            return Mssv;
//        }
//        public String getDiachi(){
//            return Diachi;
//        }
//        public double getDTB(){
//            return DTB;
//        }
//        public int getttc(){
//            return Ttc;
//        }
//        public void setDiachi(String Diachi){
//            this.Diachi=Diachi;
//        }
//        public boolean xetTotNghiep() {
//            return false;
//        }
//    }
//    public static class SvCD extends Sinhvien{
//        private double diemTN;
//        public SvCD(String HoTen, String Diachi,String Mssv,double DTB,int Ttc,double diemTN){
//            super(HoTen, Diachi,Mssv, DTB, Ttc);
//            this.diemTN=diemTN;
//        }
//        public double getDiemTN(){
//            return diemTN;
//        }
//        public boolean xetTotNghiep() {
//            return (getttc()>=120 && getDTB()>=5 && getDiemTN()>=5);
//        }
//
//    }
//    public static class SvDH extends Sinhvien{
//        private String TenLV;
//        private double DiemLV;
//        public SvDH(String HoTen, String Diachi,String Mssv,String TenLV,double DTB,double DiemLV,int Ttc){
//            super(HoTen, Diachi,Mssv, DTB, Ttc);
//            this.DiemLV=DiemLV;
//            this.TenLV=TenLV;
//        }
//        public double getDiemLV(){
//            return DiemLV;
//        }
//        public String getTenLV(){
//            return TenLV;
//        }
//        public boolean xetTotNghiep() {
//            return (getttc()>=170 && getDTB()>=5 && getDiemLV()>=5);
//        }
//    }
//
//    public class oops {
//        public static void NhapTTSV(ArrayList<Sinhvien> DSSV) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Nhap so luong SV: ");
//            int n = sc.nextInt();
//            sc.nextLine();
//            String Hoten, Diachi, Mssv;
//            int Ttc,loaiSV;
//            double DTB,diemTN,DiemLV;
//            for (int i = 0; i < n; i++) {
//                System.out.println("Nhập thông tin sinh viên:");
//                System.out.print("Tên: ");
//                Hoten = sc.nextLine();
//                System.out.print("Địa chỉ: ");
//                Diachi = sc.nextLine();
//                System.out.println("MSSV: ");
//                Mssv = sc.nextLine();
//                System.out.print("Tổng số tín chỉ: ");
//                Ttc = sc.nextInt();
//                System.out.print("Điểm trung bình: ");
//                DTB = sc.nextDouble();
//                sc.nextLine();
//                System.out.println("Chọn loại sinh viên (\n1: Cao Đẳng, \n2: Đại Học): ");
//                loaiSV = sc.nextInt();
//                sc.nextLine();
//
//                if (loaiSV == 1) {
//                    System.out.print("Điểm thi tốt nghiệp: ");
//                    diemTN = sc.nextDouble();
//                    sc.nextLine();
//                    DSSV.add(new SvCD(Hoten,Diachi,Mssv,DTB,Ttc,diemTN));
//                } else if (loaiSV == 2) {
//                    System.out.print("Điểm luận văn: ");
//                    DiemLV = sc.nextDouble();
//                    sc.nextLine();
//                        DSSV.add(new SvDH(Hoten, Diachi, Mssv, "" , DTB, DiemLV, Ttc));
//                } else {
//                    System.out.println("Lựa chọn không hợp lệ.");
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            ArrayList<Sinhvien> DSSV = new ArrayList<>(100);
//
//            int chon;
//            do{
//                System.out.println("\n1:Sv Cao Dang:");
//                System.out.println("\n2:Sv Dai Hoc:");
//                chon=sc.nextInt();
//                sc.nextLine();
//                switch(chon){
//                    case 1:
//                        NhapTTSV(DSSV);
//
//                        break;
//                    case 2:
//                        NhapTTSV(DSSV);
//                        break;
//                    default:
//                        System.out.println("Lựa chọn không hợp lệ.");
//                }
//
//
//            }while(false);
//            System.out.println("\nSinh viên CD đủ điều kiện tốt nghiệp:");
//            for (Sinhvien sv : DSSV) {
//                if (sv.xetTotNghiep()) {
//                    System.out.println("Tên: " + sv.gethoten() + ", MSSV: " + sv.getMssv());
//                }
//            }
//        }
//    }
//}
