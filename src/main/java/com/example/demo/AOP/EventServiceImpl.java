package com.example.demo.AOP;

import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @PerfLogging
    @Override
    public void createEvent() {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Created Event!");
    }

    @Override
    public void publishEvent() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Published Event!");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleted Event!");
    }
}
