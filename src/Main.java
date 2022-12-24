import repository.MemoryProfileRepository;
import service.ProfileService;

public class Main {

    public static void main(String[] args) {
        ProfileService profileService = new ProfileService(new MemoryProfileRepository());
        profileService.createProfile();

    }


}

