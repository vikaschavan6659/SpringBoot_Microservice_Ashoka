package org.example;

public class DieselEngine implements IEngine{
    public DieselEngine() {
        System.out.println("DieselEngine :: Constructor");
    }

    @Override
    public boolean startEngine(int input) {
        System.out.println("Diesel Engine Stated....");
        return true;
    }
}
