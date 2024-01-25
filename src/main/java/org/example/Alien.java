package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Alien {


    @Id
    private int aid;

    private AlienName aname;
//    private String color;
    @OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
    private Collection<Laptop> laps  = new ArrayList<>();

    public Collection<Laptop> getLaps() {
        return laps;
    }

    public void setLaps(Collection<Laptop> laps) {
        this.laps = laps;
    }

    public AlienName getAname() {
        return aname;
    }

    public void setAname(AlienName aname) {
        this.aname = aname;
    }



    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname=" + aname +
                ", laps=" + laps +
                '}';
    }
}
