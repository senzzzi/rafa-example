package repository;

import model.persistence.PersistenceProfile;

import java.util.ArrayList;
import java.util.List;

public class MemoryProfileRepository implements ProfileRepository{

    private final List<PersistenceProfile> persistenceProfileList = new ArrayList<>();

    public MemoryProfileRepository() {
        persistenceProfileList.add(new PersistenceProfile("Administrator"));
    }

    @Override
    public PersistenceProfile createNewProfile(String profileName) {

        PersistenceProfile newPersistenceProfile = new PersistenceProfile(profileName);

        newPersistenceProfile.setId("very secret");

        PersistenceProfile existingPersistenceProfile = getProfileByName(profileName);
        if (existingPersistenceProfile == null) {
            persistenceProfileList.add(newPersistenceProfile);
            return newPersistenceProfile;
        } else {
            // isto ou erro
            // throw new ProfileAlreadyExistsException();
            return existingPersistenceProfile;
        }
    }

    @Override
    public PersistenceProfile getProfileByName(String profileName) {
        return null;
    }
}
