package com.cantaur.api.service.tour;

import com.cantaur.api.mapper.tour.TouristSiteMapper;
import com.cantaur.api.model.member.Region;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TouristSiteServiceImpl implements TouristSiteService{
    final TouristSiteMapper touristSiteMapper;

    /**
     * 울산의 구군리스트를 조회
     * @return List<Region>
     */
    @Override
    public List<Region> getRegionList(){
        return touristSiteMapper.getRegionList();
    }


}
