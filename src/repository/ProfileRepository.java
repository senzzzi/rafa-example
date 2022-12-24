package repository;

import model.persistence.PersistenceProfile;

public interface ProfileRepository {

    PersistenceProfile createNewProfile(String profileName);

    PersistenceProfile getProfileByName(String profileName);

}
