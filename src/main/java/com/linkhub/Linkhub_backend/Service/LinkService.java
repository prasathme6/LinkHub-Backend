package com.linkhub.Linkhub_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkhub.Linkhub_backend.Model.Link;
import com.linkhub.Linkhub_backend.Model.LinkDet;
import com.linkhub.Linkhub_backend.Repository.LinkRepository;


@Service
public class LinkService {

    @Autowired
    private LinkRepository repo;

    public void collectLink(LinkDet l) {
        for(Link link : l.getLinks()) {
            link.setLinkDet(l);
        }
        repo.save(l);
    }

	public List<LinkDet> getAllProName(String name) {
		return repo.getByName(name);
	}

	public LinkDet getOne(int id) {
		return repo.findById(id).orElse(null);
	}
}
