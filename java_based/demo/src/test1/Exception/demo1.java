package test1.Exception;

public class demo1 {
    public static void main(String[] args) throws MyException{
        int a=100;
        int b=0;
        if(b==0){
            throw new MyException("分母不能为0");
        }
    }
}

class MyException extends Exception{
    public MyException(){
    }
    public MyException(String gripe){
        super(gripe);
    }
}



