package package_HINH;

import java.util.Scanner;
import java.lang.Math;
public class TAMGIAC extends  HINH{
    public double A;
    public double B;
    public double C;
    public Scanner SC;
    public TAMGIAC(){}
    public TAMGIAC(double A, double B, double C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        Scanner SC = new Scanner(System.in);
        System.out.println("Vui long nhap lan luot 3 canh A,B,C cua 1 tam giac");
        int a = SC.nextInt();
        int b = SC.nextInt();
        int c = SC.nextInt();
        if (a  + b  > c  && a  + c  > b  && b  + c  > a ) {
            this.A = a;
            this.B = b;
            this.C = c;
        }
        else
            System.out.println("Khong phai la ba canh cua tam giac!");
    }
    public double tinhChuVi ()
    {
        return A+B+C;
    }
    public double tinhDienTich()
    {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Canh A: "+this.A);
        System.out.println("Canh B: "+this.B);
        System.out.println("Canh C: "+this.C);
        System.out.println("Chu vi:"+tinhChuVi());
        System.out.println("Dien tich: "+tinhDienTich());
    }


}
