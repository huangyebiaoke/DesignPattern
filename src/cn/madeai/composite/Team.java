package cn.madeai.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <a href="mailto:huangyebiaoke@outlook.com">huang</a> on 2021/3/18 16:00
 */
public class Team implements ITeam{
    private String teamName;
    private List<ITeam> people=new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        String str="teamName="+teamName+" -> ";
        for (ITeam person:people) {
            str+=person.toString()+"\t";
        }
        return str;
    }
    public void addTeam(ITeam team){
        people.add(team);
    }
    public void removeTeam(ITeam team){
        people.remove(team);
    }
}
