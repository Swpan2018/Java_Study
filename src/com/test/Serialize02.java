package com.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Serialize02 {
    public static void main(String[] args) throws IOException {
        //创建一个ByteArrayOutputStream流,这个的作用是，可以将字节流写入多个流中
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        //用来序列化的
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
        //实例化
        Student stu = new Student(35,"601",18,"Mike");
        //序列化并输出到字节数组流中,就是将stu 写入到arrayOutputStream中
        objectOutputStream.writeObject(stu);
        //上面已经完成序列化了，然后访问字节数组流对象的toByteArray 将序列化内容转为字节数组
        //因为stu已经写入到了arrayOutputStream中，所以也是用arrayOutputStream用来输出字节
        byte[] bytes = arrayOutputStream.toByteArray();
        //获取encode对象,目的是，后面要用来base64编码
        Base64.Encoder encoder = Base64.getEncoder();
        String str = encoder.encodeToString(bytes);
        System.out.println(str);
        objectOutputStream.close();
        arrayOutputStream.close();

        //把base编码进行反序列化
        String b64 = "rO0ABXNyABBjb20udGVzdC5TdHVkZW50bzAC0+bGqI0CAAVJAANhZ2VJAAZudW1iZXJMAAtjbGFzc251bWJlcnQAEkxqYXZhL2xhbmcvU3RyaW5nO0wABG5hbWVxAH4AAUwAA3NleHEAfgABeHAAAAASAAAAI3QAAzYwMXQABE1pa2Vw";
        //创建一个base64解码









    }
}
