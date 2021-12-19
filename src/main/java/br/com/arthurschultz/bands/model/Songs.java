package br.com.arthurschultz.bands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(columnDefinition = "varchar(80) not null")
    private String Name;
    @Column(nullable = false)
    private int IdAlbum;


    public Songs() {
    }

    public Songs(int Id, String Description) {
        this.Id = Id;
        this.Name = Description;
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

    public int getIdAlbum() {
        return this.IdAlbum;
    }

    public void setIdAlbum(int IdAlbum) {
        this.IdAlbum = IdAlbum;
    }

}
