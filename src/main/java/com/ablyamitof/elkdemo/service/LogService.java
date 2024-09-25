package com.ablyamitof.elkdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LogService {
    public void generateLogInfo(Long count){
        for (long i = 1; i <= count; i++) {
            log.info("Log info message number: {}", i);
        }
    }
    public void generateLogWarn(Long count){
        for (long i = 1; i <= count; i++) {
            log.warn("Log warn message number: {}", i);
        }
    }
    public void generateLogError(Long count){
        for (long i = 1; i <= count; i++) {
            log.error("АААААААААААААААААА ОШИБКА ОШИБКА ОШБИДЖОАВЛЫАОЛДЫВОАРЛДВРОЫАО: {}", i);
        }
    }
}
