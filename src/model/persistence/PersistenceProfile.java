package model.persistence;

public class PersistenceProfile {

    private String id;
    private String name;


    public PersistenceProfile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
