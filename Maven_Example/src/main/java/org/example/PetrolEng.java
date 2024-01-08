package org.example;

public class PetrolEng implements IEngine{

    public PetrolEng(){
        System.out.println("Petrol Engine :: Constructor");
    }

    @Override
    public boolean start() {
        System.out.println("Petrol Engine starting...");
        return true;
    }
}
