package com.zhenhao.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler2Task {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM:SS");

    public void reportCurrentTime(){
        System.out.println("now time" + dateFormat.format(new Date()));
    }

}
