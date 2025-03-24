package section02_策略模式.demo01_简单工厂实现收银软件.cashtype;

import section02_策略模式.demo01_简单工厂实现收银软件.CashSuper;

/**
 * @description: 返利模式类
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashReturn extends CashSuper {

    private double condition = 0d; // 返利门槛
    private double moneyReturn = 0d; // 返利金额

    public CashReturn(double condition, double moneyReturn) {
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }

    // 收费方式重写
    public double acceptCash(double price, double num) {
        // 计算金额
        double result = price * num;
        if (condition > 0 && result >= condition) {
            // 商 向下取整 * 返利金额
            result -= Math.floor(result / condition) * moneyReturn;
        }
        return result;
    }

}
