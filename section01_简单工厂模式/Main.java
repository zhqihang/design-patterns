package section01_简单工厂模式;

import java.util.Scanner;

/**
 * @description: 简单工厂模式实现计算器
 * @author: zhqihang
 * @date: 2025/03/19
 */
public class Main {

    public static void main(String[] args) {

        try {
            //处理输入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("请选择运算符号(+、-、*、/)：");
            String strOperate = sc.nextLine();
            System.out.println("请输入数字B：");
            double numberB = Double.parseDouble(sc.nextLine());

            // 这里根据输入的 strOperate 去创建对应的操作类
            Operation oper = OperationFactory.createOperate(strOperate);

            double result = oper.getResult(numberA, numberB);

            System.out.println("结果是：" + result);
        } catch (Exception e) {
            // System.out.println("您的输入有错：" + e.toString());
            System.out.println("您的输入有错");
        }
    }

}
