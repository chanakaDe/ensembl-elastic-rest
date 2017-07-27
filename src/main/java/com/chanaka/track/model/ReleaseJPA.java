package com.chanaka.track.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by chanaka on 7/27/17.
 */

@Entity
@Table(name = "release")
public class ReleaseJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "release_id")
    private Integer release_id;

    @Size(max = 45)
    @Column(name = "release_division")
    private String release_division;

    @Size(max = 50)
    @Column(name = "release_version")
    private String release_version;

    public ReleaseJPA(String release_division, String release_version) {
        this.release_division = release_division;
        this.release_version = release_version;
    }

    public Integer getRelease_id() {
        return release_id;
    }

    public void setRelease_id(Integer release_id) {
        this.release_id = release_id;
    }

    public String getRelease_division() {
        return release_division;
    }

    public void setRelease_division(String release_division) {
        this.release_division = release_division;
    }

    public String getRelease_version() {
        return release_version;
    }

    public void setRelease_version(String release_version) {
        this.release_version = release_version;
    }

    @Override
    public String toString() {
        return "ReleaseJPA{" +
                "release_id=" + release_id +
                ", release_division='" + release_division + '\'' +
                ", release_version='" + release_version + '\'' +
                '}';
    }
}
