package cn.ssdut.car;

/**
 * MotoVehicle类 机动车
 */
public abstract class MotoVehicle {
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    private String no;  //车牌号

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand; //品牌

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color = "白色";  //颜色

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    private int mileage = 100;  //里程

    public abstract int CalcRent(int days);  //计算租金

    public abstract void print(); //输出车辆信息
}
