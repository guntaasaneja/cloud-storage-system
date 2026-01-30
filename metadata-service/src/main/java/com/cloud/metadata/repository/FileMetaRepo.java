package com.cloud.metadata.repository;


import com.cloud.metadata.model.FileMeta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileMetaRepo extends JpaRepository<FileMeta, Long> {
}