package com.cloud.storage.controller;


import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;


@RestController
@RequestMapping("/storage")
public class StorageController {


private final File storageFolder = new File("data");


public StorageController(){
if(!storageFolder.exists()) storageFolder.mkdirs();
}


@PostMapping("/upload")
public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws Exception {
File target = new File(storageFolder, file.getOriginalFilename());
try (OutputStream os = new FileOutputStream(target)){
os.write(file.getBytes());
}
return ResponseEntity.ok("Stored:" + target.getName());
}


@GetMapping("/download/{name}")
public ResponseEntity<Resource> download(@PathVariable String name) throws Exception{
File f = new File(storageFolder, name);
if(!f.exists()) return ResponseEntity.notFound().build();
InputStreamResource r = new InputStreamResource(new FileInputStream(f));
return ResponseEntity.ok().body(r);
}
}