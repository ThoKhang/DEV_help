package package_HINH;
import java.util.Scanner;
abstract public class HINH {
    public String tenhinh;
    public Scanner SC;
    public HINH (){}
    public void Nhap()
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("vui long nhap ten hinh");
        this.tenhinh = SC.nextLine();
    }
    public void setTenhinh(String tenhinh)
    {
        this.tenhinh = tenhinh;
    }
    public void Xuat()
    {
        System.out.println("Hinh nay la Hinh "+this.tenhinh+ "!");
    }
    abstract public double tinhChuVi();
    abstract public double tinhDienTich();
}
