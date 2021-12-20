package br.com.arthurschultz.bands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(columnDefinition = "varchar(80) not null")
    private String Name;
    @Column(columnDefinition = "varchar(80) not null")
    private String Band;

    public Album() {
    }


    public Album(int Id, String Name, String Band) {
        this.Id = Id;
        this.Name = Name;
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

    public String getBand() {
        return this.Band;
    }

    public void setBand(String Band) {
        this.Band = Band;
    }

}
