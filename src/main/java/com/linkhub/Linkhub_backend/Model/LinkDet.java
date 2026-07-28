package com.linkhub.Linkhub_backend.Model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class LinkDet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String proName;
    private String name;
    private String description;

    @OneToMany(mappedBy = "linkDet",
               cascade = CascadeType.ALL,
               orphanRemoval = true)
    @JsonManagedReference
    private List<Link> links = new ArrayList<>();

    public LinkDet() {
    }

    public LinkDet(String proName, String name, String description) {
        this.proName = proName;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
        links.add(link);
        link.setLinkDet(this);
    }

    public void removeLink(Link link) {
        links.remove(link);
        link.setLinkDet(null);
    }
}