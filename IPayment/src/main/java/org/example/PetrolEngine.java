package org.example;

public class PetrolEngine implements IEngine{
    public PetrolEngine() {
        System.out.println("PetrolEngine :: Constructor");
    }

    @Override
    public boolean startEngine(int input) {
        System.out.println("Petrol engine started.....  ");
        return true;
    }
}
