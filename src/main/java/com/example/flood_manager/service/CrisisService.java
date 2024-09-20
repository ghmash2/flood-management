package com.example.flood_manager.service;

import com.example.flood_manager.domain.entity.Crisis;
import com.example.flood_manager.repository.CrisisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CrisisService {
    private final CrisisRepository crisisRepository;

    public Crisis createCrisis(Crisis crisis)
    {
        Crisis response = crisisRepository.save(crisis);
        return response;
    }

    public List<Crisis> getAllCrisis()
    {
        List<Crisis> response = crisisRepository.findAll();
        return response;
    }
}
