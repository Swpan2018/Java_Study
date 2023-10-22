package com.test;

public class Women {
    //属性
    private String name;
    private String xiongwei;

    public Women(String NAME,String XIONGWEI){
        this.name = NAME;
        this.xiongwei = XIONGWEI;
    }

    //方法
    //自我介绍
    public void ziwojieshao(){
        System.out.println("我叫"+this.name+"我的胸围是"+this.xiongwei);
    }

    public String getName() {
        return name;
    }

    public String getXiongwei() {
        return xiongwei;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXiongwei(String xiongwei) {
        this.xiongwei = xiongwei;
    }


}
