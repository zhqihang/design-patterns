package section01_简单工厂模式;

/**
 * @description: 算法操作抽象类
 * @author: zhqihang
 * @date: 2025/03/19
 */
public abstract class Operation {

    /**
     * 获取两个操作数的计算结果
     *
     * @param numA 操作数1
     * @param numB 操作数2
     * @return 计算结果
     */
    public abstract double getResult(double numA, double numB);
}