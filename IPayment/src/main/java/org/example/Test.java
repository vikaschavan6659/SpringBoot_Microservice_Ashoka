package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
//         PetrolEngine petrolEngine=context.getBean(PetrolEngine.class);
         DieselEngine dieselEngine=context.getBean(DieselEngine.class);
//         petrolEngine.startEngine(234);
         dieselEngine.startEngine(143);

         StartEngineBy startEngineBy=new StartEngineBy(dieselEngine);
         startEngineBy.statTheEngine(10);
    }
}
