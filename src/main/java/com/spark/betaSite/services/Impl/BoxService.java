package com.spark.betaSite.services.Impl;

import com.spark.betaSite.web.dto.boxDTO;
import com.spark.betaSite.models.Box;

import java.util.List;

public interface BoxService {

    public List<Box> getList();
    public Box saveBox(boxDTO boxDTO);
    public Box removeBox(Long Id);
    public Box getById(Long Id);
}
