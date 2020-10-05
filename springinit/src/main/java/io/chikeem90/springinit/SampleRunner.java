package io.chikeem90.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Autowired
    DoyeonProperties doyeonProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============================");
        System.out.println(doyeonProperties.getName());
        System.out.println(doyeonProperties.getAge());
        System.out.println(doyeonProperties.getSessionTimeout());
        System.out.println("============================");
    }
}
