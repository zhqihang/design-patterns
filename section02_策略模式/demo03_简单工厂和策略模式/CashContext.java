package section02_策略模式.demo03_简单工厂和策略模式;

import section02_策略模式.demo03_简单工厂和策略模式.cashtype.*;

/**
 * @description: TODO
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashContext {


    private CashSuper cs;   // 声明一个CashSuper对象

    // 通过构造方法，传入具体的收费策略
    // 这里是一个简单工厂，所以工厂不一定是一个类
    public CashContext(int cashType){
        switch(cashType){
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashRebate(0.8d);
                break;
            case 3:
                this.cs = new CashRebate(0.7d);
                break;
            case 4:
                this.cs = new CashReturn(300d,100d);
                break;
        }
    }

    public double getResult(double price,int num){
        //根据收费策略的不同，获得计算结果
        return this.cs.acceptCash(price,num);
    }

}
