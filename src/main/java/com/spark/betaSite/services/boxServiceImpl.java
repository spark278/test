package com.spark.betaSite.services;

import com.spark.betaSite.web.dto.boxDTO;
import com.spark.betaSite.exceptions.ResourceNotFoundException;
import com.spark.betaSite.jpaRepository.boxRepository;
import com.spark.betaSite.services.Impl.BoxService;
import com.spark.betaSite.models.Box;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class boxServiceImpl implements BoxService {

    private boxRepository boxRepository;


    @Override
    public List<Box> getList() {
        return boxRepository.findAll();
    }

    @Override
    public Box saveBox(boxDTO boxDTO) {
        return boxRepository.save(Box.builder()
                .company_name(boxDTO.getCompany_name())
                .company_phone(boxDTO.getCompany_phone())
                .build());
    }

    @Override
    public Box removeBox(Long Id) {
        return null;
    }

    @Override
    public Box getById(Long Id) {
        return boxRepository.findById(Id).orElseThrow(
                () -> new ResourceNotFoundException(Id + " ID Not found")

        );
    }
}
