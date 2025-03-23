package section01_简单工厂模式;

import section01_简单工厂模式.opearate.Add;
import section01_简单工厂模式.opearate.Div;
import section01_简单工厂模式.opearate.Mul;
import section01_简单工厂模式.opearate.Sub;

/**
 * @description: 操作简单工厂
 * @author: zhqihang
 * @date: 2025/03/19
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        // 多态的体现 编译看左边 运行看右边
        // 只要左边的类能编译通过就不会报错。但是运行时按照右边的类实际情况来
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
        }
        return oper;
    }

}
