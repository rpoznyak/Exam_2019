package Exam_2019;

import java.util.*;

public class CheckTwoVariables {

    private int var1 = 1;
    private int var2 = 2;

    public CheckTwoVariables(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public CheckTwoVariables() {
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public void printVar1() {
        System.out.println("Значение первой переменной: " + var1);
    }

    public void printVar2() {
        System.out.println("Значение второй переменной: " + var2);
    }

    public int varSum() {
        return var1 + var2;
    }

    public int maxVar() {
        List<Integer> list = new ArrayList<>();
        list.add(var1);
        list.add(var2);
        Collections.sort(list);
        return list.get(1);
    }

    public static void main(String[] args) {
        CheckTwoVariables someVar = new CheckTwoVariables(4, 5);
        someVar.setVar1(1);

        someVar.printVar1();
        someVar.printVar2();
        System.out.println("Cумма значений переменных: " + someVar.varSum());
        System.out.println("Наибольшее значение из двух переменных: " + someVar.maxVar());
    }

}
