package com.linkhub.Linkhub_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linkhub.Linkhub_backend.Model.LinkDet;
import com.linkhub.Linkhub_backend.Service.LinkService;

@RestController
@CrossOrigin
public class LinkController {
	
	@Autowired
	private LinkService service;
	
	@PostMapping("/links")
	public void collectLink(@RequestBody LinkDet l) {
		service.collectLink(l);
	}
	
	@GetMapping("/projects")
	public List<LinkDet> getProName(@RequestParam String name) {
		return service.getAllProName(name);
	}
	
	@GetMapping("/addlink/profile/{id}")
	public LinkDet getOne(@PathVariable int id) {
		return service.getOne(id);
	}
}
