package com.linkhub.Linkhub_backend.Model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String url;

    @ManyToOne
    @JoinColumn(name = "linkdet_id")
    @JsonBackReference
    private LinkDet linkDet;

    public Link() {
    }

    public Link(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LinkDet getLinkDet() {
        return linkDet;
    }

    public void setLinkDet(LinkDet linkDet) {
        this.linkDet = linkDet;
    }
}