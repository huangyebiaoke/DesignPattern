package cn.madeai.polymorphism;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 12:39
 */
public class Student extends Person{
    private Integer stuNum;
    private String className;
    public Student(String name, String sex, Integer stuNum, String className) {
        super(name, sex);
        this.stuNum = stuNum;
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString()+" student: stuNum="+stuNum+" className="+className;
    }
}
