package cn.ssdut.car;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎使用租车系统");
        System.out.println("请输入租车车牌号：");
        Scanner input = new Scanner(System.in);
        String no = input.next();
        System.out.println("请输入租车类型：1.轿车 2.客车");
        switch (input.nextInt()) {
            case 1:
                System.out.println("请输入轿车类型：1.别克商务舱GL8 2.宝马550i 3.别克林荫大道");
                int type = input.nextInt();
                Car c = new Car(no, type);
                System.out.println("请输入租用天数：");
                int days = input.nextInt();
                c.print();
                System.out.println("应付租金=" + c.CalcRent(days));
                break;
            case 2:
                System.out.println("请输入客车所需座位数量：");
                int seatCount = input.nextInt();
                Bus b = new Bus(no, seatCount);
                System.out.println("请输入租用天数：");
                days = input.nextInt();
                b.print();
                System.out.println("应付租金=" + b.CalcRent(days));
                break;
            default:
                System.out.println("错误类型！感谢使用");
                break;
        }
        System.out.println("感谢使用^-^");
    }

}
