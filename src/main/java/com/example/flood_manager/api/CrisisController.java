package com.example.flood_manager.api;

import com.example.flood_manager.domain.entity.Crisis;
import com.example.flood_manager.service.CrisisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CrisisController {
    private final CrisisService crisisService;

    @PostMapping("/create/crisis")
    public Crisis createCrisis(@RequestBody Crisis crisis)
    {
        Crisis response = crisisService.createCrisis(crisis);
        return response;
    }

    @GetMapping("/get/crisis")
    public List<Crisis> getAllCrisis()
    {
        List<Crisis> response = crisisService.getAllCrisis();
        return response;
    }
}
