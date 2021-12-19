package br.com.arthurschultz.bands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(columnDefinition = "varchar(80) not null")
    private String Name;
    @Column(nullable = false)
    private Genre Genre;

    public Band() {
    }

    public Band(int Id, String Name, Genre Genre) {
        this.Id = Id;
        this.Name = Name;
        this.Genre = Genre;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Genre getGenre() {
        return this.Genre;
    }

    public void setGenre(Genre Genre) {
        this.Genre = Genre;
    }
}
