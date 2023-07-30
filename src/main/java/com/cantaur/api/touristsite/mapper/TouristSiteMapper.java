package com.cantaur.api.touristsite.mapper;

import com.cantaur.api.touristsite.model.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TouristSiteMapper {
    List<Region> getRegionList();
}
