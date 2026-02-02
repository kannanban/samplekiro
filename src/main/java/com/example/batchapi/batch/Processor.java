package com.example.batchapi.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {
    @Override
    public String process(String item) {
        if (item == null) return null;
        return item.toUpperCase();
    }
}
