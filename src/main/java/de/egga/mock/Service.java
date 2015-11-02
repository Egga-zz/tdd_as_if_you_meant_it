package de.egga.mock;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void persist(String value) {
        repository.persist(value);
    }

    public String fetch() {
        return repository.fetch();
    }
}
