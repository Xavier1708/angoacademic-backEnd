package com.controleres;

import com.dtos.ApplicationDTO;
import com.entities.ApplicationEntity;
import jdk.dynalink.beans.BeansLinker;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/application")
public class ApplicationController {


    @PostMapping("/add")
    public ResponseEntity<Object> save (@RequestBody @Valid ApplicationDTO dto){
        var newApplication = new ApplicationEntity();
        BeanUtils.copyProperties(dto,newApplication);
        return ResponseEntity.ok().body(newApplication);
    }
}
