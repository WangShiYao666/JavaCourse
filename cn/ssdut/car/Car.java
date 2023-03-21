package cn.ssdut.car;

/**
 * Car 小轿车类
 */
public final class Car extends MotoVehicle {

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type; //型号

    public Car(String no, int type) {
        setNo(no);
        this.type = type;
        switch (this.type) {
            case 1:
                setBrand("别克商务舱GL8");
                break;
            case 2:
                setBrand("宝马550i");
                break;
            case 3:
                setBrand("别克林荫大道");
                break;
            default:
                System.out.println("类型出错");
                setBrand("");
                break;
        }
    }

    public int CalcRent(int days) {
        int rent = 0;
        switch (this.type) {
            case 1:
                rent = 600 * days;
                break;
            case 2:
                rent = 500 * days;
                break;
            case 3:
                rent = 300 * days;
                break;
            default:
                System.out.println("类型出错");
                break;

        }
        return rent;
    }

    public void print(){
        System.out.println("租用车辆信息为 车牌号:"+getNo() + " 颜色："+getColor() +" 品牌："+getBrand()+" 里程："+getMileage());
    }
}
