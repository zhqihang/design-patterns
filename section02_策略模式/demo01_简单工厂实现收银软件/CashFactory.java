package section02_策略模式.demo01_简单工厂实现收银软件;

import section02_策略模式.demo01_简单工厂实现收银软件.cashtype.CashNormal;
import section02_策略模式.demo01_简单工厂实现收银软件.cashtype.CashRebate;
import section02_策略模式.demo01_简单工厂实现收银软件.cashtype.CashReturn;

/**
 * @description: 收费工厂类
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashFactory {

    public static CashSuper createCashAccept(int cashType) {
        CashSuper cs = null;
        switch (cashType) {
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashRebate(0.8d);
                break;
            case 3:
                cs = new CashRebate(0.7d);
                break;
            case 4:
                cs = new CashReturn(300d, 100d);
                break;
        }
        return cs;
    }
}
