package com.example.batchapi.controller;

import com.example.batchapi.model.RequestData;
import com.example.batchapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/start")
    public String startJob(@RequestBody RequestData data) throws Exception {
        jobService.launchJob(data);
        return "Batch Job Started";
    }
}
