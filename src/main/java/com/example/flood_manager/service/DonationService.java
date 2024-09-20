package com.example.flood_manager.service;

import com.example.flood_manager.domain.entity.Donation;
import com.example.flood_manager.repository.DonationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public List<Donation> getAllDonation()
    {
        List<Donation> response = donationRepository.findAll();
        return response;
    }

    public Donation createDonation(Donation donation)
    {
        Donation response = donationRepository.save(donation);
        return response;
    }
}
