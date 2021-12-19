package br.com.arthurschultz.bands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Albuns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(columnDefinition = "varchar(80) not null")
    private String Name;
    @Column(nullable = false)
    private int IdBand;

    public Albuns() {
    }

    public Albuns(int id, String name) {
        Id = id;
        Name = name;
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
}
