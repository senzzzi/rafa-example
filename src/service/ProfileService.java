package service;

import repository.ProfileRepository;

public class ProfileService {

    private ProfileRepository profileRepository;
    private AccountService accountService;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }


}
