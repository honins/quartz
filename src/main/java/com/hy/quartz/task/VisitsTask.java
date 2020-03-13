package com.hy.quartz.task;

import org.springframework.stereotype.Component;

/**
 * @author Zheng Jie
 * @date 2018-12-25
 */
@Component
public class VisitsTask {

    private final VisitsService visitsService;

    public void run(){
        visitsService.save();
    }
}
