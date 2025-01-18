package com.sri.EchoHub.service;


import com.sri.EchoHub.model.AppUser;
import com.sri.EchoHub.model.AppUserRepo;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private AppUserRepo appUserRepo;

    public AppUserService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public String addUser(AppUser appUser)
    {
        appUserRepo.save(appUser);
        return "user is saved suuc";
    }
}
