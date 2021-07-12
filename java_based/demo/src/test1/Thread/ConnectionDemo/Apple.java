package test1.Thread.ConnectionDemo;

//资源类
public class Apple {
    private boolean flag=true;
    //设置资源状态
    public void setFlag(boolean flag){
        this.flag=flag;
    }
    //获取资源状态
    public boolean getFlag(){
        return this.flag;
    }
}
