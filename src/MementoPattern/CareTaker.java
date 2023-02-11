package MementoPattern;

import util.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();

    public void push(Memento memento){
        mementoList.add(memento);
        System.out.println("Push content: "+ListUtil.getLast(mementoList).getContent());
    }
    public Memento pop(){
        ListUtil.removeLast(mementoList);
        System.out.println("Last content after pop: "+ListUtil.getLast(mementoList).getContent());
        return ListUtil.getLast(mementoList);
    }
}
