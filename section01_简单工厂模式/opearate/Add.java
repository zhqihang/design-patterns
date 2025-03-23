package section01_简单工厂模式.opearate;

import section01_简单工厂模式.Operation;

/**
 * @description: 加法操作实现
 * @author: zhqihang
 * @date: 2025/03/19
 */
public class Add extends Operation {

    @Override
    public double getResult(double numA, double numB) {
        return numA + numB;
    }

}
