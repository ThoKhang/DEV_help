package package_HINH;

import java.util.ArrayList;
import java.util.Scanner;

public class DANHSACH {
        private ArrayList<HINH> DSHinh = new ArrayList<>();
        public DANHSACH()
        {
            this.DSHinh = new ArrayList<>();
        }
        public DANHSACH (ArrayList<HINH> DSHinh)
        {
            this.DSHinh = DSHinh;
        }
        public void themHinh (HINH hinh)
        {
            this.DSHinh.add(hinh);
        }
        public void Nhap ()
        {
            Scanner SC = new Scanner(System.in);
            String kiemTra;
            int dem = 0;
                do {
                    System.out.println("Day la lan nhap hinh o vi tri danh sach thu "+ dem);
                    System.out.println("vui long nhap hinh muon nhap (T cho Tron, G cho tam giac, C cho Chu nhat, end de ket thuc: ");
                    kiemTra = SC.nextLine();
                    switch (kiemTra){
                        case "T":
                            HINH Tron = new TRON();
                            Tron.Nhap();
                            this.DSHinh.add(Tron);
                            break;
                        case "C":
                            HINH chuNhat = new CHUNHAT();
                            chuNhat.Nhap();
                            this.DSHinh.add(chuNhat);
                            break;
                        case "G":
                            HINH tamGiac = new TAMGIAC();
                            tamGiac.Nhap();
                            this.DSHinh.add(tamGiac);
                            break;
                        case "end":
                            System.out.println("ket thuc!");
                            System.out.println("---------------");
                        default:
                            System.out.println("khong hop le! ");
                            break;
                    }
                    dem = dem +1;
                }
                while(kiemTra.equals("end")==false);
        }
        public double tongChuVi()
        {
            double tong = 0;
            for (int i=0;i< DSHinh.size();i++)
                tong += DSHinh.get(i).tinhChuVi();
            return tong;
        }
        public void Xuat ()
        {
            Scanner SC = new Scanner(System.in);
            int yeuCau;
            do
            {
                System.out.println("Vui long nhap yeu cau can lam");
                System.out.println("1. De xuat gia tri cua hinh yeu cau");
                System.out.println("2. De xuat toan bo hinh trong danh sach");
                System.out.println("3. De thong ke so hinh dang co");
                System.out.println("4. De tinh tong chu vi tat ca cac hinh");
                System.out.println("5. De ket thuc");
                yeuCau = SC.nextInt();
                int kiemTra;
                int count = DSHinh.size();

                switch (yeuCau)
                {
                    case 1:
                        System.out.println(count);
                        System.out.println("Nhap vi tri hinh can xuat: ");
                        kiemTra = SC.nextInt();
                        if (kiemTra< count)
                            DSHinh.get(kiemTra).Xuat();
                        else
                            System.out.println("khong hop le!");
                        break;
                    case 2:
                        for (HINH hinh:DSHinh)
                            hinh.Xuat();
                        break;
                    case 3:
                        int counttamGiac=0;
                        int countTron=0;
                        int countChuNhat=0;
                        for(int i=0;i<count;i++)
                            if (this.DSHinh.get(i) instanceof TAMGIAC)
                                counttamGiac +=1;
                            else if (this.DSHinh.get(i) instanceof TRON)
                                countTron +=1;
                            else
                                countChuNhat +=1;
                        System.out.println("Tong so hinh tron:"+countTron);
                        System.out.println("Tong so hinh chu nhat: "+countChuNhat);
                        System.out.println("Tong so hinh Tam giac: "+counttamGiac);
                        break;
                    case 4:
                        System.out.println("tong chu vi cua toan bo hinh: "+tongChuVi());
                        break;
                    case 5:
                        System.out.println("---------");
                        break;
                    default:
                        System.out.println("khong hop le!");
                        break;
                }
            }
            while(yeuCau != 5);


        }
}
