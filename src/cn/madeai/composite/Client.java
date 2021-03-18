package cn.madeai.composite;

import cn.madeai.polymorphism.Person;
import cn.madeai.polymorphism.Student;
import cn.madeai.polymorphism.Teacher;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 16:07
 */
public class Client {
    public static void main(String[] args) {
        Team stuTeam=new Team("StudentTeam1");
        Student stu1=new Student("XiaoMing","male",202071540,"CS1class");
        Student stu2=new Student("XiaoShe","female",202071541,"CS1class");
        stuTeam.addTeam(stu1);
        stuTeam.addTeam(stu2);
        System.out.println(stuTeam.toString());

        Team teaTeam=new Team("TeacherTeam1");
        Teacher tea1=new Teacher("XiaoJun","male","CS","professional");
        Teacher tea2=new Teacher("XiaoCui","female","CS","professional");
        teaTeam.addTeam(tea1);
        teaTeam.addTeam(tea2);
        System.out.println(teaTeam.toString());

        Team team3=new Team("CS group");
        team3.addTeam(stuTeam);
        team3.addTeam(teaTeam);
        Person p1=new Person("Tom","male");
        team3.addTeam(p1);
        System.out.println(team3.toString());
    }
}
