package com.example.flood_manager.api;

import com.example.flood_manager.domain.entity.Donation;
import com.example.flood_manager.service.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DonationController {
    private final DonationService donationService;

    @GetMapping("/get/donation")
    public List<Donation> getAllDonation()
    {
        List<Donation> response = donationService.getAllDonation();
        return response;
    }

    @PostMapping("/create/donation")
    public Donation createDonation(@RequestBody Donation donation)
    {
        Donation response = donationService.createDonation(donation);
        return response;
    }
}
