package lop;

public class main {
    public static void main(String[] args) {
        hinhtron t1=new hinhtron();
        t1.setR(2);
        t1.xuat();
        hinhtron t2=new hinhtron();
        t2.nhap();
        t2.xuat();
        hinhtron t3=new hinhtron(10);
        t3.xuat();
        hinhtron t4=new hinhtron(t3);
        t4.xuat();
    }
}
