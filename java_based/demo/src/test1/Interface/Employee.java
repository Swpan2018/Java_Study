package test1.Interface;

public class Employee implements Comparable<Employee>{
    private  String name;
    private double salary;

    public Employee(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100;
    }

    //重写接口中的方法
    public int compareTo(Employee other){
        return Double.compare(salary,other.salary);
    }
}


