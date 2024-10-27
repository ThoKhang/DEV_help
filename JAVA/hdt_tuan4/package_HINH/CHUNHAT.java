package package_HINH;

import java.util.Scanner;

public class CHUNHAT extends HINH {
    public double chieuDai;
    public double chieuRong;
    public Scanner SC;
    public CHUNHAT (){}
    public CHUNHAT (double chieuDai, double chieuRong)
    {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public CHUNHAT (CHUNHAT chunhat)
    {
        this.chieuDai = chunhat.chieuDai;
        this.chieuRong = chunhat.chieuRong;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhap Chieu dai va Chieu rong :");
        chieuDai = SC.nextDouble();
        chieuRong = SC.nextDouble();
    }
    public double tinhChuVi ()
    {
        return (chieuRong+chieuDai)*2;
    }
    public double tinhDienTich ()
    {
        return chieuDai*chieuRong;
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("chu vi: "+tinhChuVi());
        System.out.println("dien tich: "+tinhDienTich());
    }
}
