package com.services;


import com.entities.ProvinceEntity;
import com.repositories.ProvinceRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProvinceService {

    private final ProvinceRepository provinceRepository;

    public ProvinceService(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public ProvinceEntity addProvince(ProvinceEntity province){
        province.setProvinceCode(UUID.randomUUID().toString());
        return provinceRepository.save(province);
    }
}
