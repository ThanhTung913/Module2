package OPP;

public class DemoHinhTron {

    public static void main(String[] args) {
       HinhTron hinhTron = new HinhTron();
//       Khởi tạo đối tượng hình tròn trong lớp Hình tròn
       hinhTron.setBanKinh(4);
//       set bán kính cho hình tròn
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi của hình tròn là : " + chuVi);
        System.out.println("Dien tích của hình trỏn là : " + dienTich);
    }
}


class HinhTron {
    private final float PI = 3.14f;
    private float banKinh;

    public float getBanKinh(){
        return banKinh;
    }
    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }
    public float tinhChuVi(){
        return 2*PI*banKinh;
    }
    public float tinhDienTich(){
        return PI * banKinh * banKinh;
    }
}

