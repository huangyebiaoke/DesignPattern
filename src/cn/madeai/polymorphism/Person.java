package cn.madeai.polymorphism;

import cn.madeai.composite.ITeam;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 12:30
 */
public class Person implements ITeam {
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "person: name="+name+" sex="+sex;
    }
}
