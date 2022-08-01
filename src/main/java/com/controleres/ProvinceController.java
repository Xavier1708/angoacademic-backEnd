package com.controleres;

import com.entities.ProvinceEntity;
import com.services.ProvinceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    private final ProvinceService provinceService;

    public ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @PostMapping("/add")
    public ResponseEntity<ProvinceEntity> addProvince(@RequestBody ProvinceEntity province){
        ProvinceEntity newProvince = provinceService.addProvince(province);
        return new ResponseEntity<>(newProvince, HttpStatus.CREATED);
    }
}
