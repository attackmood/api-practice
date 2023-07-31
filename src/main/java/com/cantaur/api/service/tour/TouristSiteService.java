package com.cantaur.api.service.tour;

import com.cantaur.api.model.tour.Region;
import com.cantaur.api.model.tour.res.ResTouristSite;

import java.util.List;


public interface TouristSiteService {

    List<Region> getRegionList();

    List<ResTouristSite> getTouristSiteList(String regionCd);

    ResTouristSite getTouristSite(Long touristSiteUid);
}
