package com.test;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//       Person xiaoMing = new Person("小明",18);
//       String Name = xiaoMing.getName();
//       xiaoMing.setName("小红");
//       String newName = xiaoMing.getName();
//        System.out.println(newName);
        //反射实例化
//        System.out.println(Person.class);
//        Class<?> aClass = Class.forName("com.test.Person");
//        Person xiaoHong = (Person) aClass.newInstance();
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"touch", "/tmp/success"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e) {
            // do nothing
        }


    }
}
