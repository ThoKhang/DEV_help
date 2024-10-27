package package_HINH;

import java.util.Scanner;

public class TRON extends  HINH{
    public double R;
    public TRON (){}
    public TRON (double R)
    {
        this.R = R;
    }
    public TRON (TRON tron)
    {
        this.R = tron.R;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner SC = new Scanner(System.in);
        System.out.println("Vui long nhap ban kinh R:  ");
        this.R = SC.nextDouble();
    }
    public double tinhChuVi()
    {
        return 3.14*R*2;
    }
    public double tinhDienTich()
    {
        return 3.14*R*R;
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chu vi: "+tinhChuVi());
        System.out.println("Dien tich: "+tinhDienTich());
    }
}
