package org.example;

public class StartEngineBy {
    public StartEngineBy() {
        System.out.println("StartEngineBy :: Constructor");
    }
    IEngine iEngine;
    public StartEngineBy (IEngine iEngine){
        this.iEngine=iEngine;
        System.out.println("Created object for " +iEngine.getClass().getName());
    }

    public void setEngine(IEngine engine) {
        System.out.println("Called setteer Method ");
        this.iEngine = engine;
    }

    public void statTheEngine(int input){
        System.out.println("Starting Engine of type "+ iEngine.getClass().getName());
        System.out.println("==========");
        iEngine.startEngine(input);
    }
}
