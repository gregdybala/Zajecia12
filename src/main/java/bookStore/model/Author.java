package bookStore.model;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Author implements Comparable<Author>{

    private String lastName;
    private String firstName;
    private UUID id;


    public Author(String lastName, String firstName, UUID id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getId(), author.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName);
    }
}
