package section01_简单工厂模式.opearate;

import section01_简单工厂模式.Operation;

/**
 * @description: 减法操作实现
 * @author: zhqihang
 * @date: 2025/03/19
 */
public class Sub extends Operation {

    @Override
    public double getResult(double numA, double numB) {
        return numA - numB;
    }

}
