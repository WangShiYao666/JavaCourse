package cn.ssdut.car;

/**
 * 客车类
 */
public final class Bus extends MotoVehicle {
    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    private int seatCount;  //座位数

    public Bus(String no, int seatCount) {
        this.seatCount = seatCount;
        setNo(no);
        if (seatCount > 16) {
            setBrand("金龙");
        } else {
            setBrand("金杯");
        }
    }

    public int CalcRent(int days) {
        int rent = 0;
        if(seatCount > 16) {
            rent = 1500 * days;
        }
        else{
            rent = 800 * days;
        }
        return rent;
    }

    public void print(){
        System.out.println("租用车辆信息为 车牌号:"+getNo() + " 颜色："+getColor() +" 品牌："+getBrand()+" 里程："+getMileage()+ " 座位数："+seatCount);
    }

}
