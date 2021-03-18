package cn.madeai.polymorphism;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 12:40
 */
public class Teacher extends Person{
    private String department;
    private String title;


    public Teacher(String name, String sex, String department, String title) {
        super(name, sex);
        this.department = department;
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+" teacher: department="+department+" title="+title;
    }
}
