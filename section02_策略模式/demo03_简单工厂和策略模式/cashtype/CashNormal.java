package section02_策略模式.demo03_简单工厂和策略模式.cashtype;

import section02_策略模式.demo03_简单工厂和策略模式.CashSuper;

/**
 * @description: 正常收费类
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashNormal extends CashSuper {


    @Override
    public double acceptCash(double price, double num) {
        return price * num;
    }

}
