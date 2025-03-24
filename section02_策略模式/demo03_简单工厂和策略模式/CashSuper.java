package section02_策略模式.demo03_简单工厂和策略模式;

/**
 * @description: 收费抽象类
 * @author: zhqihang
 * @date: 2025/03/24
 */
public abstract class CashSuper {

    // 收取总费用的方法 总费用 = 单价 * 数量
    public abstract double acceptCash(double price, double num);

}
