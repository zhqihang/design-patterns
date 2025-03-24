package section02_策略模式.demo01_简单工厂实现收银软件.cashtype;

import section02_策略模式.demo01_简单工厂实现收银软件.CashSuper;

/**
 * @description: 打折收费类
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashRebate extends CashSuper {

    private double rebate = 1d;

    // 构造函数注入折扣
    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double price, double num) {
        return price * num * rebate;
    }

}
