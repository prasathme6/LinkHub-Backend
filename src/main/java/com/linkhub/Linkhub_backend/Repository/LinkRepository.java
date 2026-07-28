package com.linkhub.Linkhub_backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linkhub.Linkhub_backend.Model.LinkDet;

@Repository
public interface LinkRepository extends JpaRepository<LinkDet, Integer>{
	List<LinkDet> getByName(String name);
}
