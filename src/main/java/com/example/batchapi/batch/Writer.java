package com.example.batchapi.batch;

import org.springframework.batch.item.ItemWriter;
import java.util.List;

public class Writer implements ItemWriter<String> {
    @Override
    public void write(List<? extends String> items) {
        items.forEach(System.out::println);
    }
}
