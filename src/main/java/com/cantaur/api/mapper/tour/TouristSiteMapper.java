package com.cantaur.api.mapper.tour;

import com.cantaur.api.model.member.Region;
import com.cantaur.api.model.member.req.ReqTouristSite;
import com.cantaur.api.model.member.res.ResRecommendTouristSite;
import com.cantaur.api.model.member.res.ResTouristSite;
import com.cantaur.api.model.member.res.ResTouristSiteTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TouristSiteMapper {
    List<Region> getRegionList();
    List<ResTouristSite> getTouristSiteList(ReqTouristSite reqTouristSite);
    ResTouristSite getTouristSite(ReqTouristSite reqTouristSite);
    List<ResTouristSiteTag> getTouristSiteTagList(ReqTouristSite reqTouristSite);
    List<ResRecommendTouristSite> getRecommendedTouristSiteList(ReqTouristSite reqTouristSite);


}
