package br.com.arthurschultz.bands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(columnDefinition = "varchar(80) not null")
    private String Name;
    @Column(columnDefinition = "varchar(80) not null")
    private String Album;
    @Column(columnDefinition = "varchar(80) not null")
    private String Band;

    public Song() {
    }

    public Song(int Id, String Name, String Album, String Band) {
        this.Id = Id;
        this.Name = Name;
        this.Album = Album;
        this.Band = Band;
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

    public String getAlbum() {
        return this.Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getBand() {
        return this.Band;
    }

    public void setBand(String Band) {
        this.Band = Band;
    }

}
