package com.cantaur.api.touristsite.service;

import com.cantaur.api.touristsite.mapper.TouristSiteMapper;
import com.cantaur.api.touristsite.model.Region;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TouristSiteServiceImpl implements TouristSiteService{
    final TouristSiteMapper touristSiteMapper;

    @Override
    public List<Region> getRegionList(){
        return touristSiteMapper.getRegionList();
    }
}
