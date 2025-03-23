package section01_简单工厂模式.opearate;

import section01_简单工厂模式.Operation;

/**
 * @description: 除法运算
 * @author: zhqihang
 * @date: 2025/03/19
 */
public class Div extends Operation {

    @Override
    public double getResult(double numA, double numB) {
        if (numB == 0) {
            System.out.println("除数不能为0！");
            throw new ArithmeticException(); // 算术异常
        }
        return numA / numB;
    }

}
