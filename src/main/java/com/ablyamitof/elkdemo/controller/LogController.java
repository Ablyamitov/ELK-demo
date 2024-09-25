package com.ablyamitof.elkdemo.controller;

import com.ablyamitof.elkdemo.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {
    private final LogService logService;
    @GetMapping("log-info/generate/{count}")
    private ResponseEntity<Void> generateLogInfo(@PathVariable Long count){
        logService.generateLogInfo(count);
        return ResponseEntity.ok().build();
    }
    @GetMapping("log-warn/generate/{count}")
    private ResponseEntity<Void> generateLogWarn(@PathVariable Long count){
        logService.generateLogWarn(count);
        return ResponseEntity.ok().build();
    }
    @GetMapping("log-error/generate/{count}")
    private ResponseEntity<Void> generateLogError(@PathVariable Long count){
        logService.generateLogError(count);
        return ResponseEntity.ok().build();
    }
}
