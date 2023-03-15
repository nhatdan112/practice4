/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac;

/**
 *
 * @author nhatm
 */
import java.util.Date;
public class Prac {

    /**
     * @param args the command line arguments
     */
    
    public class hoaqua{
        public String nguongoc;
        public int soluong;
        
        public String getNguongoc() {
            return nguongoc;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
        }
        public hoaqua(){}
        public hoaqua(String nguongoc, int soluong) {
            this.nguongoc = nguongoc;
            this.soluong = soluong;
        }

        @Override
        public String toString() {
            return "hoaqua{" + "nguongoc=" + nguongoc + ", soluong=" + soluong + '}';
        }
       
    }
    public class quatao extends hoaqua {
        public double gia;

        public double getGia() {
            return gia;
        }

        public void setGia(double gia) {
            this.gia = gia;
        }
        public quatao(){};
            public quatao(String nguongoc, int soluong ,double gia) {
                super(nguongoc, soluong);
                this.gia=gia;
            }

        @Override
        public String toString() {
            return "quatao{" + "gia=" + gia + '}';
        }
    }
            public class quacam extends hoaqua{
                public double doanhthu;

            public double getDoanhthu() {
                return doanhthu;
            }

            public void setDoanhthu(double doanhthu) {
                this.doanhthu = doanhthu;
            }
                public quacam(){}
            public quacam(String nguongoc, int soluong ,double doanhthu) {
                super(nguongoc,soluong);
                this.doanhthu=doanhthu;
            }

            @Override
            public String toString() {
                return "quacam{" + "doanhthu=" + doanhthu + '}';
            }
            }
                public class camcaophong extends quacam{
                    public Date ngaynhap;
                public camcaophong(){};
                public Date getNgaynhap() {
                    return ngaynhap;
                }

                public void setNgaynhap(Date ngaynhap) {
                    this.ngaynhap = ngaynhap;
                }
                    
                public camcaophong(String nguongoc, int soluong, double doanhthu,Date ngaynhap) {
                    super(nguongoc, soluong, doanhthu);
                    this.ngaynhap=ngaynhap;
                }

                @Override
                public String toString() {
                    return "camcaophong{" + "ngaynhap=" + ngaynhap + '}';
                }
                }
                   public class camsanh extends quacam{
                       public Date ngayban;
                       public camsanh(){}

                public Date getNgayban() {
                    return ngayban;
                }

                public void setNgayban(Date ngayban) {
                    this.ngayban = ngayban;
                }

                public camsanh(Date ngayban, String nguongoc, int soluong, double doanhthu) {
                    super(nguongoc, soluong, doanhthu);
                    this.ngayban = ngayban;
                }

                @Override
                public String toString() {
                    return "camsanh{" + "ngayban=" + ngayban + '}';
                }
                       
                   } 

            
            
    public void main(String[] args) {
        hoaqua a= new hoaqua();
        a.getNguongoc();
        a.getSoluong();
        a.toString();
        quatao b = new quatao();
        b.getGia();
        b.setGia(0);
        b.toString();
        quacam c=new quacam();
        c.getDoanhthu();
        c.setDoanhthu(0);;
        c.toString();
        camcaophong d = new camcaophong();
        d.getNgaynhap();
        Date ngaynhap = null;
        d.setNgaynhap(ngaynhap);
        d.toString();
        camsanh e =new camsanh();
        e.getNgayban();
        Date ngayban=null;
        e.setNgayban(ngayban);
        e.toString();
    }
    
}
