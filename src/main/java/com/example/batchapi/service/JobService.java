package com.example.batchapi.service;

import com.example.batchapi.model.RequestData;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    public void launchJob(RequestData data) throws Exception {
        JobParameters params = new JobParametersBuilder()
                .addString("name", data.getName())
                .addLong("time", System.currentTimeMillis())
                .toJobParameters();

        jobLauncher.run(job, params);
    }
}
