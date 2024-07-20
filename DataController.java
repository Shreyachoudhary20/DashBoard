package com.example.dashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping("/intensity")
    public List<IntensityData> getIntensityData() {
        return List.of(
            new IntensityData("1", 6, "Environment", "oil"),
            new IntensityData("2", 8, "Financial services", "policy")
           // Add data
        );
    }
}
