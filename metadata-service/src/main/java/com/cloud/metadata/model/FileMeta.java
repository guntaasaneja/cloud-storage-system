package com.cloud.metadata.model;


import jakarta.persistence.*;


@Entity
public class FileMeta {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String filename;
private Long size;
private String checksum;
private String location; // e.g. storage-node-1:/data/abc


// getters/setters
public Long getId(){ return id; }
public void setId(Long id){ this.id = id; }
public String getFilename(){ return filename; }
public void setFilename(String filename){ this.filename = filename; }
public Long getSize(){ return size; }
public void setSize(Long size){ this.size = size; }
public String getChecksum(){ return checksum; }
public void setChecksum(String checksum){ this.checksum = checksum; }
public String getLocation(){ return location; }
public void setLocation(String location){ this.location = location; }
}