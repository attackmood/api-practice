package com.cantaur.api.service.tour;

import com.cantaur.api.mapper.tour.TouristSiteMapper;
import com.cantaur.api.model.tour.Region;
import com.cantaur.api.model.tour.req.ReqTouristSite;
import com.cantaur.api.model.tour.res.ResTouristSite;
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

    /**
     * 관광지 리스트 조회
     * @param regionCd
     * @return List<ResTouristSite>
     */
    @Override
    public List<ResTouristSite> getTouristSiteList(String regionCd){
        ReqTouristSite reqTouristSite = new ReqTouristSite();
        reqTouristSite.setRegionCode(regionCd);
        return touristSiteMapper.getTouristSiteList(reqTouristSite);
    }

    /**
     * 관광지 상세정보 조회
     * @param touristSiteUid
     * @return ResTouristSite
     */
    @Override
    public ResTouristSite getTouristSite(Long touristSiteUid){
        ReqTouristSite reqTouristSite = new ReqTouristSite();
        reqTouristSite.setTouristSiteUid(touristSiteUid);
        ResTouristSite resTouristSite = touristSiteMapper.getTouristSite(reqTouristSite); //관광지 상세정보
        resTouristSite.setTouristSiteTagList(touristSiteMapper.getTouristSiteTagList(reqTouristSite));

        //추천 관광지 리스트
        reqTouristSite.setRegionCode(resTouristSite.getRegionCode());
        resTouristSite.setRecommendTouristSiteList(touristSiteMapper.getRecommendedTouristSiteList(reqTouristSite));
        return resTouristSite;
    }



}
