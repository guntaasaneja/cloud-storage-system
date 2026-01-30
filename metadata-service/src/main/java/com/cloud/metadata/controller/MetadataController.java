package com.cloud.metadata.controller;


import com.cloud.metadata.model.FileMeta;
import com.cloud.metadata.repository.FileMetaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/meta")
public class MetadataController {


@Autowired
private FileMetaRepo repo;


@PostMapping
public FileMeta save(@RequestBody FileMeta m){
return repo.save(m);
}


@GetMapping("/{id}")
public FileMeta get(@PathVariable Long id){
return repo.findById(id).orElseThrow();
}
}