package org.example;

public class Car {

    public IEngine iEngine;

    public Car(IEngine iEngine) {
        this.iEngine = iEngine;
    }
    public void drive(){
         boolean status=iEngine.start();
         if (status){
             System.out.println("Journey  started....");
         }
         else {
             System.out.println("Journey  not started....");
         }

    }


}
