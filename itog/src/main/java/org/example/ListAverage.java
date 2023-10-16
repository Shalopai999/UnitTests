package org.example;

import java.util.List;

public class ListAverage {
    private static List<Integer> list1;
    private static List<Integer> list2;

    public ListAverage(List<Integer> list1, List<Integer> list2){
        this.list1 = list1;
        this.list2 = list2;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public void setList1(List<Integer> list1) {
        this.list1 = list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void setList2(List<Integer> list2) {
        this.list2 = list2;
    }

    public static int List1Average(){
        int n1 = (list1.stream().reduce(Integer::sum).get()) / list1.size();
        return n1;
    }

    public static int List2Average(){
        int n2 = (list2.stream().reduce(Integer::sum).get()) / list2.size();
        return n2;
    }

    public static String comparison(){
        if (List1Average() > List2Average()) return "Среднее значение первого списка больше, чем второго";
        else if (List1Average() < List2Average()) return "Среднее значение второго списка больше, чем первого";
        else return "Средние значения обоих списков равны";
    }
}
