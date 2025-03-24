package section02_策略模式.demo02_策略模式实现收银软件;

import section02_策略模式.demo02_策略模式实现收银软件.CashSuper;

/**
 * @description: TODO
 * @author: zhqihang
 * @date: 2025/03/24
 */
public class CashContext {


    private CashSuper cs;   //声明一个CashSuper对象

    //通过构造方法，传入具体的收费策略
    public CashContext(CashSuper csuper){
        this.cs = csuper;
    }

    public double getResult(double price,int num){
        //根据收费策略的不同，获得计算结果
        return this.cs.acceptCash(price,num);
    }

}
