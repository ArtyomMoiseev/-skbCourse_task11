package com.example.skb_course_hw6.metric;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TimeMetricIncrement {

    Counter mainCounter;

    public TimeMetricIncrement(MeterRegistry meterRegistry) {
        this.mainCounter = meterRegistry.counter("custom.counter.time");
    }

    @Scheduled(fixedDelay = 5000)
    public void incrementCounter() {
        mainCounter.increment(1);
    }

}
